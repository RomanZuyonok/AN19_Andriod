package com.example.homeworkroman

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        val onClickTextView = findViewById<TextView>(R.id.sign_text_view2)
        onClickTextView.setOnClickListener {
            val intent = Intent(this@SignActivity, LogActivity::class.java)
            startActivity(intent)
        }
    }
}