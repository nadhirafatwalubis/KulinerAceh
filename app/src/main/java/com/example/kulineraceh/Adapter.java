package com.example.kulineraceh;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private ArrayList<Makanan> Makanans;
    private Context context;

    public Adapter(ArrayList<Makanan> makanans, Context context) {
        Makanans = makanans;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_makanan, parent, false);

        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Holder holder, int position) {
        Makanan makanan = Makanans.get(position);
        holder.judul.setText(makanan.getJudul());
        holder.rate.setText(makanan.getRate());
        holder.img.setImageResource(makanan.getImg());

        holder.btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, LihatResep.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Makanan", Makanans);
                i.putExtras(bundle);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return Makanans.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView judul, rate;
        public ImageView img;
        public Button btnshow;

        public Holder(@NonNull View itemView) {
            super(itemView);

            judul = itemView.findViewById(R.id.judul);
            rate = itemView.findViewById(R.id.rate);
            img = itemView.findViewById(R.id.imgmakanan);
            btnshow = itemView.findViewById(R.id.show);
        }
    }
}