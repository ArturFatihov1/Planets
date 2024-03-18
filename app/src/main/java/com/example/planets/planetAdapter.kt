package com.example.planets

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class planetAdapter: RecyclerView.Adapter<planetAdapter.UserViewHolder>() {

    var planetList = emptyList<Planet>()

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val title: TextView = itemView.findViewById(R.id.title)
        val moons: TextView = itemView.findViewById(R.id.moons)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.data_planet, parent , false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return planetList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
//        holder.itemView.title.text = planetList[position].title
//        holder.itemView.imageView.setImageResource(planetList[position].planetImage)
//        holder.itemView.moons.text = planetList[position].moons
        holder.imageView.setImageResource(planetList[position].planetImage)
        holder.title.text = planetList[position].title
        holder.moons.text = planetList[position].moons

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Planet>) {
        planetList = list
        notifyDataSetChanged()
    }
}