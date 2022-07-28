package com.experlabs.footballnews.portal.viewmodels

import android.graphics.Bitmap
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.experlabs.footballnews.portal.models.News
import com.experlabs.footballnews.portal.models.Picture
import com.experlabs.footballnews.portal.models.Player
import com.experlabs.footballnews.portal.models.Team
import com.experlabs.footballnews.gallery.repository.GalleryRepository
import com.experlabs.footballnews.portal.repository.PortalRepository
import kotlinx.coroutines.launch
import java.util.*
import kotlin.collections.ArrayList

class PortalViewModel(private val repository: PortalRepository) : ViewModel() {

    val players : LiveData<ArrayList<Player>>
        get() = repository.players

    fun postNewsInRepository(title: String, description: String, url: String, type: String, callback: (Boolean, String) -> Unit) {

        val news = News(title, description, url, type)
        viewModelScope.launch {
            repository.postNews(news){flag, message ->
                response(flag, message, callback)
            }
        }
    }

    fun postPlayerInRepository(name : String, number : String, nationality : String, picture_url : String, matches_played : String, total_goals : String, total_assists : String, kicks : String, description: String, callback: (Boolean, String) -> Unit) {

        val player = Player(name, number, nationality, description, picture_url, matches_played, total_goals, total_assists, kicks)
        viewModelScope.launch {
            repository.postPlayer(player){flag, message ->
                response(flag, message, callback)
            }
        }
    }

    fun postTeamInRepository(name : String, flag_url : String, country : String,  points : String, description: String, players : ArrayList<Player>, callback: (Boolean, String) -> Unit) {

        val team = Team(name, flag_url, country, points, description, players)
        viewModelScope.launch {
            repository.postTeam(team){flag, message ->
                response(flag, message, callback)
            }
        }
    }

    fun getPlayersFromRepository(callback: (Boolean, String) -> Unit){
        viewModelScope.launch {
            repository.getPlayers {flag, message ->
                response(flag, message, callback)
            }
        }
    }

    fun postPictureInRepository(name : String, image: Bitmap, callback: (Boolean, String) -> Unit) {
        val picture = Picture(UUID.randomUUID().toString(), name, "/pictures/${UUID.randomUUID()}")
        viewModelScope.launch {
            repository.postPicture(image, picture){flag, message ->
                response(flag, message, callback)
            }
        }
    }

    private fun response(flag: Boolean, message: String, callback: (Boolean, String) -> Unit) {
        callback(flag, message)
    }
}