package com.example.weatherapp19052023.data.api

import com.example.weatherapp19052023.data.api.dto.WeatherForecastFromCityDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("data/2.5/weather")
    suspend fun getWeatherFromCity(
        @Query("appid") appID: String,
        @Query("units") units: String,
        @Query("q") q: String
    ): WeatherForecastFromCityDTO
}