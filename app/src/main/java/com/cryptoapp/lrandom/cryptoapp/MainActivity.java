package com.cryptoapp.lrandom.cryptoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ArrayList<CoinModel> coins  =new ArrayList<CoinModel>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.lstView);


        ApiService apiService = RestClient.getApiService();
        Call<ArrayList<CoinModel>> call = apiService.getCoins();
        call.enqueue(new Callback<ArrayList<CoinModel>>() {
            @Override
            public void onResponse(Call<ArrayList<CoinModel>> call, Response<ArrayList<CoinModel>> response) {
                coins = response.body();
                Log.e("coins",coins.size()+"");
                AdapterCoin adapterCoin =new AdapterCoin(getBaseContext(),R.layout.row_item,coins);
                listView.setAdapter(adapterCoin);
            }

            @Override
            public void onFailure(Call<ArrayList<CoinModel>> call, Throwable t) {
                Log.e("failed",t.getMessage());
            }
        });
    }

}
