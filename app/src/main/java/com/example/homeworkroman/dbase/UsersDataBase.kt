package com.example.homeworkroman.dbase

import com.example.homeworkroman.User

object UsersDataBase {

    private val usersList = arrayListOf<User>()

    fun addUser(user : User){
        usersList.add(user)
    }

    fun deleteUser(user : User){
        usersList.remove(user)
    }

    fun getListUsers() = usersList

}