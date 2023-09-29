package com.example.weatherapp19052023.data.api.dto.forecast_7day

data class City7DayDTO(
    val id: Long,
    val name: String,
    val coord7DayDTO: Coord7DayDTO,
    val country: String,
    val population: Long,
    val timezone: Long,
)