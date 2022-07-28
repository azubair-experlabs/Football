package com.experlabs.footballnews.weather.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.experlabs.footballnews.weather.models.WeatherData
import com.experlabs.training.retrofit.RetrofitObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherRepository(private val retrofit: RetrofitObject) {

    private val weatherLiveData = MutableLiveData<WeatherData>()

    val weather: LiveData<WeatherData>
        get() = weatherLiveData

    suspend fun getWeatherFromApi(params: String, callback: (Boolean, String) -> Unit) {

        val retrofitCallback = object : Callback<WeatherData?> {
            override fun onFailure(call: Call<WeatherData?>, t: Throwable) {
                callback(false, t.toString().substringAfterLast(':'))
            }

            override fun onResponse(call: Call<WeatherData?>, response: Response<WeatherData?>) {
                Log.i("Weather Response", response.message())
                response.body()?.let {
                    weatherLiveData.postValue(it)
                    callback(true, "SUCCESS")
                }
            }
        }
        retrofit.getInstance().fetchWeather(params).enqueue(retrofitCallback)
    }
}
