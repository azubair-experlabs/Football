package com.experlabs.footballnews.news.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.experlabs.footballnews.portal.models.News
import com.google.firebase.database.FirebaseDatabase

class NewsRepository(private val database: FirebaseDatabase) {

    private val newsLiveData = MutableLiveData<ArrayList<News>>()

    val news: LiveData<ArrayList<News>> get() = newsLiveData

    suspend fun getNews(callback: (Boolean, String) -> Unit) {

        val news_array = ArrayList<News>()

        database.getReference("/news").get().addOnSuccessListener {
            it.children.forEach { doc ->
                val news = doc.getValue(News::class.java)
                news?.let {
                    news_array.add(it)
                }
            }
            newsLiveData.postValue(news_array)
            callback(true, "News Fetched Successfully")

        }.addOnFailureListener {
            callback(true, "Firebase Error")
        }
    }
}
