package com.example.weatherapp19052023.data.model

class Weather(
    var cityName: String = "",
    var time: Long = 0,
    var description: String = "",
    var tempMin: Double = 0.0,
    var tempMax: Double = 0.0,
    var feelsLike: Double = 0.0,
    var image: String = "",
    var humidity: String = ""
)