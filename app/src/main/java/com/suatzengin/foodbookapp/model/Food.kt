package com.suatzengin.foodbookapp.model

import com.google.gson.annotations.SerializedName

data class Food(
    @SerializedName("isim") val isim: String,
    @SerializedName("kalori") val kalori: String,
    @SerializedName("karbonhidrat") val karbonhidrat: String,
    @SerializedName("protein") val protein : String,
    @SerializedName("gorsel") val gorsel: String,
)
