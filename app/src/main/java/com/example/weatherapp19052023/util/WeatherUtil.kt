package com.example.weatherapp19052023.util

import com.example.weatherapp19052023.data.api.dto.forecast_7day.Weather7DayDTO
import com.example.weatherapp19052023.data.api.dto.forecast_7day.WeatherForecast7dayDTO
import com.example.weatherapp19052023.data.api.dto.search_from_city.WeatherForecastFromCityDTO
import com.example.weatherapp19052023.data.model.Weather

object WeatherUtil {

    fun parserWeatherForecastFromCityDTO(weatherDTO: WeatherForecastFromCityDTO): Weather {
        return Weather().apply {
            cityName = weatherDTO.name
            time = weatherDTO.dt
            status = weatherDTO.weatherDetailDTO.getOrNull(0)?.main ?: ""
            temp = weatherDTO.mainFromCityDTO.temp
            tempMin = weatherDTO.mainFromCityDTO.tempMin
            tempMax = weatherDTO.mainFromCityDTO.tempMax
            feelsLike = weatherDTO.mainFromCityDTO.feelsLike
            icon = weatherDTO.weatherDetailDTO.getOrNull(0)?.icon ?: ""
            humidity = weatherDTO.mainFromCityDTO.humidity
        }
    }

    fun parserWeatherForecast7DayDTO(weatherForecast7dayDTO: WeatherForecast7dayDTO): List<Weather> {
        val listWeather = mutableListOf<Weather>()
        weatherForecast7dayDTO.listWeather7DayDTO.map {
            val weather = Weather().apply {
                cityName = weatherForecast7dayDTO.city.name
                time = it.dt
                status = it.listWeatherDetailDTO.firstOrNull()?.main ?: ""
                temp = it.temp7DayDTO.day
                tempMin = it.temp7DayDTO.min
                tempMax = it.temp7DayDTO.max
                feelsLike = it.feelsLike7DayDTO.day
                icon = it.listWeatherDetailDTO.firstOrNull()?.icon ?: ""
                humidity = it.humidity.toInt()
            }
            listWeather.add(weather)
        }
        return listWeather
    }
}