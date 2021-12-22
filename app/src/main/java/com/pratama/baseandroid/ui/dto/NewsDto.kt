package com.pratama.baseandroid.ui.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NewsDto(
    val cnt: String
) : Parcelable