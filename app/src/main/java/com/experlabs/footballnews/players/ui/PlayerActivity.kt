package com.experlabs.footballnews.players.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.experlabs.footballnews.databinding.ActivityMainBinding
import com.experlabs.footballnews.databinding.ActivityPlayerBinding
import com.experlabs.footballnews.databinding.FragmentPlayersBinding
import com.experlabs.footballnews.players.viewmodels.PlayersViewModel
import com.experlabs.footballnews.portal.models.Player
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.activityScope
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope

class PlayerActivity : AppCompatActivity(), AndroidScopeComponent {

    private var _binding: ActivityPlayerBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.

    override val scope: Scope by activityScope()
    private val viewModel by inject<PlayersViewModel>()

    private val binding get() = _binding!!

    private lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)



         intent.getParcelableExtra<Player>("PLAYER")?.apply {
             player = this
             binding.playerItem = player

             supportActionBar!!.setDisplayHomeAsUpEnabled(true)
             supportActionBar!!.title = player.name
         }
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