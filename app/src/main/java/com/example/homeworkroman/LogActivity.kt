package com.example.homeworkroman

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        val onClickTextView = findViewById<TextView>(R.id.log_text_view2)
        onClickTextView.setOnClickListener {
            val intent = Intent(this@LogActivity, SignActivity::class.java)
            startActivity(intent)
        }
    }
}