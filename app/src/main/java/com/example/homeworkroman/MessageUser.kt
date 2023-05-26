package com.example.homeworkroman

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MessageUser(
    val title: String,
    val textMessage: String,
    val date : Long
) : Parcelable
