package com.dicoding.listclub

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ClubPlayer(
    val poster: Int,
    val playName: String,
    val playPosition: String
) : Parcelable