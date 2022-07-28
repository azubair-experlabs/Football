package com.experlabs.footballnews.news.ui.childfragments

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.experlabs.footballnews.databinding.FragmentLinkBinding
import com.experlabs.footballnews.databinding.LinkPopupBinding
import com.experlabs.footballnews.news.ui.adapters.LinkAdapter
import com.experlabs.footballnews.portal.models.News


class LinkFragment : Fragment() {

    private var _binding: FragmentLinkBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentLinkBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey("LINKS") }?.apply {
            val links : ArrayList<News>? = getParcelableArrayList("LINKS")
            links?.let {
                binding.linksRecycler.adapter = LinkAdapter(links){ item, index ->
                    openOnClick(item, index)
                }
            }
        }
    }

    private fun openOnClick(item: News, index: Int) {
        val saveDialog = Dialog(requireContext())
        val popupBinding = LinkPopupBinding.inflate(LayoutInflater.from(context))
        saveDialog.setCancelable(true)
        saveDialog.setContentView(popupBinding.root)
        saveDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        popupBinding.linkWebview.loadUrl(item.url)
        popupBinding.linkWebview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }
        }

        saveDialog.show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}