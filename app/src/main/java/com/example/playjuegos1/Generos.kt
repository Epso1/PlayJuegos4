package com.example.playjuegos1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.snackbar.Snackbar

class Generos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generos)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewGeneros)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = GenerosAdapter()
        recyclerView.adapter = adapter


        val fab = findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.fab)

        fab.setOnClickListener {
            Snackbar.make(fab, "El botón se desplaza hacia arriba", Snackbar.LENGTH_SHORT).show()
        }

        val chipGroup = findViewById<ChipGroup>(R.id.chip_group)

        for (i in 0 until chipGroup.childCount) {
            val chip = chipGroup.getChildAt(i) as Chip
            chip.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    val chipText = chip.text.toString()
                    showToast(chipText)
                }
            }
        }



    }


    public fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}