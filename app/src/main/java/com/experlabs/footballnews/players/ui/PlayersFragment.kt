package com.experlabs.footballnews.players.ui

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.FragmentPlayersBinding
import com.experlabs.footballnews.players.viewmodels.PlayersViewModel
import com.experlabs.footballnews.portal.models.Player
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope

class PlayersFragment : Fragment(), AndroidScopeComponent {

    private var _binding: FragmentPlayersBinding? = null

    private lateinit var adapter: PlayersAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.

    override val scope: Scope by fragmentScope()
    private val viewModel by inject<PlayersViewModel>()

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPlayersBinding.inflate(inflater, container, false)

        activity?.setTitle(R.string.title_players)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val animation = AnimationUtils.loadAnimation(context, R.anim.fall_down)

        binding.root.startAnimation(animation)

        loadData()

        binding.refreshPlayersBt.setOnRefreshListener {
            loadData()
        }

        binding.searchLayout.editText?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                adapter.filter(s.toString())
            }
        })
    }

    private fun loadData() {
        viewModel.getPlayersFromRepository() { flag, message ->
            try {
                if (flag) {
                    viewModel.players.observe(viewLifecycleOwner) {
                        adapter = PlayersAdapter(it) { item, index ->
                            openPlayer(item, index)
                        }

                        binding.playersRecycler.adapter = adapter
                    }
//                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                } else
                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

                binding.refreshPlayersBt.isRefreshing = false
            } catch (e: Exception) {
                Log.i("Players crash", e.toString())
            }
        }
    }

    private fun openPlayer(item: Player, index: Int) {
        val intent = Intent(context, PlayerActivity::class.java)
        intent.putExtra("PLAYER", item)
        context?.startActivity(intent)
    }

    override fun onStop() {
        super.onStop()
        parentFragment?.viewLifecycleOwner?.let { viewModel.players.removeObservers(it) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}