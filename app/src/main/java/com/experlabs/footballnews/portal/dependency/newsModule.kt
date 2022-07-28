package com.experlabs.footballnews.portal.dependency

import com.experlabs.footballnews.fcm.services.FirebaseMessagingService
import com.experlabs.footballnews.portal.repository.PortalRepository
import com.experlabs.footballnews.portal.ui.childfragments.AddNewsFragment
import com.experlabs.footballnews.portal.ui.childfragments.AddPicturesFragment
import com.experlabs.footballnews.portal.ui.childfragments.AddPlayersFragment
import com.experlabs.footballnews.portal.ui.childfragments.AddTeamsFragment
import com.experlabs.footballnews.portal.viewmodels.PortalViewModel
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val portalModule = module{

    single {
        FirebaseDatabase.getInstance()
    }

    single {
        FirebaseStorage.getInstance()
    }

    single {
        FirebaseMessagingService(get())
    }

    single {
        PortalRepository(get(), get(), get())
    }

    viewModel {
        PortalViewModel(get())
    }

    scope<AddNewsFragment> {
        scoped {
            PortalViewModel(get())
        }
    }

    scope<AddPlayersFragment> {
        scoped {
            PortalViewModel(get())
        }
    }

    scope<AddTeamsFragment> {
        scoped {
            PortalViewModel(get())
        }
    }

    scope<AddPicturesFragment> {
        scoped {
            PortalViewModel(get())
        }
    }

}