package com.experlabs.footballnews.portal.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Team(
    val name : String = "",
    val flag_url : String = "",
    val country : String = "",
    val points : String = "",
    val description: String = "",
    val team : ArrayList<Player>? = null
) : Parcelable
