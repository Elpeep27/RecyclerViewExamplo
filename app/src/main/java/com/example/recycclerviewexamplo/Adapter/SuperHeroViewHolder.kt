package com.example.recycclerviewexamplo.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycclerviewexamplo.R
import com.example.recycclerviewexamplo.SuperHero
import com.example.recycclerviewexamplo.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero,  onClickListener:(SuperHero) ->Unit){

        binding.tvSuperHeroName.text =superHeroModel.superhero
        binding.tvRealName.text =superHeroModel.realName
        binding.tvPublisher.text =superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)




        itemView.setOnClickListener{onClickListener(superHeroModel)}
    }
}