package com.example.weatherapp19052023.data.api.dto

data class WeatherFromCityDTO(
    val id: Long,
    val main: String,
    val description: String,
    val icon: String,
)