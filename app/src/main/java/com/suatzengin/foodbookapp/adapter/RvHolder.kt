package com.suatzengin.foodbookapp.adapter


import androidx.recyclerview.widget.RecyclerView
import com.suatzengin.foodbookapp.databinding.FoodItemRowBinding
import com.suatzengin.foodbookapp.model.Food
import com.suatzengin.foodbookapp.util.bindImage

class RvHolder(
    private var binding: FoodItemRowBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(food: Food) {
        binding.ivFood.bindImage(food.gorsel)
        binding.foodName.text = food.isim
        binding.foodCarbohydrate.text = food.karbonhidrat
        binding.foodProtein.text = food.protein
        binding.foodCalori.text = food.kalori
    }
}
