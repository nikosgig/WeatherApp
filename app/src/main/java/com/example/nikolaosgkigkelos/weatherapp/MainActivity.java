package com.example.nikolaosgkigkelos.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

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
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView responseText;
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        responseText = findViewById(R.id.responseText);
        apiInterface = APIClient.getClient().create(APIInterface.class);


        /**
         GET city
         **/
        Call<City> call = apiInterface.doGetCity();
        call.enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {


                Log.d("TAG",response.code()+"\n");

                City resource = response.body();
                String cityName = resource.getName();

                Log.d("OBJECT",resource.toString()+" ");
                Log.d("CITY NAME",resource.getName()+" ");

                responseText.setText(cityName);

            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {
                call.cancel();
            }
        });

    }
}