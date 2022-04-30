package com.dicoding.listclub

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Club(
    val clubName : String,
    val coach : String,
    val stadium : String,
    val established : String,
    val nickName : String,
    val description : String,
    val poster : Int
) : Parcelable
