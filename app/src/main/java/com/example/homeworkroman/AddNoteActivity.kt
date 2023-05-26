package com.example.homeworkroman

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.homeworkroman.dbase.MessageDataBase
import com.example.homeworkroman.utilits.getText
import com.google.android.material.textfield.TextInputLayout
import java.util.*

class AddNoteActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        val titleInputLayout = findViewById<TextInputLayout>(R.id.tFieldTitle)
        val messageInputLayout = findViewById<TextInputLayout>(R.id.tFieldMessage)
        findViewById<Button>(R.id.button_add_msg).setOnClickListener{
            val title : String = titleInputLayout.getText()
            val message : String = messageInputLayout.getText()
            val date : Long = Date().time
            val messageUser = MessageUser(title, message, date)
            MessageDataBase.addMessage(messageUser)
            Toast.makeText(this, R.string.toast_msg_add, Toast.LENGTH_LONG).show()
            finish()
        }
    }
}