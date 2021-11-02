package com.suatzengin.foodbookapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.suatzengin.foodbookapp.model.Food
import com.suatzengin.foodbookapp.network.RetrofitBuilder
import kotlinx.coroutines.launch

class FoodListViewModel: ViewModel() {

    val foodList: MutableLiveData<List<Food>> = MutableLiveData()

    fun getFoodList(){
        viewModelScope.launch {
            try {
                val list = RetrofitBuilder().api.getFoods()
                foodList.value = list
            }
            catch (e: Exception){
                Log.d("fragment", "getPost: ${e.message}")
            }
        }
    }

}