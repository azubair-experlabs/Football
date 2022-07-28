package com.experlabs.footballnews.news.ui.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.experlabs.footballnews.databinding.FactItemBinding
import com.experlabs.footballnews.databinding.LinkItemBinding
import com.experlabs.footballnews.portal.models.News


class LinkAdapter(private val links: ArrayList<News>, val openOnClick : (News, Int) -> Unit) : RecyclerView.Adapter<LinkAdapter.ViewHolder>() {

    inner class ViewHolder(val binding : LinkItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item : News){

            binding.linkItem = item

            binding.shareBt.setOnClickListener {
                val share = Intent(Intent.ACTION_SEND)
                share.type = "text/plain"
                share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                share.putExtra(Intent.EXTRA_SUBJECT, "Share News link")
                share.putExtra(Intent.EXTRA_TEXT, item.url)
                itemView.context.startActivity(Intent.createChooser(share, "Football News"))
            }

            binding.openBt.setOnClickListener {
                val position : Int = adapterPosition
                openOnClick(item, position)
            }

        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        val itembinding = LinkItemBinding.inflate(inflater, viewGroup, false)
        return ViewHolder(itembinding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(links[position])
    }

    override fun getItemCount() = links.size

}
