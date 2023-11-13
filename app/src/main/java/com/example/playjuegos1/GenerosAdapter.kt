package com.example.playjuegos1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GenerosAdapter() : RecyclerView.Adapter<GenerosAdapter.GeneroViewHolder>() {

    val generosData = arrayOf("Acción", "Aventura", "Deportes", "Disparos", "Estrategia", "Lucha", "Musical", "Rol", "Simulación")


    class GeneroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewGenero: TextView = itemView.findViewById(R.id.textViewGenero)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneroViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_genero, parent, false)
        return GeneroViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: GeneroViewHolder, position: Int) {
        val genero = generosData[position]
        holder.textViewGenero.text = genero

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, genero, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return generosData.size
    }

}
