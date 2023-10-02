package com.example.weatherapp19052023.data.api.dto.forecast_hourly

data class WeatherForecastHourlyDTO(
    val cod: String,
    val message: Long,
    val cnt: Long,
    val list: List<WeatherHourlyDTO>,
    val city: CityHourlyDTO
)