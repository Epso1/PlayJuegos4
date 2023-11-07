package com.example.playjuegos1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.RatingBar
import android.widget.SeekBar
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Preferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)

        val ratingBar = findViewById(R.id.ratingBar) as RatingBar
        val seekBar = findViewById(R.id.seekBar) as SeekBar
        val fab = findViewById(R.id.fab) as FloatingActionButton
        val rGroup = findViewById(R.id.radioGroup) as RadioGroup

        var opcion : String = ""
        var puntuacion : Float = 0f

        rGroup.setOnCheckedChangeListener { group, checkedId ->
            // Realiza una acción cuando se selecciona un radio button en el grupo
            val radioButton = findViewById<RadioButton>(checkedId)
            if (radioButton != null) {
                val text = radioButton.text.toString()
                opcion = text
            }
        }

        ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            puntuacion = ratingBar.rating
        }

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
               Toast.makeText(this@Preferences, seekBar.progress.toString(), Toast.LENGTH_LONG).show()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Método llamado cuando se comienza a arrastrar la SeekBar
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Método llamado cuando se suelta la SeekBar después de arrastrarla
            }
        })

        fab.setOnClickListener{
            if(opcion == ""){
                Toast.makeText(this, "No has pulsado ninguna opción", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "$opcion Puntuación: $puntuacion", Toast.LENGTH_SHORT).show()
            }

        }

    }
}