package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class lunchadapter (var context: Context, var arrayList: ArrayList<lunchitem>) :
    RecyclerView.Adapter<lunchadapter.ItemHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
            val viewHolder = LayoutInflater.from(parent.context)
                .inflate(R.layout.grid_layout_list_item, parent, false)
            return ItemHolder(viewHolder)
        }

        override fun getItemCount(): Int {
            return arrayList.size
        }

        override fun onBindViewHolder(holder: ItemHolder, position: Int) {

            val charItem: lunchitem = arrayList.get(position)

            holder.icons.setImageResource(charItem.icons!!)
            holder.titles.text = charItem.alpha

            holder.titles.setOnClickListener {
                Toast.makeText(context, charItem.alpha, Toast.LENGTH_LONG).show()
            }

        }

        class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            var icons = itemView.findViewById<ImageView>(R.id.icon_image_view)
            var titles = itemView.findViewById<TextView>(R.id.title_text_view)

        }

}