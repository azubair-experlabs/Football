package com.experlabs.footballnews.gallery.viewmodels

import android.graphics.Bitmap
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.experlabs.footballnews.gallery.repository.GalleryRepository
import com.experlabs.footballnews.portal.models.Picture
import kotlinx.coroutines.launch

class GalleryViewModel(private val repository: GalleryRepository) : ViewModel() {

    val pictures : LiveData<ArrayList<Picture>>
        get() = repository.pictures

    fun getPicturesFromRepository(callback: (Boolean, String) -> Unit){
        viewModelScope.launch {
            repository.getPictures {flag, message ->
                response(flag, message, callback)
            }
        }
    }

    fun savePictureInRepository(name : String, bitmap: Bitmap, callback: (Boolean, String) -> Unit){
        viewModelScope.launch {
            repository.saveToInternalStorage(name, bitmap) {flag, message ->
                response(flag, message, callback)
            }
        }
    }
    private fun response(flag: Boolean, message: String, callback: (Boolean, String) -> Unit) {
        callback(flag, message)
    }
}