package com.experlabs.footballnews.portal.ui.childfragments

import android.R
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.experlabs.footballnews.databinding.FragmentAddteamsBinding
import com.experlabs.footballnews.portal.models.Player
import com.experlabs.footballnews.portal.ui.PlayersAdapter
import com.experlabs.footballnews.portal.viewmodels.PortalViewModel
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope


class AddTeamsFragment : Fragment(), AndroidScopeComponent {

    private var _binding: FragmentAddteamsBinding? = null

    private val binding get() = _binding!!

    override val scope: Scope by fragmentScope()
    private val viewModel by inject<PortalViewModel>()

    private var players: ArrayList<Player> = ArrayList()

    private var selected_players: ArrayList<Player> = ArrayList()

    private lateinit var adapter: PlayersAdapter

    private lateinit var name: TextView
    private lateinit var flag_url: TextView
    private lateinit var description: TextView
    private lateinit var points: TextView
    private lateinit var country: Spinner

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAddteamsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("OnDestroy", "Endddd")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("OnDetach", "Noooo")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("OnAttach", "YESSSS")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        adapter = PlayersAdapter(selected_players) { item, index ->
            removeItem(item, index)
        }

        binding.playersRecycler.adapter = adapter

        binding.refreshAddPlayerBt.setOnRefreshListener {
            loadData()
        }

        loadData()

        binding.addPlayerSpinner.setSelection(0, false)

        binding.addPlayerSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    view?.apply {
                        if (position != 0) {
                            Toast.makeText(view.context, "${players[position - 1].name} Added", Toast.LENGTH_SHORT).show()
                            selected_players.add(players[position - 1])
                            adapter.notifyItemInserted(selected_players.size - 1)
                        }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // sometimes you need nothing here
                }
            }


        name = binding.addTeamnameTextbox
        flag_url = binding.addflagUrlTextbox
        description = binding.addTeamDescriptionTextbox
        country = binding.addPlayerSpinner
        points = binding.addteamPointsTextbox

        binding.addteamBt.setOnClickListener {
            if (selected_players.size > 0 &&
                name.text.isNotEmpty() &&
                flag_url.text.isNotEmpty() &&
                description.text.isNotEmpty() &&
                points.text.isNotEmpty()
            ) {
                viewModel.postTeamInRepository(
                    name.text.toString(),
                    flag_url.text.toString(),
                    country.selectedItem.toString(),
                    points.text.toString(),
                    description.text.toString(),
                    selected_players
                ) { flag, message ->
                    if (flag) {
                        name.text = ""
                        flag_url.text = ""
                        country.setSelection(0)
                        points.text = ""
                        description.text = ""
                        selected_players.clear()
                        Toast.makeText(view.context, message, Toast.LENGTH_SHORT).show()
                    } else
                        Toast.makeText(view.context, message, Toast.LENGTH_SHORT).show()
                }
            } else
                Toast.makeText(view.context, "Please Fill all the details", Toast.LENGTH_SHORT)
                    .show()
        }
    }

    private fun loadData() {
        viewModel.getPlayersFromRepository { flag, message ->
            try {
                if (flag) {
                    viewModel.players.observe(viewLifecycleOwner) {

                        players = it

                        val names = ArrayList<String>()
                        names.add("Add Players")
                        names.addAll(players.map { it.name })

                        val spinnerAdapter: ArrayAdapter<*> = ArrayAdapter<Any?>(
                            requireContext(),
                            R.layout.simple_spinner_item,
                            names as List<String>
                        )
                        spinnerAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
                        binding.addPlayerSpinner.adapter = spinnerAdapter
                    }
                }
                binding.refreshAddPlayerBt.isRefreshing = false
            } catch (e: Exception) {
                Log.i("Teams crash", e.toString())
            }
        }
    }

    private fun removeItem(item: Player, index: Int) {
        selected_players.removeAt(index)
        adapter.notifyItemRemoved(index)
        adapter.notifyItemRangeChanged(index, 1)
        Toast.makeText(view?.context, "${item.name} Removed", Toast.LENGTH_SHORT).show()

        if (selected_players.size == 0)
            binding.addPlayerSpinner.setSelection(0)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}