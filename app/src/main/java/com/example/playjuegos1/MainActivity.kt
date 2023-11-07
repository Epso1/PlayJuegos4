package com.example.playjuegos1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jugador = findViewById(R.id.button2) as Button
        val preferences = findViewById(R.id.button3) as Button
        val jugar = findViewById(R.id.button1) as Button
        val sobre = findViewById(R.id.button4) as Button

        jugador.setOnClickListener{
            lanzarNewPLayer()
            android.widget.Toast.makeText(this, "Has pulsado el material button", android.widget.Toast.LENGTH_SHORT).show()

        }

        preferences.setOnClickListener{
            lanzarPreferences()
            android.widget.Toast.makeText(this, "Has pulsado el material button", android.widget.Toast.LENGTH_SHORT).show()

        }


        jugar.setOnClickListener{
            lanzarPlay()
            android.widget.Toast.makeText(this, "Has pulsado el material button", android.widget.Toast.LENGTH_SHORT).show()
        }

        sobre.setOnClickListener{Toast.makeText(this, "Has pulsado el material button", Toast.LENGTH_SHORT).show()}


    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            (R.id.action_search) -> { val intent = Intent(this, Plataformas::class.java)
                startActivity(intent)
                return true}
            (R.id.action_add) -> {return true}
            else -> {return super.onOptionsItemSelected(item)} }
    }



    private fun lanzarNewPLayer() {
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

    private fun lanzarPreferences(){
        val i = Intent(this, Preferences::class.java)
        startActivity(i)
    }

    private fun lanzarPlay(){
        val i = Intent(this, Games::class.java)
        startActivity(i)
    }




}
