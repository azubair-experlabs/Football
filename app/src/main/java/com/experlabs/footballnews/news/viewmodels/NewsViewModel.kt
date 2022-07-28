package com.experlabs.footballnews.news.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.experlabs.footballnews.news.repository.NewsRepository
import com.experlabs.footballnews.portal.models.News
import com.experlabs.footballnews.portal.models.Picture
import kotlinx.coroutines.launch

class NewsViewModel(private val repository: NewsRepository) : ViewModel() {
    val news : LiveData<ArrayList<News>>
        get() = repository.news

    fun getNewsFromRepository(callback: (Boolean, String) -> Unit){
        viewModelScope.launch {
            repository.getNews {flag, message ->
                response(flag, message, callback)
            }
        }
    }

    private fun response(flag: Boolean, message: String, callback: (Boolean, String) -> Unit) {
        callback(flag, message)
    }
}