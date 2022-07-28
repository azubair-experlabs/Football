package com.experlabs.footballnews.weather.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.experlabs.footballnews.weather.models.WeatherData
import com.experlabs.footballnews.weather.repository.WeatherRepository
import kotlinx.coroutines.launch

class WeatherViewModel(private val repository: WeatherRepository) : ViewModel() {
    val weather: LiveData<WeatherData>
        get() = repository.weather


    fun getWeatherFromRepository(params: String, callback: (Boolean, String) -> Unit) {
        viewModelScope.launch {
            repository.getWeatherFromApi(params) { flag, message ->
                response(flag, message, callback)
            }
        }
    }

    private fun response(flag: Boolean, message: String, callback: (Boolean, String) -> Unit) {
        callback(flag, message)
    }
}