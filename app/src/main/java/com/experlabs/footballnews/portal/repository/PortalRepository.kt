package com.experlabs.footballnews.portal.repository

import android.graphics.Bitmap
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.experlabs.footballnews.fcm.services.FirebaseMessagingService
import com.experlabs.footballnews.portal.models.News
import com.experlabs.footballnews.portal.models.Picture
import com.experlabs.footballnews.portal.models.Player
import com.experlabs.footballnews.portal.models.Team
import com.experlabs.footballnews.weather.models.WeatherData
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.ByteArrayOutputStream

class PortalRepository(
    private val database: FirebaseDatabase,
    private val storage: FirebaseStorage,
    private val messagingService: FirebaseMessagingService
) {

    private val playersLiveData = MutableLiveData<ArrayList<Player>>()

    val players: LiveData<ArrayList<Player>> get() = playersLiveData

    suspend fun postNews(news: News, callback: (Boolean, String) -> Unit) {
        database.getReference("/news").push().setValue(news).addOnSuccessListener {
            messagingService.sendNotification(news.title)
            callback(true, "News Posted Successfully")
        }.addOnFailureListener {
            callback(false, "Failed")
        }
    }

    suspend fun postTeam(team: Team, callback: (Boolean, String) -> Unit) {
        database.getReference("/teams").push().setValue(team).addOnSuccessListener {
            callback(true, "Team Added Successfully")
        }.addOnFailureListener {
            callback(false, "Failed")
        }
    }

    suspend fun postPlayer(player: Player, callback: (Boolean, String) -> Unit) {
        database.getReference("/players").push().setValue(player).addOnSuccessListener {
            callback(true, "Player Added Successfully")
        }.addOnFailureListener {
            callback(false, "Failed")
        }
    }

    suspend fun postPicture(bitmap: Bitmap, picture: Picture, callback: (Boolean, String) -> Unit) {
        val baos = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 95, baos)
        val data = baos.toByteArray()

        val uploadTask = storage.reference.child(picture.path).putBytes(data)
        uploadTask.addOnFailureListener {
            callback(false, "Error Uploading to Firebase")

        }.addOnSuccessListener { snapshot ->
            snapshot.storage.downloadUrl.addOnSuccessListener {

                val final = Picture(picture.id, picture.name, it.toString())

                database.getReference("pictures").child(picture.id).setValue(final)
                    .addOnSuccessListener {
                        callback(true, "Uploaded Successfully!")
                    }
            }.addOnFailureListener {
                callback(false, "Error Fetching path")
            }
        }
    }

    suspend fun getPlayers(callback: (Boolean, String) -> Unit) {
        val players_array = ArrayList<Player>()
        database.getReference("/players").get().addOnSuccessListener { snapshot ->
            snapshot.children.forEach { child ->
                val player = child.getValue(Player::class.java)
                player?.let {
                    players_array.add(player)
                }
            }
            playersLiveData.postValue(players_array)
            callback(true, "Players Fetched Successfully")
        }.addOnFailureListener {
            callback(true, "Failed")
        }
    }
}
