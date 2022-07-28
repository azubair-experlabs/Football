package com.experlabs.footballnews.weather.models

data class Current(
    val air_quality: AirQuality? = null,
    val cloud: String,
    val condition: Condition,
    val feelslike_c: String,
    val humidity: String,
    val is_day: String,
    val last_updated: String,
    val precip_mm: String,
    val temp_c: String,
    val uv: String,
    val vis_km: String,
    val wind_degree: String,
    val wind_dir: String,
    val wind_mph: String
)