package com.example.wsrfood1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wsrfood1.R
import com.example.wsrfood1.models.Dish

class RecyclerViewAdapter (private val dishes: ArrayList<Dish>) :
    RecyclerView.Adapter<RecyclerViewAdapter.DishViewHolder>() {
    class DishViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(dish: Dish) {
            itemView.findViewById<TextView>(R.id.textView).text = dish.name
            itemView.findViewById<TextView>(R.id.textView1).text = dish.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return DishViewHolder(inflater.inflate(R.layout.list_item_1, parent, false))
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        holder.bind(dishes[position])
    }

    override fun getItemCount(): Int {
        return 6
    }
}