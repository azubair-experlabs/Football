package com.experlabs.footballnews.news.ui.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.VideoItemBinding
import com.experlabs.footballnews.news.ui.YoutubeActivity
import com.experlabs.footballnews.portal.models.News
import com.google.firebase.database.annotations.NotNull
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerCallback


class VideoAdapter(private val videos: ArrayList<News>, val playOnClick : (News, Int) -> Unit) : RecyclerView.Adapter<VideoAdapter.ViewHolder>() {

    inner class ViewHolder(val binding : VideoItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item : News){

            binding.videoItem = item

            val videoId: String = item.url.substringAfter("=/").takeLast(11)

            binding.youtubeView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(@NotNull youTubePlayer: YouTubePlayer) {
                    super.onReady(youTubePlayer)
                    youTubePlayer.cueVideo(videoId, 0F)
                    youTubePlayer.play()
                }
            })

            binding.fullscreenBt.setOnClickListener {
                binding.youtubeView.getYouTubePlayerWhenReady(object : YouTubePlayerCallback {
                    override fun onYouTubePlayer(youTubePlayer: YouTubePlayer) {
                        val intent = Intent(itemView.context, YoutubeActivity::class.java)
                        intent.putExtra("URL", videoId)
                        itemView.context.startActivity(intent)
                    }
                })

                val position : Int = adapterPosition
                playOnClick(item, position)
            }

            binding.videoshareBt.setOnClickListener {
                val share = Intent(Intent.ACTION_SEND)
                share.type = "text/plain"
                share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                share.putExtra(Intent.EXTRA_SUBJECT, "Share Videos link")
                share.putExtra(Intent.EXTRA_TEXT, item.url)
                itemView.context.startActivity(Intent.createChooser(share, "Football News"))
            }

        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        val itembinding = VideoItemBinding.inflate(inflater, viewGroup, false)
        return ViewHolder(itembinding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val animation = AnimationUtils.loadAnimation(viewHolder.itemView.context, R.anim.fade_in)
        viewHolder.bind(videos[position])
        viewHolder.itemView.startAnimation(animation)
    }

    override fun getItemCount() = videos.size

}