package com.experlabs.footballnews.weather.models

import com.google.gson.annotations.SerializedName


data class AirQuality(
    private val co: Double,
    @SerializedName("gb-defra-index") val gb_defra_index: Int,
    private val no2: Double,
    private val o3: Double,
    private val pm10: Double,
    private val pm2_5: Double,
    private val so2: Double,
    @SerializedName("us-epa-index") val us_epa_index: Int
)
{
    fun sliced_co() : String {
        val temp = co.toString()
        if (temp.length > 5)
            return temp.take(6)
        return temp
    }

    fun sliced_no2() : String {
        val temp = no2.toString()
        if (temp.length > 5)
            return temp.take(6)
        return temp
    }

    fun sliced_o3() : String {
        val temp = o3.toString()
        if (temp.length > 5)
            return temp.take(6)
        return temp
    }

    fun sliced_so2() : String {
        val temp = so2.toString()
        if (temp.length > 5)
            return temp.take(6)
        return temp
    }

    fun sliced_pm10() : String {
        val temp = pm10.toString()
        if (temp.length > 5)
            return temp.take(6)
        return temp
    }

    fun sliced_pm2_5() : String {
        val temp = pm2_5.toString()
        if (temp.length > 5)
            return temp.take(6)
        return temp
    }


}