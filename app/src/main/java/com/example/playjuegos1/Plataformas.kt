package com.example.playjuegos1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.TranslateAnimation
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.compose.material3.Snackbar
import androidx.core.os.HandlerCompat.postDelayed
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.snackbar.Snackbar

class Plataformas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plataformas_2)

        val datos = arrayOf( "Acción", "Aventura", "Deportes", "Disparos", "Estrategia", "Lucha", "Musical", "Rol", "Simulación") // Crear un ArrayAdapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, datos)
        val listView = findViewById<ListView>(R.id.listaGeneros)
        listView.adapter = adapter

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

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val itemText = listView.getItemAtPosition(position).toString()
            showToast(itemText)
        }

    }


    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}