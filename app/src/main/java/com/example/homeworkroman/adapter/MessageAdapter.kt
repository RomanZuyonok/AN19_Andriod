package com.example.homeworkroman.adapter

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworkroman.MessageUser
import com.example.homeworkroman.R

class MessageAdapter() : RecyclerView.Adapter<MessageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_message, parent, false)
        return MessageViewHolder(view)
    }

    private var messageUserList = arrayListOf<MessageUser>()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.bind(messageUserList[position])
    }

    override fun getItemCount() = messageUserList.size

    fun setList(list: ArrayList<MessageUser>) {
        this.messageUserList = list
        notifyDataSetChanged()
    }
}