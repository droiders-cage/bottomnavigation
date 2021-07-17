package com.steve.bottomnavigation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.steve.bottomnavigation.databinding.PersonItemBinding

class MainAdapter:RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    class MainViewHolder(private val itemView: PersonItemBinding) : RecyclerView.ViewHolder(itemView.root) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(PersonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 34
}