package com.experlabs.footballnews.teams.dependency

import com.experlabs.footballnews.teams.repository.TeamRepository
import com.experlabs.footballnews.teams.viewmodels.TeamViewModel
import com.experlabs.footballnews.teams.ui.TeamsFragment
import com.google.firebase.database.FirebaseDatabase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val teamsModule = module{

    single {
        FirebaseDatabase.getInstance()
    }


    single {
        TeamRepository(get())
    }

    viewModel {
        TeamViewModel(get())
    }

    scope<TeamsFragment> {
        scoped {
            TeamViewModel(get())
        }
    }
}