package com.example.tourism;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Cairo extends AppCompatActivity {
RecyclerView Rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cairo);
        Rv = findViewById(R.id.rv);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.alazher, "Al Azhar"));
        places.add(new Place(R.drawable.mohamed_ali, "Muhammed Ali Pasha Palace"));
        places.add(new Place(R.drawable.almat7af_almasry, "The Egyption museum"));
        places.add(new Place(R.drawable.aesh, "Aesha Fahmy Palace"));
        places.add(new Place(R.drawable.t6, "Salah El Din Citadel"));
        places.add(new Place(R.drawable.aesh, "Cairo Tower"));
        places.add(new Place(R.drawable.mazged_alhakm, "Al Hakem "));

        Cov_adapter  adapter = new Cov_adapter(places,this);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(this);
        Rv.setHasFixedSize(true);
        Rv.setLayoutManager(lm);
        Rv.setAdapter(adapter);
}}
