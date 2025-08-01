package com.example.composenavdestination

import android.os.Parcelable
import java.time.LocalDateTime
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String,
    val id: String,
    val created: LocalDateTime,
): Parcelable
