package com.example.weatherapp19052023.data.model

class Weather(
    var cityName: String = "",
    var time: Long = 0,
    var status: String = "",
    var temp: Double = 0.0,
    var tempMin: Double = 0.0,
    var tempMax: Double = 0.0,
    var feelsLike: Double = 0.0,
    var humidity: Int = 0,
    var icon: String = "",
) {

    override fun toString(): String {
        return "Weather(cityName='$cityName', time=$time, status='$status', temp=$temp, tempMin=$tempMin, tempMax=$tempMax, feelsLike=$feelsLike, humidity=$humidity, icon='$icon')"
    }
}