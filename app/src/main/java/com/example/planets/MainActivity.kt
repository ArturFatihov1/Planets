package com.example.planets

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.planets.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: planetAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        initial()
    }
    private fun initial(){
        recyclerView = binding.rcView
        adapter = planetAdapter()
        recyclerView.adapter = adapter
        adapter.setList(myPlanet())
    }

    fun myPlanet():ArrayList<Planet>{
        val planetList = ArrayList<Planet>()

        val planet1 = Planet(R.drawable.earth, "earth", "moons: 1")
        planetList.add(planet1)

        val planet2 = Planet(R.drawable.jupiter, "jupiter", "moons: 79")
        planetList.add(planet2)

        val planet3 = Planet(R.drawable.mars, "mars", "moons: 2")
        planetList.add(planet3)

        val planet4 = Planet(R.drawable.mercury, "mercury", "moons: 0")
        planetList.add(planet4)

        val planet5 = Planet(R.drawable.neptune, "neptune", "moons: 14")
        planetList.add(planet5)

        val planet6 = Planet(R.drawable.pluto, "pluto", "moons: 0")
        planetList.add(planet5)

        val planet7 = Planet(R.drawable.saturn, "saturn", "moons: 83")
        planetList.add(planet7)

        val planet8 = Planet(R.drawable.uranus, "uranus", "moons: 27")
        planetList.add(planet8)

        val planet9 = Planet(R.drawable.venus, "venus", "moons: 0")
        planetList.add(planet9)

        return planetList
    }

}