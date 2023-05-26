package com.example.homeworkroman.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.homeworkroman.MessageUser
import com.example.homeworkroman.R

class ListMessageAdapter : ListAdapter<MessageUser, MessageViewHolder>(
    object : DiffUtil.ItemCallback<MessageUser>() {
        override fun areItemsTheSame(oldItem: MessageUser, newItem: MessageUser): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: MessageUser, newItem: MessageUser): Boolean {
            return oldItem == newItem
        }
    }
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.item_message, parent, false)
        return MessageViewHolder(view)
    }


    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}