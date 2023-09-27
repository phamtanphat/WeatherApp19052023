package com.example.weatherapp19052023.data.api.dto

import com.google.gson.annotations.SerializedName

data class MainFromCityDTO(
    val temp: Long,
    @SerializedName("feels_like")
    val feelsLike: Double,
    @SerializedName("temp_min")
    val tempMin: Long,
    @SerializedName("temp_max")
    val tempMax: Long,
    val pressure: Long,
    val humidity: Long,
    @SerializedName("sea_level")
    val seaLevel: Long,
    @SerializedName("grnd_level")
    val grndLevel: Long,
)