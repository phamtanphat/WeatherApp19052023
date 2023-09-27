package com.example.weatherapp19052023.data.repository

import com.example.weatherapp19052023.common.AppConstant
import com.example.weatherapp19052023.data.api.RetrofitClient
import com.example.weatherapp19052023.data.api.dto.WeatherForecastFromCityDTO

class WeatherRepository {
    private val apiService = RetrofitClient.getApiService()

    suspend fun requestWeatherFromCity(cityName: String): WeatherForecastFromCityDTO {
        return apiService.getWeatherFromCity(
            appID = AppConstant.APP_ID,
            units = AppConstant.UNITS,
            q = cityName
        )
    }
}