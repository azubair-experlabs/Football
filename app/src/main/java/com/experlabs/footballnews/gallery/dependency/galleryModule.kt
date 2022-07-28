package com.experlabs.footballnews.gallery.dependency

import com.experlabs.footballnews.gallery.repository.GalleryRepository
import com.experlabs.footballnews.gallery.ui.GalleryFragment
import com.experlabs.footballnews.gallery.viewmodels.GalleryViewModel
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val galleryModule = module{

    single {
        FirebaseDatabase.getInstance()
    }

    single {
        FirebaseStorage.getInstance()
    }

    single {
        GalleryRepository(androidContext(),get(), get())
    }

    viewModel {
        GalleryViewModel(get())
    }

    scope<GalleryFragment> {
        scoped {
            GalleryViewModel(get())
        }
    }

}