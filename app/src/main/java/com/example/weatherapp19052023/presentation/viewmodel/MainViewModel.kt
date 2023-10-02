package com.example.weatherapp19052023.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp19052023.common.AppResource
import com.example.weatherapp19052023.data.api.dto.forecast_7day.WeatherForecast7dayDTO
import com.example.weatherapp19052023.data.api.dto.search_from_city.WeatherForecastFromCityDTO
import com.example.weatherapp19052023.data.model.Weather
import com.example.weatherapp19052023.data.repository.WeatherRepository
import com.example.weatherapp19052023.extension.launchOnMain
import com.example.weatherapp19052023.util.WeatherUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainViewModel(
    private var weatherRepository: WeatherRepository
): ViewModel() {

    private val loadingLiveData = MutableLiveData<Boolean>()
    private val weatherLiveData = MutableLiveData<AppResource<Weather>>()
    private val listWeather7DayLiveData = MutableLiveData<AppResource<List<Weather>>>()
    private val listWeatherHourlyLiveData = MutableLiveData<AppResource<List<Weather>>>()

    fun getLoadingLiveData(): LiveData<Boolean> = loadingLiveData
    fun getWeatherLiveData(): LiveData<AppResource<Weather>> = weatherLiveData
    fun getListWeather7DayLiveData(): LiveData<AppResource<List<Weather>>> = listWeather7DayLiveData
    fun getListWeatherHourlyLiveData(): LiveData<AppResource<List<Weather>>> = listWeatherHourlyLiveData

    fun requestWeatherFromCity(cityName: String) {
        loadingLiveData.value = true
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val weatherForecastFromCityDTO: WeatherForecastFromCityDTO = async {
                    weatherRepository.requestWeatherFromCity(cityName)
                }.await()

                val weather = WeatherUtil.parserWeatherForecastFromCityDTO(weatherForecastFromCityDTO)

                launchOnMain { weatherLiveData.value = AppResource.Success(weather) }
            } catch (e: Exception) {
                launchOnMain { weatherLiveData.value = AppResource.Error(e.message ?: "") }
            } finally {
                launchOnMain { loadingLiveData.value = false }
            }
        }
    }

    fun requestWeatherFromCity7Day(cityName: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val weatherForecast7dayDTO: WeatherForecast7dayDTO = async {
                    weatherRepository.requestWeatherFromCity7Day(cityName)
                }.await()

                val listWeather = WeatherUtil.parserWeatherForecast7DayDTO(weatherForecast7dayDTO)

                launchOnMain { listWeather7DayLiveData.value = AppResource.Success(listWeather) }
            } catch (e: Exception) {
                launchOnMain { listWeather7DayLiveData.value = AppResource.Error(e.message ?: "") }
            } finally {
                launchOnMain { loadingLiveData.value = false }
            }
        }
    }

    fun requestWeatherHourly(cityName: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val weatherForecast7dayDTO: WeatherForecast7dayDTO = async {
                    weatherRepository.requestWeatherFromCity7Day(cityName)
                }.await()

                val listWeather = WeatherUtil.parserWeatherForecast7DayDTO(weatherForecast7dayDTO)

                launchOnMain { listWeather7DayLiveData.value = AppResource.Success(listWeather) }
            } catch (e: Exception) {
                launchOnMain { listWeather7DayLiveData.value = AppResource.Error(e.message ?: "") }
            } finally {
                launchOnMain { loadingLiveData.value = false }
            }
        }
    }
}