package com.experlabs.footballnews.weather.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/experlabs/footballnews/weather/retrofit/ApiService;", "", "fetchWeather", "Lretrofit2/Call;", "Lcom/experlabs/footballnews/weather/models/WeatherData;", "location", "", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/v1/current.json?key=a7b4e52cf7ba4281b8b64737221407&aqi=yes")
    public abstract retrofit2.Call<com.experlabs.footballnews.weather.models.WeatherData> fetchWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String location);
}