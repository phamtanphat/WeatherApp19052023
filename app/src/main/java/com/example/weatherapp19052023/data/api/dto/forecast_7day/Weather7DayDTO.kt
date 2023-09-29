package com.example.weatherapp19052023.data.api.dto.forecast_7day

import com.example.weatherapp19052023.data.api.dto.WeatherDetailDTO
import com.google.gson.annotations.SerializedName

data class Weather7DayDTO(
    val dt: Long,
    val sunrise: Long,
    val sunset: Long,
    @SerializedName("temp")
    val temp7DayDTO: Temp7DayDTO,
    @SerializedName("feels_like")
    val feelsLike7DayDTO: FeelsLike7DayDTO,
    val pressure: Long,
    val humidity: Long,
    @SerializedName("weather")
    val listWeatherDetailDTO: List<WeatherDetailDTO>,
    val speed: Double,
    val deg: Long,
    val gust: Double,
    val clouds: Long,
    val pop: Double
)