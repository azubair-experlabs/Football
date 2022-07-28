package com.experlabs.footballnews.teams.ui

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.FactItemBinding
import com.experlabs.footballnews.databinding.TeamItemBinding
import com.experlabs.footballnews.news.ui.adapters.FactsAdapter
import com.experlabs.footballnews.portal.models.News
import com.experlabs.footballnews.portal.models.Player
import com.experlabs.footballnews.portal.models.Team
import java.util.*
import kotlin.collections.ArrayList


class TeamAdapter(private val teams: ArrayList<Team>, val openOnClick : (Team, Int) -> Unit) : RecyclerView.Adapter<TeamAdapter.ViewHolder>() {

    private val teams_copy = ArrayList<Team>()

    init {
        teams_copy.addAll(teams)
    }

    inner class ViewHolder(val binding : TeamItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item : Team){
            val position : Int = adapterPosition

            binding.teamItem = item
            binding.index = (position + 1).toString()


            binding.root.setOnClickListener {
                openOnClick(item, position)
            }

        }
    }

    fun filter(text: String) {

        if (text.isEmpty()) {
            teams.clear()
            teams.addAll(teams_copy)
        } else {
            val result: ArrayList<Team> = ArrayList<Team>()
            val text = text.lowercase(Locale.getDefault())
            for (item in teams_copy) {
                //match by name or phone
                if (item.name.lowercase().contains(text) || item.country.lowercase().contains(text)) {
                    result.add(item)
                }
            }
            teams.clear()
            teams.addAll(result)
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        val itembinding = TeamItemBinding.inflate(inflater, viewGroup, false)
        return ViewHolder(itembinding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val animation = AnimationUtils.loadAnimation(viewHolder.itemView.context, R.anim.lefttoright)
        viewHolder.bind(teams[position])
        viewHolder.itemView.startAnimation(animation)
    }

    override fun getItemCount() = teams.size

}
