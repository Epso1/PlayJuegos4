package com.example.playjuegos1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class NewPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newplayer)

        val phoneEditText : EditText = findViewById(R.id.Phone)
        val telefonos = arrayOf("Teléfono1", "Teléfono2", "Teléfono3", "Teléfono4", "Teléfono5")
        val listaTelefonos: Spinner = findViewById(R.id.spinner)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, telefonos)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        listaTelefonos.adapter = adaptador

        listaTelefonos.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: android.view.View?, position: Int, id: Long) {
                val telefonoSeleccionado = telefonos[position]
                phoneEditText.setText(telefonoSeleccionado)
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {

            }
        }

    }

}