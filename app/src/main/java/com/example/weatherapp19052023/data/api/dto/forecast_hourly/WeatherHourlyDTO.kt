package com.example.weatherapp19052023.data.api.dto.forecast_hourly

import com.example.weatherapp19052023.data.api.dto.WeatherDetailDTO
import com.google.gson.annotations.SerializedName

data class WeatherHourlyDTO(
    val dt: Long,
    @SerializedName("main")
    val mainHourlyDTO: MainHourlyDTO,
    val weather: List<WeatherDetailDTO>,
    val clouds: CloudHourlyDTO,
    val wind: WindHourlyDTO,
    val visibility: Long,
    val pop: Long,
    val sys: SysHourlyDTO,
    @SerializedName("dt_txt")
    val dtTxt: String,
)