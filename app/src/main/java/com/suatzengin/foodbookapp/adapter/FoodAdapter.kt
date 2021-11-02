package com.suatzengin.foodbookapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.suatzengin.foodbookapp.databinding.FoodItemRowBinding
import com.suatzengin.foodbookapp.model.Food

class FoodAdapter() : RecyclerView.Adapter<RvHolder>() {

    var foodList: List<Food> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvHolder {
        return RvHolder(
            FoodItemRowBinding.inflate(LayoutInflater.from(parent.context))
        )
    }

    override fun onBindViewHolder(holder: RvHolder, position: Int) {
        val food = foodList[position]
        holder.bind(food)
    }

    override fun getItemCount(): Int = foodList.size


}