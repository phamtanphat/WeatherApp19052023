package com.example.weatherapp19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp19052023.data.repository.WeatherRepository
import com.example.weatherapp19052023.presentation.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var weatherRepository: WeatherRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weatherRepository = WeatherRepository()
        mainViewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return MainViewModel(weatherRepository) as T
            }
        })[MainViewModel::class.java]

//        mainViewModel.getLoadingLiveData().observe(this) {
//            Log.d("BBB", "Loading: $it")
//        }
//
//        mainViewModel.getWeatherLiveData().observe(this) {
//            Log.d("BBB", it.data.toString())
//        }
//
//        mainViewModel.requestWeatherFromCity("Hanoi")

        mainViewModel.getListWeather7DayLiveData().observe(this) {
            Log.d("BBB", it.data.toString())
        }

        mainViewModel.requestWeatherFromCity7Day("Hanoi")
    }
}