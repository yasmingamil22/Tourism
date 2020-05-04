package com.example.tourism;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Cov_adapter extends RecyclerView.Adapter<Cov_adapter.MyViewHolder> {
    ArrayList<Place> places;

    public Cov_adapter(ArrayList<Place> places) {
        this.places = places;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.cov_item,null,false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     Place p = places.get(position);
     holder.im_name.setImageResource(p.getImage());
     holder.tv_name.setText(p.getName());

    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name,tv2;
        ImageView im_name;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv);
            im_name = itemView.findViewById(R.id.im);
            tv2 = itemView.findViewById(R.id.tv2);




        }
    }

}
