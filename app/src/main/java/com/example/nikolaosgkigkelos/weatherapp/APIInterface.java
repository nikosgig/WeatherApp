package com.example.nikolaosgkigkelos.weatherapp;

import com.example.nikolaosgkigkelos.weatherapp.POJO.City;
import com.example.nikolaosgkigkelos.weatherapp.POJO.Clouds;
import com.example.nikolaosgkigkelos.weatherapp.POJO.Coord;
import com.example.nikolaosgkigkelos.weatherapp.POJO.Example;
import com.example.nikolaosgkigkelos.weatherapp.POJO.List;
import com.example.nikolaosgkigkelos.weatherapp.POJO.Main;
import com.example.nikolaosgkigkelos.weatherapp.POJO.Snow;
import com.example.nikolaosgkigkelos.weatherapp.POJO.Sys;
import com.example.nikolaosgkigkelos.weatherapp.POJO.Weather;
import com.example.nikolaosgkigkelos.weatherapp.POJO.Wind;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

interface APIInterface {

    //bad practise
    @GET("/data/2.5/forecast?lat=37.9&lon=23.7&cnt=10&appid=0fd5dccd2daa256473fabfff3b8c1e59")
    Call<Example> doGetExample();

}