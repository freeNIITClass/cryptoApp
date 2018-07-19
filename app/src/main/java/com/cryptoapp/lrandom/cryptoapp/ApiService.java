package com.cryptoapp.lrandom.cryptoapp;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("front")
    Call<ArrayList<CoinModel>> getCoins();
}
