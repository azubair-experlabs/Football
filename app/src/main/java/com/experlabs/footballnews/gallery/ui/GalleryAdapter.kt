package com.experlabs.footballnews.gallery.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.AddplayerItemBinding
import com.experlabs.footballnews.databinding.GalleryItemBinding
import com.experlabs.footballnews.portal.models.Picture
import com.experlabs.footballnews.portal.models.Player
import com.experlabs.footballnews.portal.ui.PlayersAdapter
import com.squareup.picasso.Picasso

class GalleryAdapter(private val pictures: ArrayList<Picture>, val openOnClick : (Picture, Int) -> Unit) : RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    inner class ViewHolder(val binding : GalleryItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item : Picture){
            binding.galleryItem = item

            binding.galleryImageView.setOnClickListener {
                val position : Int = adapterPosition
                openOnClick((pictures[position]), position)
            }
        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        val itembinding = GalleryItemBinding.inflate(inflater, viewGroup, false)
        return ViewHolder(itembinding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val animation = AnimationUtils.loadAnimation(viewHolder.itemView.context, R.anim.fall_down)
        viewHolder.bind(pictures[position])
        viewHolder.itemView.startAnimation(animation)
   }

    override fun getItemCount() = pictures.size

}