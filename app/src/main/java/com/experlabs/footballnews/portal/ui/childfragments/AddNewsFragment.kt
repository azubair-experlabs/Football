package com.experlabs.footballnews.portal.ui.childfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.FragmentAddnewsBinding
import com.experlabs.footballnews.portal.viewmodels.PortalViewModel
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope


class AddNewsFragment : Fragment(), AndroidScopeComponent {

    private var url_optional: Boolean = false
    private var youtube_check: Boolean = false

    private var _binding: FragmentAddnewsBinding? = null

    override val scope : Scope by fragmentScope()
    private val viewModel by inject<PortalViewModel>()

    private lateinit var title : TextView
    private lateinit var url : TextView
    private lateinit var description : TextView
    private lateinit var type : String
    private lateinit var radioGroup: RadioGroup


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAddnewsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        title = binding.addtitleTextbox
        url = binding.addurlTextbox
        description = binding.addDescriptionTextbox
        radioGroup = binding.radioGroup

        binding.addnewsBt.setOnClickListener {
            if (radioGroup.checkedRadioButtonId != -1 &&
                title.text.isNotEmpty() &&
                (url.text.isNotEmpty() || url_optional) &&
                description.text.isNotEmpty()
            ) {

                viewModel.postNewsInRepository(
                    title.text.toString(),
                    description.text.toString(),
                    url.text.toString(),
                    type
                ) { flag, message ->
                    if (flag) {
                        title.text = ""
                        description.text = ""
                        url.text = ""
                        radioGroup.check(-1)
                        Toast.makeText(view.context, message, Toast.LENGTH_SHORT).show()
                    }
                    else
                        Toast.makeText(view.context, message, Toast.LENGTH_SHORT).show()
                }
            } else
                Toast.makeText(view.context, "Please fill all the boxes!", Toast.LENGTH_SHORT)
                    .show()
        }

        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.fact_radiobt -> {
                    type = "fact"
                    binding.addurlTextbox.hint = "Picture URL(Optional)"
                    url_optional = true
                }
                R.id.link_radiobt -> {
                    type = "link"
                    binding.addurlTextbox.hint = "Add News URL"
                    url_optional = false
                }
                R.id.video_radiobt -> {
                    type = "video"
                    binding.addurlTextbox.hint = "Add Youtube URL"
                    url_optional = false
                    youtube_check = true
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}