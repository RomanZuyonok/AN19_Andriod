package com.example.homeworkroman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onPlatform(view : View){
        val button = findViewById<Button>(R.id.discover_platform)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, InfoOneActivity::class.java)
            startActivity(intent)
        }
    }
    fun onLogIn(view: View){
        val onClickTextView = findViewById<TextView>(R.id.main_text_view2)
        onClickTextView.setOnClickListener{
            val intent = Intent(this@MainActivity, LogActivity::class.java)
            startActivity(intent)
        }
    }

}