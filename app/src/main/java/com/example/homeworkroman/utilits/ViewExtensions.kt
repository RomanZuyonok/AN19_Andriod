package com.example.homeworkroman.utilits

import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.getText(): String {
    return editText?.text?.toString() ?: ""
}