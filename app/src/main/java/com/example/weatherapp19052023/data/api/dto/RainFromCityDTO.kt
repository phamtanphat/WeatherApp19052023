package com.example.weatherapp19052023.data.api.dto

import com.google.gson.annotations.SerializedName

data class RainFromCityDTO(
    @SerializedName("1h")
    val precipitation: Double
)