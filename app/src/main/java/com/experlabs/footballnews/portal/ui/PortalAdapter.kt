package com.experlabs.footballnews.portal.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.experlabs.footballnews.portal.ui.childfragments.AddNewsFragment
import com.experlabs.footballnews.portal.ui.childfragments.AddPicturesFragment
import com.experlabs.footballnews.portal.ui.childfragments.AddPlayersFragment
import com.experlabs.footballnews.portal.ui.childfragments.AddTeamsFragment


class PortalAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 4

    lateinit var fragment : Fragment

    override fun createFragment(position: Int): Fragment {
        // Return a NEW fragment instance in createFragment(int)

        when(position){
            0 -> {
                fragment = AddTeamsFragment()
//                fragment.arguments = Bundle().apply {
//                    putString("DATA", "Videos List")
//                }
            }
            1 -> {
                fragment = AddPlayersFragment()
//                fragment.arguments = Bundle().apply {
//                    putString("DATA", "URLs List")
//                }
            }
            2 -> {
                fragment = AddPicturesFragment()
//                fragment.arguments = Bundle().apply {
//                    putString("DATA", "URLs List")
//                }
            }
            3 -> {
                fragment = AddNewsFragment()
//                fragment.arguments = Bundle().apply {
//                    putString("DATA", "Facts List")
//                }
            }
        }
        return fragment
    }
}