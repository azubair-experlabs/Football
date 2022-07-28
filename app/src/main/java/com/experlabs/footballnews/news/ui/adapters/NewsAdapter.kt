package com.experlabs.footballnews.news.ui.adapters

import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.experlabs.footballnews.news.ui.childfragments.FactsFragment
import com.experlabs.footballnews.news.ui.childfragments.LinkFragment
import com.experlabs.footballnews.news.ui.childfragments.VideoFragment
import com.experlabs.footballnews.portal.models.News
import com.squareup.picasso.Picasso


class NewsAdapter(private val newslist : ArrayList<News>, fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    lateinit var fragment : Fragment

    override fun createFragment(position: Int): Fragment {
        // Return a NEW fragment instance in createFragment(int)

        when(position){
            1 -> {
                val facts = newslist.filter {
                    it.type == "fact"
                }

                fragment = FactsFragment()
                fragment.arguments = Bundle().apply {
                    putParcelableArrayList("FACTS", facts as ArrayList<News>)
                }
            }
            0 -> {
                val videos = newslist.filter {
                    it.type == "video"
                }

                fragment = VideoFragment()
                fragment.arguments = Bundle().apply {
                    putParcelableArrayList("VIDEOS", videos as ArrayList<News>)
                }
            }
            2 -> {

                val links = newslist.filter {
                    it.type == "link"
                }

                fragment = LinkFragment()
                fragment.arguments = Bundle().apply {
                    putParcelableArrayList("LINKS", links as ArrayList<News>)
                }
            }
        }

        return fragment
    }
}
