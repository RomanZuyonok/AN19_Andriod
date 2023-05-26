package com.example.homeworkroman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class LogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)
    }
    fun onSignUp(view: View){
        val onClickTextView = findViewById<TextView>(R.id.log_text_view2)
        onClickTextView.setOnClickListener{
            val intent = Intent(this@LogActivity, SignActivity::class.java)
            startActivity(intent)
        }
    }
}