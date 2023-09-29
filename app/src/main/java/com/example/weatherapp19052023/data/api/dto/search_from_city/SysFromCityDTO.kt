package com.example.weatherapp19052023.data.api.dto.search_from_city

data class SysFromCityDTO(
    val type: Long,
    val id: Long,
    val country: String,
    val sunrise: Long,
    val sunset: Long
)