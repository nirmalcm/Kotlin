package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler.*
import java.util.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        supportActionBar?.title = "Legends"
        initRecyclerView()
    }

    private fun initRecyclerView() {
        recycler_view.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val users = ArrayList<RecyclerViewModel>()
        users.add(RecyclerViewModel("Leo Messi", "Argentina"))
        users.add(RecyclerViewModel("Christopher Nolan", "USA"))
        users.add(RecyclerViewModel("RDJ", "USA"))
        users.add(RecyclerViewModel("MS Dhoni", "India"))

        var adapter = RecyclerViewAdapter(users)
        recycler_view.adapter = adapter
    }
}
