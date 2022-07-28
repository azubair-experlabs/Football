package com.experlabs.footballnews.gallery.repository

import android.content.ContentValues
import android.content.Context
import android.graphics.Bitmap
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.experlabs.footballnews.portal.models.Picture
import com.experlabs.footballnews.portal.models.Player
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStream
import java.lang.Exception
import java.util.*
import kotlin.collections.ArrayList

class GalleryRepository(private val context: Context, private val database: FirebaseDatabase, private val storage: FirebaseStorage) {

    private val picturesLiveData = MutableLiveData<ArrayList<Picture>>()

    val pictures: LiveData<ArrayList<Picture>> get() = picturesLiveData

    suspend fun getPictures(callback: (Boolean, String) -> Unit) {

        val pics_array = ArrayList<Picture>()

        database.getReference("/pictures").get().addOnSuccessListener {
            it.children.forEach { doc ->
                val picture = doc.getValue(Picture::class.java)
                picture?.let {
                    pics_array.add(it)
                }
            }
            picturesLiveData.postValue(pics_array)
            callback(true, "Pictures Fetched Successfully")

        }.addOnFailureListener {
            callback(true, "Storage Error")
        }
    }

    suspend fun saveToInternalStorage(name : String, bitmapImage: Bitmap, callback: (Boolean, String) -> Unit) {
        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.Q) {
            try {
                val resolver = context.contentResolver
                val contentValues = ContentValues()
                contentValues.put(MediaStore.MediaColumns.DISPLAY_NAME, name)
                contentValues.put(MediaStore.MediaColumns.MIME_TYPE, "image/jpeg")
                contentValues.put(
                    MediaStore.MediaColumns.RELATIVE_PATH,
                    Environment.DIRECTORY_PICTURES + File.separator + "Football" + File.separator + name)
                val imageuri = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
                var fos = resolver.openOutputStream(Objects.requireNonNull(imageuri!!))
                bitmapImage.compress(Bitmap.CompressFormat.JPEG, 100, fos)
                Objects.requireNonNull<OutputStream?>(fos)
                callback(true, "Saved to /Pictures/Football/${name}")
            }
            catch(e: Exception) {
                callback(false, "Picture not saved!")
            }
        } else {
            val directory = File(Environment.DIRECTORY_PICTURES, "Football/$name")

            if (!directory.exists()) directory.mkdirs()

            val mypath = File(directory, "$name.jpeg")
            var fos: FileOutputStream? = null
            try {
                fos = FileOutputStream(mypath)

                bitmapImage.compress(Bitmap.CompressFormat.JPEG, 100, fos)
            } catch (e: Exception) {
                callback(false, "Picture not saved!")
            } finally {
                try {
                    fos?.close()
                    callback(true, "Image Saved to gallery")
                } catch (e: IOException) {
                    callback(false, "Picture not saved!")
                }
            }
        }
    }
}
