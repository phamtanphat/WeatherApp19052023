package com.example.weatherapp19052023.data.repository

import com.example.weatherapp19052023.common.AppConstant
import com.example.weatherapp19052023.data.api.RetrofitClient
import com.example.weatherapp19052023.data.api.dto.forecast_7day.WeatherForecast7dayDTO
import com.example.weatherapp19052023.data.api.dto.forecast_hourly.WeatherForecastHourlyDTO
import com.example.weatherapp19052023.data.api.dto.search_from_city.WeatherForecastFromCityDTO

class WeatherRepository {
    private val apiService = RetrofitClient.getApiService()

    suspend fun requestWeatherFromCity(cityName: String): WeatherForecastFromCityDTO {
        return apiService.getWeatherFromCity(
            appID = AppConstant.APP_ID,
            units = AppConstant.UNITS,
            q = cityName
        )
    }

    suspend fun requestWeatherFromCity7Day(cityName: String): WeatherForecast7dayDTO {
        return apiService.getWeatherFromCity7Day(
            appID = AppConstant.APP_ID,
            units = AppConstant.UNITS,
            cnt = AppConstant.CNT,
            model = AppConstant.MODEL,
            q = cityName
        )
    }

    suspend fun requestWeatherHourly(cityName: String): WeatherForecastHourlyDTO {
        return apiService.getWeatherHourly(
            appID = AppConstant.APP_ID,
            units = AppConstant.UNITS,
            cnt = AppConstant.CNT,
            q = cityName
        )
    }
}