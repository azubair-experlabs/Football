package com.experlabs.footballnews.news.ui

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import android.view.WindowInsets
import com.experlabs.footballnews.databinding.ActivityYoutubeBinding
import com.google.firebase.database.annotations.NotNull
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener

class YoutubeActivity : Activity() {

    private lateinit var binding: ActivityYoutubeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        supportActionBar?.hide()
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val url = intent.getStringExtra("URL")

        binding.fullscreenPlayer.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(@NotNull youTubePlayer: YouTubePlayer) {
                super.onReady(youTubePlayer)
                val videoId: String? = url
                if (videoId != null) {
                    youTubePlayer.loadVideo(videoId, 0F)
                    binding.fullscreenPlayer.enterFullScreen()
                    youTubePlayer.play()
                }
            }
        })

    }
}