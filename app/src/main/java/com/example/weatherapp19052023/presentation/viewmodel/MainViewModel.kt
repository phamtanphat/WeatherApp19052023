package com.example.weatherapp19052023.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp19052023.common.AppResource
import com.example.weatherapp19052023.data.api.dto.WeatherForecastFromCityDTO
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

    fun getLoadingLiveData(): LiveData<Boolean> = loadingLiveData
    fun getWeatherLiveData(): LiveData<AppResource<Weather>> = weatherLiveData

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
}