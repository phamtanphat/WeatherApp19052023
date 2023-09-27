package com.example.weatherapp19052023.data.api.dto

import com.google.gson.annotations.SerializedName

data class WeatherForecastFromCityDTO (
    val coord: CoordFromCityDTO,
    @SerializedName("weather")
    val weatherFromCityDTO: List<WeatherFromCityDTO>,
    val base: String,
    @SerializedName("main")
    val mainFromCityDTO: MainFromCityDTO,
    val visibility: Long,
    @SerializedName("wind")
    val windFromCityDTO: WindFromCityDTO,
    @SerializedName("clouds")
    val clouds: CloudsFromCityDTO,
    val dt: Long,
    @SerializedName("sys")
    val sys: SysFromCityDTO,
    val timezone: Long,
    val id: Long,
    val name: String,
    val cod: Long,
)