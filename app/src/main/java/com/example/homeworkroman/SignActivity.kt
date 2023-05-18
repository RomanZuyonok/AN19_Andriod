package com.example.homeworkroman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
    }

    fun onLogIn(view: View){
        val onClickTextView = findViewById<TextView>(R.id.sign_text_view2)
        onClickTextView.setOnClickListener{
            val intent = Intent(this@SignActivity, LogActivity::class.java)
            startActivity(intent)
        }
    }
}