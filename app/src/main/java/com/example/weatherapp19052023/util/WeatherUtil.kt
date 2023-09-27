package com.example.weatherapp19052023.util

import com.example.weatherapp19052023.data.api.dto.WeatherForecastFromCityDTO
import com.example.weatherapp19052023.data.model.Weather

object WeatherUtil {

    fun parserWeatherForecastFromCityDTO(weatherDTO: WeatherForecastFromCityDTO): Weather {
        return Weather().apply {
            cityName = weatherDTO.name
            time = weatherDTO.dt
            status = weatherDTO.weatherFromCityDTO.getOrNull(0)?.main ?: ""
            temp = weatherDTO.mainFromCityDTO.temp
            tempMin = weatherDTO.mainFromCityDTO.tempMin
            tempMax = weatherDTO.mainFromCityDTO.tempMax
            feelsLike = weatherDTO.mainFromCityDTO.feelsLike
            icon = weatherDTO.weatherFromCityDTO.getOrNull(0)?.icon ?: ""
            humidity = weatherDTO.mainFromCityDTO.humidity
        }
    }
}