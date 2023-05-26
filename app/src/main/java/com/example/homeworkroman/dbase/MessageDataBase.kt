package com.example.homeworkroman.dbase

import com.example.homeworkroman.MessageUser
import com.example.homeworkroman.Subscriber

object MessageDataBase {

    private val listSubscribers = arrayListOf<Subscriber>()

    private val messageUserList = arrayListOf<MessageUser>()

    fun addMessage(message: MessageUser) {
        messageUserList.add(message)
        notifySubscribers()
    }


    fun getListMessage() = messageUserList

    fun subscribe(s: Subscriber) {
        listSubscribers.add(s)
    }

    fun unsubscribe(s: Subscriber) {
        listSubscribers.remove(s)
    }

    private fun notifySubscribers() {
        listSubscribers.forEach {
            it.update()
        }
    }
}