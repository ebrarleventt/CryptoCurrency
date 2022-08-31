package com.example.cryptocurrencyapp.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    //gelecek data ile ismin aynı olması lazım. SerializedName'leri Retrofit'e soyluyoruz
    @SerializedName("currency")
    public String currency;
    @SerializedName("price")
    public String price;

}
