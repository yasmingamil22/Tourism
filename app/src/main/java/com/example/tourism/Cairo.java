package com.example.tourism;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Cairo extends AppCompatActivity {
RecyclerView Rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cairo);
        Rv = findViewById(R.id.rv);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.Alazhar, "Al Azhar"));
        places.add(new Place(R.drawable.manialPalac, "Muhammed Ali Pasha Palace"));
        places.add(new Place(R.drawable.musse, "The Egyption museum"));
        places.add(new Place(R.drawable.aesh, "Aesha Fahmy Palace"));
        places.add(new Place(R.drawable.cas, "Salah El Din Citadel"));
        places.add(new Place(R.drawable.cairotower, "Cairo Tower"));
        places.add(new Place(R.drawable.alhakem, "Al Hakem "));

        Cov_adapter  adapter = new Cov_adapter(places);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(this);
        Rv.setHasFixedSize(true);
        Rv.setLayoutManager(lm);
        Rv.setAdapter(adapter);






}}
