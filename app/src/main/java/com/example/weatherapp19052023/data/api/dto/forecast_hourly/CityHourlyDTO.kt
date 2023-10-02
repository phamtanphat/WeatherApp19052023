package com.example.weatherapp19052023.data.api.dto.forecast_hourly

data class CityHourlyDTO(
    val id: Long,
    val name: String,
    val coordHourlyDTO: CoordHourlyDTO,
    val country: String,
    val population: Long,
    val timezone: Long,
    val sunrise: Long,
    val sunset: Long,
)