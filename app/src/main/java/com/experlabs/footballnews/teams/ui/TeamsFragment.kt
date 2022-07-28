package com.experlabs.footballnews.teams.ui

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
import com.experlabs.footballnews.databinding.FragmentTeamsBinding
import com.experlabs.footballnews.teams.viewmodels.TeamViewModel
import com.experlabs.footballnews.portal.models.Team
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope

class TeamsFragment : Fragment(), AndroidScopeComponent {

    private var _binding: FragmentTeamsBinding? = null

    private lateinit var adapter: TeamAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.

    override val scope: Scope by fragmentScope()
    private val viewModel by inject<TeamViewModel>()

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentTeamsBinding.inflate(inflater, container, false)

        activity?.setTitle(R.string.title_teams)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val animation = AnimationUtils.loadAnimation(context, R.anim.fall_down)

        binding.root.startAnimation(animation)

        loadData()

        binding.refreshTeamsBt.setOnRefreshListener {
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
        viewModel.getTeamsFromRepository { flag, message ->
            try {
                if (flag) {

                    viewModel.teams.observe(viewLifecycleOwner) {
                        adapter = TeamAdapter(it) { item, index ->
                            openTeam(item, index)
                        }

                        binding.teamsRecycler.adapter = adapter
                    }
//                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                } else
                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

                binding.refreshTeamsBt.isRefreshing = false
            } catch (e: Exception) {
                Log.i("Teams crash", e.toString())
            }
        }
    }

    private fun openTeam(item: Team, index: Int) {
        val intent = Intent(context, TeamActivity::class.java)
        intent.putExtra("TEAM", item)
        context?.startActivity(intent)
    }

    override fun onStop() {
        super.onStop()
        parentFragment?.viewLifecycleOwner?.let { viewModel.teams.removeObservers(it) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}