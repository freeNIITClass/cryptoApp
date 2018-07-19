package com.cryptoapp.lrandom.cryptoapp;

import com.google.gson.annotations.SerializedName;

public class CoinModel {
    @SerializedName("long")
    String name;

    @SerializedName("mktcap")
    Float marketCap;

    @SerializedName("price")
    Float price;

    @SerializedName("volume")
    Float volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Float marketCap) {
        this.marketCap = marketCap;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }
}
