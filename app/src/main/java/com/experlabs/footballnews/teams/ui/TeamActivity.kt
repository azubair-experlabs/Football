package com.experlabs.footballnews.teams.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.experlabs.footballnews.databinding.ActivityTeamBinding
import com.experlabs.footballnews.teams.viewmodels.TeamViewModel
import com.experlabs.footballnews.players.ui.PlayersAdapter
import com.experlabs.footballnews.players.ui.PlayerActivity
import com.experlabs.footballnews.portal.models.Player
import com.experlabs.footballnews.portal.models.Team
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.activityScope
import org.koin.core.scope.Scope

class TeamActivity : AppCompatActivity(), AndroidScopeComponent {

    private var _binding: ActivityTeamBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.

    override val scope: Scope by activityScope()
    private val viewModel by inject<TeamViewModel>()

    private val binding get() = _binding!!

    private lateinit var team_data : Team

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)



        intent.getParcelableExtra<Team>("TEAM")?.apply {
            team_data = this
            binding.teamItem = team_data

            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.title = team_data.name

            binding.teamPlayersRecycler.adapter = team?.let { PlayersAdapter(it){item, index ->
                openPlayer(item, index)
            } }

        }
    }

    private fun openPlayer(item: Player, index: Int) {
        val intent = Intent(this, PlayerActivity::class.java)
        intent.putExtra("PLAYER", item)
        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}