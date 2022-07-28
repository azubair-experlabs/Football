package com.experlabs.footballnews.application

import android.app.Application
import com.experlabs.footballnews.fcm.services.FirebaseMessagingService
import com.experlabs.footballnews.gallery.dependency.galleryModule
import com.experlabs.footballnews.news.dependency.newsModule
import com.experlabs.footballnews.players.dependency.playersModule
import com.experlabs.footballnews.portal.dependency.portalModule
import com.experlabs.footballnews.teams.dependency.teamsModule
import com.experlabs.footballnews.weather.dependency.weatherModule
import com.google.firebase.FirebaseApp
import com.google.firebase.messaging.FirebaseMessaging
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Football : Application() {

    private val messagingService by inject<FirebaseMessagingService>()

    override fun onCreate() {
        super.onCreate()
        createToken()
        FirebaseApp.initializeApp(this)
        startKoin {
            androidContext(this@Football)
            modules(appModule, weatherModule, portalModule, galleryModule, newsModule, teamsModule, playersModule)
        }
    }

    private fun createToken(){
        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            if(it.isComplete){
                val token = it.result.toString()
                messagingService.addTokenToFirestore(token)
            }
        }
    }
}