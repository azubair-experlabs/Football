package com.experlabs.footballnews.players.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.PlayerItemBinding
import com.experlabs.footballnews.portal.models.Player
import java.util.*
import kotlin.collections.ArrayList


class PlayersAdapter(private val players: ArrayList<Player>, val openOnClick : (Player, Int) -> Unit) : RecyclerView.Adapter<PlayersAdapter.ViewHolder>() {

    val players_copy = ArrayList<Player>()

    init {
        players_copy.addAll(players)
    }

    inner class ViewHolder(val binding : PlayerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item : Player){
            val position : Int = adapterPosition

            binding.playerItem = item
            binding.index = (position + 1).toString()


            binding.root.setOnClickListener {
                openOnClick(item, position)
            }

        }
    }

    fun filter(text: String) {

        if (text.isEmpty()) {
            players.clear()
            players.addAll(players_copy)
        } else {
            val result: ArrayList<Player> = ArrayList<Player>()
            val text = text.lowercase(Locale.getDefault())
            for (item in players_copy) {
                //match by name or phone
                if (item.name.lowercase().contains(text) || item.nationality.lowercase().contains(text)) {
                    result.add(item)
                }
            }
            players.clear()
            players.addAll(result)
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        val itembinding = PlayerItemBinding.inflate(inflater, viewGroup, false)
        return ViewHolder(itembinding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val animation = AnimationUtils.loadAnimation(viewHolder.itemView.context, R.anim.lefttoright)
        viewHolder.bind(players[position])
        viewHolder.itemView.startAnimation(animation)
    }

    override fun getItemCount() = players.size

}
