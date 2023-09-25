package com.example.weatherapp19052023.data.api.dto

data class SysFromCityDTO(
    val type: Long,
    val id: Long,
    val country: String,
    val sunrise: Long,
    val sunset: Long
)