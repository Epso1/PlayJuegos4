package com.example.playjuegos1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Games : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games)

        val check1 = findViewById(R.id.checkBox1) as CheckBox
        val check2 = findViewById(R.id.checkBox2) as CheckBox
        val check3 = findViewById(R.id.checkBox3) as CheckBox
        val check4 = findViewById(R.id.checkBox4) as CheckBox
        val check5 = findViewById(R.id.checkBox5) as CheckBox
        val check6 = findViewById(R.id.checkBox6) as CheckBox
        val check7 = findViewById(R.id.checkBox7) as CheckBox
        val fab = findViewById(R.id.fab) as FloatingActionButton

        var opciones: ArrayList<String> = ArrayList()

        fab.setOnClickListener {
            if (opciones.isEmpty()) {
                Toast.makeText(this, "No has elegido ninguna opción", Toast.LENGTH_SHORT).show()
            } else {
                val opcionesConcatenadas = opciones.joinToString(", ")
                Toast.makeText(this, "Has elegido: $opcionesConcatenadas", Toast.LENGTH_SHORT).show()
            }
        }

        check1.setOnClickListener {
            if (check1.isChecked) {
                opciones.add(check1.text.toString())

            } else {
                opciones.remove(check1.text.toString())
            }
        }

        check2.setOnClickListener {
            if (check2.isChecked) {
                opciones.add(check2.text.toString())

            } else {
                opciones.remove(check2.text.toString())
            }
        }

        check3.setOnClickListener {
            if (check3.isChecked) {
                opciones.add(check3.text.toString())

            } else {
                opciones.remove(check3.text.toString())
            }
        }

        check4.setOnClickListener {
            if (check4.isChecked) {
                opciones.add(check4.text.toString())

            } else {
                opciones.remove(check4.text.toString())
            }
        }

        check5.setOnClickListener {
            if (check5.isChecked) {
                opciones.add(check5.text.toString())

            } else {
                opciones.remove(check5.text.toString())
            }
        }

        check6.setOnClickListener {
            if (check6.isChecked) {
                opciones.add(check6.text.toString())

            } else {
                opciones.remove(check6.text.toString())
            }
        }

        check7.setOnClickListener {
            if (check7.isChecked) {
                opciones.add(check7.text.toString())

            } else {
                opciones.remove(check7.text.toString())
            }
        }









    }
}