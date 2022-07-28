package com.experlabs.footballnews.portal.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.ActivityPortalBinding
import com.google.android.material.tabs.TabLayoutMediator

class PortalActivity : AppCompatActivity() {

    private var _binding: ActivityPortalBinding? = null

    private val binding get() = _binding!!

    // representing an object in the collection.
    private lateinit var adapter: PortalAdapter

    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityPortalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        adapter = PortalAdapter(this)
        viewPager = binding.portalPager
        viewPager.adapter = adapter

        val tabLayout = binding.portaltabLayout
        TabLayoutMediator(tabLayout, binding.portalPager) { tab, position ->
            when(position) {
                0 -> {tab.text = "Team"}
                1 -> {tab.text = "Player"}
                2 -> {tab.text = "Picture"}
                3 -> {tab.text = "News"}
            }
        }.attach()
    }

}