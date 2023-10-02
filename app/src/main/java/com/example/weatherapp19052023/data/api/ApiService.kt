package com.example.weatherapp19052023.data.api

import com.example.weatherapp19052023.data.api.dto.forecast_7day.WeatherForecast7dayDTO
import com.example.weatherapp19052023.data.api.dto.forecast_hourly.WeatherForecastHourlyDTO
import com.example.weatherapp19052023.data.api.dto.search_from_city.WeatherForecastFromCityDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("data/2.5/weather")
    suspend fun getWeatherFromCity(
        @Query("appid") appID: String,
        @Query("units") units: String,
        @Query("q") q: String
    ): WeatherForecastFromCityDTO

    @GET("data/2.5/forecast/daily")
    suspend fun getWeatherFromCity7Day(
        @Query("appid") appID: String,
        @Query("units") units: String,
        @Query("q") q: String,
        @Query("model") model: String,
        @Query("cnt") cnt: String
    ): WeatherForecast7dayDTO

    @GET("data/2.5/forecast")
    suspend fun getWeatherHourly(
        @Query("appid") appID: String,
        @Query("units") units: String,
        @Query("q") q: String,
        @Query("cnt") cnt: String
    ): WeatherForecastHourlyDTO
}