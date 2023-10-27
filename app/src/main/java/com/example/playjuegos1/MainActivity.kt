package com.example.playjuegos1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jugador = findViewById(R.id.button2) as Button

        jugador.setOnClickListener{lanzarNewPLayer()}
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            (R.id.action_search) -> {return true}
            (R.id.action_add) -> {return true}
            else -> {return super.onOptionsItemSelected(item)} }
    }

    private fun lanzarNewPLayer() {
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }




}
