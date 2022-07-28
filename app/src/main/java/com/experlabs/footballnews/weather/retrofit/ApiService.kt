package com.experlabs.footballnews.weather.retrofit


import com.experlabs.footballnews.weather.models.WeatherData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {

    @GET("/v1/current.json?key=a7b4e52cf7ba4281b8b64737221407&aqi=yes")
    fun fetchWeather(@Query("q") location : String): Call<WeatherData?>
}