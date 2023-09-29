package com.example.weatherapp19052023.data.api.dto.forecast_7day

data class Temp7DayDTO(
    val day: Double,
    val min: Double,
    val max: Double,
    val night: Double,
    val eve: Double,
    val morn: Double,
)