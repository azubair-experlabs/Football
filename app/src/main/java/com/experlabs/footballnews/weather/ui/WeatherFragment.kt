package com.experlabs.footballnews.weather.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.view.inputmethod.EditorInfo
import android.widget.AdapterView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.FragmentWeatherBinding
import com.experlabs.footballnews.weather.viewmodels.WeatherViewModel
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.fragmentScope
import org.koin.core.scope.Scope


class WeatherFragment : Fragment(), AndroidScopeComponent {

    private var _binding: FragmentWeatherBinding? = null

    override val scope: Scope by fragmentScope()
    private val viewModel by inject<WeatherViewModel>()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWeatherBinding.inflate(inflater, container, false)
        val root: View = binding.root

        activity?.setTitle(R.string.title_weather)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val animation = AnimationUtils.loadAnimation(context, R.anim.fall_down)

        binding.root.startAnimation(animation)

        binding.currentCard.visibility = View.GONE
        binding.locationCardview.visibility = View.GONE
        binding.airCard.visibility = View.GONE

        binding.searchLayout.editText?.setOnEditorActionListener { data, actionId, b ->
            if(actionId == EditorInfo.IME_ACTION_SEARCH) {
                loadData(data.text.toString())
            }
            true
        }
        binding.refreshWeatherBt.setOnRefreshListener {
            loadData(binding.searchLayout.editText?.text.toString())
        }
    }

    private fun loadData(params: String) {
        viewModel.getWeatherFromRepository(params) { flag, message ->
            try {
                if (flag) {
                    viewModel.weather.observe(viewLifecycleOwner) {
                        binding.currentWeatherItem = it.current
                        binding.locationItem = it.location
                        binding.airItem = it.current.air_quality

                        binding.currentCard.visibility = View.VISIBLE
                        binding.locationCardview.visibility = View.VISIBLE
                        binding.airCard.visibility = View.VISIBLE

                        val animation = AnimationUtils.loadAnimation(context, R.anim.righttoleft)
                        binding.currentCard.startAnimation(animation)
                        binding.locationCardview.startAnimation(animation)
                        binding.airCard.startAnimation(animation)
                    }
//                    Toast.makeText(view?.context, "Weather Fetched", Toast.LENGTH_SHORT).show()
                } else {
                    Log.i("Weather API", message)
                    Toast.makeText(view?.context, "Error: $message", Toast.LENGTH_LONG)
                        .show()
                }
                binding.refreshWeatherBt.isRefreshing = false
            } catch (e: Exception) {
                Log.i("Weather crash", e.toString())
            }
        }
    }

    override fun onStop() {
        super.onStop()
        this.viewModel.weather.removeObservers(viewLifecycleOwner)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

//        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                view?.let {
//                    loadData(parent.selectedItem.toString())
//                }
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                // sometimes you need nothing here
//            }
//        }