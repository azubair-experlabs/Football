package com.experlabs.footballnews.teams.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.experlabs.footballnews.teams.repository.TeamRepository
import com.experlabs.footballnews.portal.models.News
import com.experlabs.footballnews.portal.models.Team
import kotlinx.coroutines.launch

class TeamViewModel(private val repository: TeamRepository) : ViewModel() {
    val teams : LiveData<ArrayList<Team>>
        get() = repository.teams

    fun getTeamsFromRepository(callback: (Boolean, String) -> Unit){
        viewModelScope.launch {
            repository.getTeams {flag, message ->
                response(flag, message, callback)
            }
        }
    }

    private fun response(flag: Boolean, message: String, callback: (Boolean, String) -> Unit) {
        callback(flag, message)
    }
}