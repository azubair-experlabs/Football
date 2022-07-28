package com.experlabs.footballnews.news.ui.childfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.experlabs.footballnews.databinding.FragmentVideoBinding
import com.experlabs.footballnews.news.ui.adapters.VideoAdapter
import com.experlabs.footballnews.portal.models.News

class VideoFragment : Fragment(){

    private var _binding : FragmentVideoBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentVideoBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey("VIDEOS") }?.apply {
            val videos : ArrayList<News>? = getParcelableArrayList("VIDEOS")
            videos?.let {
                binding.videoRecycler.adapter = VideoAdapter(videos){ item, index ->

                }
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}