package com.example.cryptocurrencyapp.adapter;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocurrencyapp.R;
import com.example.cryptocurrencyapp.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {

    ArrayList<CryptoModel> cryptoList;
    String colors[] = {"#e97b40", "#007f66", "#D80225", "#b06500", "#D8028F", "#8f7eab", "#6082b6", "#826c58"};

    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoList){
        this.cryptoList = cryptoList;
    }


    //row_layout ile recyclerview i birbirine baglama
    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout, parent, false);
        return new RowHolder(view);
    }

    //Gorunumlerimizi viewholder olan asagidaki sinifta tanimlayıp burada baglama islemi:
    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        holder.bind(cryptoList.get(position), colors, position);
    }

    //Kac tane row olusturulacak:
    @Override
    public int getItemCount() {
        return cryptoList.size();
    }



    public class RowHolder extends RecyclerView.ViewHolder {

        TextView cryptoName;
        TextView cryptoPrice;

        public RowHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(CryptoModel cryptoModel, String[] colors, Integer position){
            itemView.setBackgroundColor(Color.parseColor(colors[position%8]));
            cryptoName = itemView.findViewById(R.id.cryptoNameTV);
            cryptoPrice = itemView.findViewById(R.id.cryptoPriceTV);
            cryptoName.setText(cryptoModel.currency);
            cryptoPrice.setText(cryptoModel.price);
        }
    }

}
