package com.experlabs.footballnews.players.dependency

import com.experlabs.footballnews.players.repository.PlayersRepository
import com.experlabs.footballnews.players.ui.PlayersFragment
import com.experlabs.footballnews.players.viewmodels.PlayersViewModel
import com.google.firebase.database.FirebaseDatabase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val playersModule = module{

    single {
        FirebaseDatabase.getInstance()
    }


    single {
        PlayersRepository(get())
    }

    viewModel {
        PlayersViewModel(get())
    }

    scope<PlayersFragment> {
        scoped {
            PlayersViewModel(get())
        }
    }
}