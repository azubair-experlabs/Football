package com.experlabs.footballnews.weather.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u000fJ2\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/experlabs/footballnews/weather/viewmodels/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/experlabs/footballnews/weather/repository/WeatherRepository;", "(Lcom/experlabs/footballnews/weather/repository/WeatherRepository;)V", "weather", "Landroidx/lifecycle/LiveData;", "Lcom/experlabs/footballnews/weather/models/WeatherData;", "getWeather", "()Landroidx/lifecycle/LiveData;", "getWeatherFromRepository", "", "params", "", "callback", "Lkotlin/Function2;", "", "response", "flag", "message", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final com.experlabs.footballnews.weather.repository.WeatherRepository repository = null;
    
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.experlabs.footballnews.weather.repository.WeatherRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.experlabs.footballnews.weather.models.WeatherData> getWeather() {
        return null;
    }
    
    public final void getWeatherFromRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String params, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
    }
    
    private final void response(boolean flag, java.lang.String message, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
    }
}