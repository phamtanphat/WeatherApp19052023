package com.example.weatherapp19052023.data.api.dto.forecast_hourly

import com.google.gson.annotations.SerializedName

data class MainHourlyDTO(
    val temp: Double,
    @SerializedName("feels_like")
    val feelsLike: Double,
    @SerializedName("temp_min")
    val tempMin: Double,
    @SerializedName("temp_max")
    val tempMax: Double,
    val pressure: Long,
    @SerializedName("sea_level")
    val seaLevel: Long,
    @SerializedName("grnd_level")
    val grndLevel: Long,
    val humidity: Long,
    @SerializedName("temp_kf")
    val tempKf: Double,
)