package com.example.recycclerviewexamplo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycclerviewexamplo.Adapter.SuperHeroAdapter
import com.example.recycclerviewexamplo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {




        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }


    }

    private fun initRecyclerView() {
        val manager =LinearLayoutManager(this)

         binding.recyclerSuperHero.layoutManager = manager
         binding.recyclerSuperHero.adapter =

             SuperHeroAdapter(SuperHeroProvider.superHeroList) {superhero ->
                 onItemSelected(
                     superhero
                 )

             }

    }

    fun onItemSelected(superHero: SuperHero){

        Toast.makeText(this,superHero.superhero, Toast.LENGTH_SHORT).show()

    }
}