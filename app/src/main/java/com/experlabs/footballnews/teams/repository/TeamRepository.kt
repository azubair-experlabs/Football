package com.experlabs.footballnews.teams.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.experlabs.footballnews.portal.models.News
import com.experlabs.footballnews.portal.models.Team
import com.google.firebase.database.FirebaseDatabase

class TeamRepository(private val database: FirebaseDatabase) {

    private val teamsLiveData = MutableLiveData<ArrayList<Team>>()

    val teams: LiveData<ArrayList<Team>> get() = teamsLiveData

    suspend fun getTeams(callback: (Boolean, String) -> Unit) {

        val teams_array = ArrayList<Team>()

        database.getReference("/teams").get().addOnSuccessListener { snap ->
            snap.children.forEach { doc ->
                val news = doc.getValue(Team::class.java)
                news?.let {
                    teams_array.add(it)
                }
            }
            teams_array.sortByDescending{ it.points.toInt() }

            teamsLiveData.postValue(teams_array)

            callback(true, "Teams Fetched Successfully")

        }.addOnFailureListener {
            callback(true, "Firebase Error")
        }
    }
}
