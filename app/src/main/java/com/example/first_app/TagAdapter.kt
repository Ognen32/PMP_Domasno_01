package com.example.first_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView // Ова е ново
import com.google.android.material.button.MaterialButton
import androidx.recyclerview.widget.RecyclerView

class TagAdapter(private val tags: List<String>) : RecyclerView.Adapter<TagAdapter.TagViewHolder>() {

    class TagViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Промени го ова во TextView бидејќif во новиот XML е TextView
        val btnTagName: TextView = view.findViewById(R.id.btnTagName)
        val btnEdit: MaterialButton = view.findViewById(R.id.btnEdit)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tag, parent, false)
        return TagViewHolder(view)
    }

    override fun onBindViewHolder(holder: TagViewHolder, position: Int) {
        holder.btnTagName.text = tags[position]
    }

    override fun getItemCount() = tags.size
}