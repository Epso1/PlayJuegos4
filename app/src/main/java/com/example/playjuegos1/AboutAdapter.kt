package com.example.playjuegos1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class AboutAdapter: RecyclerView.Adapter<AboutAdapter.AboutViewHolder>()  {

    val nombres = arrayOf("María Mata", "Antonio Sanz", "Carlos", "Berta", "Héctor Campos", "Ismael", "Rodrigo", "Mohammed")
    val fechas = arrayOf("2014", "1890", "967", "945", "879", "678", "498", "1945")
    private val imagenes = listOf(R.drawable.image1, R.drawable.image2, R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8)

    class AboutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewAboutNombre: TextView = itemView.findViewById(R.id.TextViewNombre)
        val textViewAboutFecha: TextView = itemView.findViewById(R.id.TextViewFecha)
        val imageViewAbout: ImageView = itemView.findViewById(R.id.ImageViewAbout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_about, parent, false)
        return AboutViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  nombres.size
    }

    override fun onBindViewHolder(holder: AboutAdapter.AboutViewHolder, position: Int) {
        holder.textViewAboutNombre.text = nombres[position]
        holder.textViewAboutFecha.text = fechas[position]
        holder.imageViewAbout.setImageResource(imagenes[position])

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, nombres[position], Toast.LENGTH_SHORT).show()
        }
    }
}