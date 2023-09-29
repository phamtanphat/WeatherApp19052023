package com.example.weatherapp19052023.data.api.dto.search_from_city

import com.example.weatherapp19052023.data.api.dto.WeatherDetailDTO
import com.google.gson.annotations.SerializedName

data class WeatherForecastFromCityDTO (
    val coord: CoordFromCityDTO,
    @SerializedName("weather")
    val weatherDetailDTO: List<WeatherDetailDTO>,
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