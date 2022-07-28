package com.experlabs.footballnews.portal.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News(
    val title: String = "",
    val description: String = "",
    val url: String = "",
    val type: String = ""
) : Parcelable