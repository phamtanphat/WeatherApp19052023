package com.example.weatherapp19052023.data.api.dto

data class WeatherForecastFromCityDTO (
    val coord: CoordFromCityDTO,
    val weatherFromCityDTO: List<WeatherFromCityDTO>,
    val base: String,
    val mainFromCityDTO: MainFromCityDTO,
    val visibility: Long,
    val windFromCityDTO: WindFromCityDTO,
    val rain: RainFromCityDTO,
    val clouds: CloudsFromCityDTO,
    val dt: Long,
    val sys: SysFromCityDTO,
    val timezone: Long,
    val id: Long,
    val name: String,
    val cod: Long,
)