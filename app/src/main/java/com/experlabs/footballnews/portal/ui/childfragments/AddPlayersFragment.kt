package com.experlabs.footballnews.portal.ui.childfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.experlabs.footballnews.databinding.FragmentAddplayersBinding
import com.experlabs.footballnews.portal.viewmodels.PortalViewModel
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope

class AddPlayersFragment : Fragment(), AndroidScopeComponent {

    private var _binding : FragmentAddplayersBinding? = null

    private val binding get() = _binding!!

    override val scope : Scope by fragmentScope()
    private val viewModel by inject<PortalViewModel>()

    private lateinit var name : TextView
    private lateinit var picture_url : TextView
    private lateinit var description : TextView
    private lateinit var matches : TextView
    private lateinit var nationality : String
    private lateinit var number : TextView
    private lateinit var goals: TextView
    private lateinit var assists : TextView
    private lateinit var kicks : TextView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAddplayersBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        name = binding.addplayernameTextbox
        picture_url = binding.addPlayerUrlTextbox
        description = binding.addplayerDescriptionTextbox
        assists = binding.addAssistsTextbox
        goals = binding.addgoalsTextbox
        number = binding.addplayernumberTextbox
        matches = binding.addMatchesTextbox
        kicks = binding.addkicksTextbox

        binding.addplayerBt.setOnClickListener {
            if (number.text.isNotEmpty() &&
                goals.text.isNotEmpty() &&
                assists.text.isNotEmpty() &&
                matches.text.isNotEmpty() &&
                name.text.isNotEmpty() &&
                kicks.text.isNotEmpty() &&
                picture_url.text.isNotEmpty() &&
                description.text.isNotEmpty()
            ) {

                nationality = binding.addplayernationalitySpinner.selectedItem.toString()

                viewModel.postPlayerInRepository(
                    name.text.toString(),
                    number.text.toString(),
                    nationality,
                    picture_url.text.toString(),
                    matches.text.toString(),
                    goals.text.toString(),
                    assists.text.toString(),
                    kicks.text.toString(),
                    description.text.toString()
                ) { flag, message ->
                    if (flag) {
                        name.text = ""
                        number.text = ""
                        nationality = ""
                        picture_url.text = ""
                        matches.text = ""
                        goals.text = ""
                        assists.text = ""
                        kicks.text = ""
                        description.text = ""
                        Toast.makeText(view.context, message, Toast.LENGTH_SHORT).show()
                    } else
                        Toast.makeText(view.context, message, Toast.LENGTH_SHORT).show()
                }
            } else
                Toast.makeText(view.context, "Please fill all the boxes!", Toast.LENGTH_SHORT)
                    .show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}