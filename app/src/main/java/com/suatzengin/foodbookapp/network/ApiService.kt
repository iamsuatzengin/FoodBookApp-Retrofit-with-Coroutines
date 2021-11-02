package com.suatzengin.foodbookapp.network

import com.suatzengin.foodbookapp.model.Food
import retrofit2.http.GET

interface ApiService {

    @GET("atilsamancioglu/BTK20-JSONVeriSeti/master/besinler.json")
    suspend fun getFoods(): List<Food>
}