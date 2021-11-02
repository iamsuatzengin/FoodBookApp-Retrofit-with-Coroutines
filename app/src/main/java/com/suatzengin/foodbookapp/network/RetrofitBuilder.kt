package com.suatzengin.foodbookapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder {

    private val BASE_URL = "https://raw.githubusercontent.com/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}