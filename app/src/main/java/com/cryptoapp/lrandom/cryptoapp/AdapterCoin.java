package com.cryptoapp.lrandom.cryptoapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class AdapterCoin extends ArrayAdapter<CoinModel>{
    ArrayList<CoinModel> coins;
    Context context;

    public AdapterCoin(@NonNull Context context,
                       int resource,
                       @NonNull ArrayList<CoinModel> coins) {
        super(context, resource, coins);
        this.coins=coins;
        this.context=context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if(v == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=inflater.inflate(R.layout.row_item,null);
        }

        CoinModel coinModel= getItem(position);

        TextView tvName = (TextView)v.findViewById(R.id.tvName);
        TextView tvMarketCap = (TextView)v.findViewById(R.id.tvMarketCap);
        TextView tvPrice= (TextView)v.findViewById(R.id.tvPrice);
        TextView tvVolume = (TextView)v.findViewById(R.id.tvVolume);

        tvName.setText("Name: "+coinModel.getName());
        tvMarketCap.setText("MarketCap: "+coinModel.getMarketCap()+"");
        tvPrice.setText("Price: "+coinModel.getPrice()+"");
        tvVolume.setText("Volume: "+ coinModel.getVolume()+"");

        return v;
    }

}
