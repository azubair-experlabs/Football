package com.experlabs.footballnews.portal.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.AddplayerItemBinding
import com.experlabs.footballnews.portal.models.Player


class PlayersAdapter(private val players: ArrayList<Player>, val deleteOnClick : (Player,Int) -> Unit) : RecyclerView.Adapter<PlayersAdapter.ViewHolder>() {

    inner class ViewHolder(val binding : AddplayerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item : Player){
            binding.playerItem = item

            binding.removePlayerBt.setOnClickListener {
                val position : Int = adapterPosition
                deleteOnClick((players[position]), position)
            }
        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        val itembinding = AddplayerItemBinding.inflate(inflater, viewGroup, false)
        return ViewHolder(itembinding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(players[position])
    }

    override fun getItemCount() = players.size

}

@BindingAdapter("imageFromURL")
fun ImageView.imageFromURL(url : String){
    val options: RequestOptions = RequestOptions()
        .placeholder(R.drawable.football)
        .error(R.drawable.football)
    Glide.with(this).load(url).apply(options).into(this)
}