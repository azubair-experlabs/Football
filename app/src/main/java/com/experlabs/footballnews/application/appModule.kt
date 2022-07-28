package com.experlabs.footballnews.application

import com.experlabs.footballnews.fcm.services.FirebaseMessagingService
import com.experlabs.footballnews.gallery.repository.GalleryRepository
import com.experlabs.footballnews.gallery.ui.GalleryFragment
import com.experlabs.footballnews.gallery.viewmodels.GalleryViewModel
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module{

    scope<Football> {
        scoped {
            FirebaseMessagingService(get())
        }
    }

}