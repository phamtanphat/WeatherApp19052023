package com.example.weatherapp19052023.data.api.dto

data class WeatherForecastFromCityDTO (
    val coord: Coord,
    val weather: List<Weather>,
    val base: String,
    val main: Main,
    val visibility: Long,
    val wind: Wind,
    val rain: RainFromCityDTO,
    val clouds: CloudsFromCityDTO,
    val dt: Long,
    val sys: SysFromCityDTO,
    val timezone: Long,
    val id: Long,
    val name: String,
    val cod: Long,
)