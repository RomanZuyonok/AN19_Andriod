package com.example.homeworkroman

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworkroman.adapter.ListMessageAdapter
import com.example.homeworkroman.dbase.MessageDataBase

class AllNotesActivity : AppCompatActivity(), Subscriber {

    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_notes)

        MessageDataBase.subscribe(this)
        recyclerView = findViewById(R.id.notes_recyclerView)
        recyclerView?.run {
            layoutManager = LinearLayoutManager(this@AllNotesActivity)
            adapter = ListMessageAdapter()
            (adapter as? ListMessageAdapter)?.submitList(MessageDataBase.getListMessage())


        }
    }

    override fun update() {
        recyclerView?.run {
            if (adapter == null){
                layoutManager=LinearLayoutManager(this@AllNotesActivity)
                adapter = ListMessageAdapter()
            }
            (adapter as? ListMessageAdapter)?.submitList(MessageDataBase.getListMessage())
            adapter?.notifyDataSetChanged()
        }
    }
}