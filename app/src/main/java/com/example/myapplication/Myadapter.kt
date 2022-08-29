package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Myadapter  (private val newsList: ArrayList<News>):
    RecyclerView.Adapter<Myadapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myadapter.MyViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: Myadapter.MyViewHolder, position: Int) {
        val currentItem =newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.textView.text=currentItem.textView
        holder.textView2.text=currentItem.textView2
    }


    override fun getItemCount(): Int {
        return newsList.size
    }
    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val titleImage: ShapeableImageView =itemView.findViewById(R.id.imageView)
        val textView: TextView =itemView.findViewById(R.id.textView)
        val textView2:TextView=itemView.findViewById(R.id.textView2)
    }
}