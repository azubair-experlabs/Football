package com.experlabs.footballnews.portal.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Player (
    val name : String = "",
    val number : String = "",
    val nationality : String = "",
    val description: String = "",
    val picture_url : String = "",
    val matches_played : String = "",
    val total_goals : String = "",
    val total_assists : String = "",
    val penalty_kicks : String = ""
) : Parcelable
