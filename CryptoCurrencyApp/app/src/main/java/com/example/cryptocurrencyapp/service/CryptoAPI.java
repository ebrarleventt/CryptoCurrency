package com.example.cryptocurrencyapp.service;

import com.example.cryptocurrencyapp.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET, POST, UPDATE, DELETE
    //GET -> Daha cok veriyi almak icin
    //POST -> Daha cok sunucuya bir veri yazmak icin
    //www.website.com/price?key=xxx
    //URL Base -> www.website.com
    //Get -> price?key=xxx
    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/2be0f55346f62e545f2cc97aa8e28666aa672974/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/2be0f55346f62e545f2cc97aa8e28666aa672974/crypto.json")
    //Call<List<CryptoModel>> getData();
    Observable<List<CryptoModel>> getData();



}
