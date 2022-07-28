package com.experlabs.footballnews.players.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.experlabs.footballnews.players.repository.PlayersRepository
import com.experlabs.footballnews.teams.repository.TeamRepository
import com.experlabs.footballnews.portal.models.News
import com.experlabs.footballnews.portal.models.Player
import com.experlabs.footballnews.portal.models.Team
import kotlinx.coroutines.launch

class PlayersViewModel(private val repository: PlayersRepository) : ViewModel() {
    val players : LiveData<ArrayList<Player>>
        get() = repository.players

    fun getPlayersFromRepository(callback: (Boolean, String) -> Unit){
        viewModelScope.launch {
            repository.getPlayers {flag, message ->
                response(flag, message, callback)
            }
        }
    }

    private fun response(flag: Boolean, message: String, callback: (Boolean, String) -> Unit) {
        callback(flag, message)
    }
}