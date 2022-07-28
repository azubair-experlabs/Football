package com.experlabs.footballnews.news.ui.childfragments

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.FactsPopupBinding
import com.experlabs.footballnews.databinding.FragmentFactsBinding
import com.experlabs.footballnews.news.ui.adapters.FactsAdapter
import com.experlabs.footballnews.portal.models.News

class FactsFragment : Fragment() {

    private var _binding: FragmentFactsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFactsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey("FACTS") }?.apply {
            val facts: ArrayList<News>? = getParcelableArrayList("FACTS")
            facts?.let {
                binding.factsRecycler.adapter = FactsAdapter(facts) { item, index ->
                    openOnClick(item, index)
                }
            }
        }
    }

    private fun openOnClick(item: News, index: Int) {
        val saveDialog = Dialog(requireContext())
        val popupBinding = FactsPopupBinding.inflate(LayoutInflater.from(context))
        popupBinding.factItem = item
        saveDialog.setCancelable(true)
        saveDialog.setContentView(popupBinding.root)
        saveDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        popupBinding.popupShareBt.setOnClickListener {
            val share = Intent(Intent.ACTION_SEND)
            share.type = "text/plain"
            share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            share.putExtra(Intent.EXTRA_SUBJECT, "Share News")
            share.putExtra(Intent.EXTRA_TEXT, item.title + "\n\n" + item.description)
            view?.context?.startActivity(Intent.createChooser(share, "Football News"))
        }
        saveDialog.show()
        val animation = AnimationUtils.loadAnimation(context, R.anim.slide_down)
        popupBinding.root.startAnimation(animation)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}