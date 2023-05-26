package com.example.homeworkroman.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.homeworkroman.MessageUser
import com.example.homeworkroman.R
import java.util.*

class MessageViewHolder(private val view: View) : ViewHolder(view) {
    fun bind(message : MessageUser) {
        val title : TextView = view.findViewById(R.id.tFieldTitle)
        title.text = "${message.title}"
        val messageText : TextView = view.findViewById(R.id.tFieldMessage)
        messageText.text = "${message.textMessage}"
        val dateMsg : TextView? = null
        dateMsg?.text = Date().time.toString()
    }
}