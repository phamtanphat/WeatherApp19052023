package com.example.weatherapp19052023.data.api.dto.forecast_7day

import com.google.gson.annotations.SerializedName

data class WeatherForecast7dayDTO(
    val city: City7DayDTO,
    val cod: String,
    val message: Double,
    val cnt: Long,
    @SerializedName("list")
    val listWeather7DayDTO: List<Weather7DayDTO>,
)