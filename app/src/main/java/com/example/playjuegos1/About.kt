package com.example.playjuegos1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewAbout)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = AboutAdapter()
        recyclerView.adapter = adapter
    }
}