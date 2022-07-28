package com.experlabs.footballnews.players.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.experlabs.footballnews.portal.models.Player
import com.experlabs.footballnews.portal.models.Team
import com.google.firebase.database.FirebaseDatabase

class PlayersRepository(private val database: FirebaseDatabase) {

    private val playersLiveData = MutableLiveData<ArrayList<Player>>()

    val players: LiveData<ArrayList<Player>> get() = playersLiveData

    suspend fun getPlayers(callback: (Boolean, String) -> Unit) {

        val players_array = ArrayList<Player>()

        database.getReference("/players").get().addOnSuccessListener {
            it.children.forEach { doc ->
                val news = doc.getValue(Player::class.java)
                news?.let {
                    players_array.add(it)
                }
            }
            players_array.sortByDescending { it.matches_played.toInt() }

            playersLiveData.postValue(players_array)

            callback(true, "Players Fetched Successfully")

        }.addOnFailureListener {
            callback(true, "Firebase Error")
        }
    }
}
