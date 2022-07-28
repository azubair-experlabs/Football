package com.experlabs.footballnews.news.dependency

import com.experlabs.footballnews.news.repository.NewsRepository
import com.experlabs.footballnews.news.ui.NewsFragment
import com.experlabs.footballnews.news.viewmodels.NewsViewModel
import com.google.firebase.database.FirebaseDatabase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val newsModule = module{

    single {
        FirebaseDatabase.getInstance()
    }


    single {
        NewsRepository(get())
    }

    viewModel {
        NewsViewModel(get())
    }

    scope<NewsFragment> {
        scoped {
            NewsViewModel(get())
        }
    }
}