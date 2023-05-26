package com.example.homeworkroman

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val firstName : String,
    val lastName : String,
    val emailUser : String
) : Parcelable