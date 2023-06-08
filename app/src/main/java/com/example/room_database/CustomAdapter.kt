package com.example.room_database

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataList: ArrayList<NoteModel>):
    RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {
        class CustomViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
            val title = itemview.findViewById<TextView>(R.id.sample_title)
            val description = itemview.findViewById<TextView>(R.id.sample_desc)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val item=LayoutInflater.from(parent.context).inflate(R.layout.custom_layout,parent,false)
        return CustomViewHolder(item)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.title.text=dataList[position].title
        holder.description.text=dataList[position].description
    }
    override fun getItemCount(): Int {
        return dataList.size
    }

}