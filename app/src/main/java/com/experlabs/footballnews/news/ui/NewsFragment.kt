package com.experlabs.footballnews.news.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.viewpager2.widget.ViewPager2
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.FragmentNewsBinding
import com.experlabs.footballnews.news.ui.adapters.NewsAdapter
import com.experlabs.footballnews.news.viewmodels.NewsViewModel
import com.experlabs.footballnews.portal.models.News
import com.google.android.material.tabs.TabLayoutMediator
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope


class NewsFragment : Fragment(), AndroidScopeComponent {

    private var newslist: ArrayList<News> = ArrayList()
    private var _binding: FragmentNewsBinding? = null

    private val binding get() = _binding!!

    override val scope: Scope by fragmentScope()
    private val viewModel by inject<NewsViewModel>()

    // representing an object in the collection.
    private lateinit var adapter: NewsAdapter

    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewsBinding.inflate(inflater, container, false)

        activity?.setTitle(R.string.title_news)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        loadData()

        binding.refreshNewsBt.setOnRefreshListener {
            loadData()
        }
    }

    private fun loadData(){
        viewModel.getNewsFromRepository { flag, message ->
            try {
                if (flag) {
                    viewModel.news.observe(viewLifecycleOwner) {
                        newslist.clear()
                        newslist.addAll(it)
                        adapter = NewsAdapter(newslist, this)
                        viewPager = binding.newsPager
                        viewPager.adapter = adapter

                        val tabLayout = binding.tabLayout
                        TabLayoutMediator(tabLayout, binding.newsPager) { tab, position ->
                            when (position) {
                                1 -> {
                                    tab.text = "Facts"
                                }
                                0 -> {
                                    tab.text = "Videos"
                                }
                                2 -> {
                                    tab.text = "Links"
                                }
                            }
                        }.attach()
                    }
                }
                binding.refreshNewsBt.isRefreshing = false
            } catch (e: Exception) {
                Log.i("News crash", e.toString())
            }
        }
    }

    override fun onStop() {
        super.onStop()
        parentFragment?.viewLifecycleOwner?.let { viewModel.news.removeObservers(it) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}