package com.example.tourism;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MostPop extends AppCompatActivity {
RecyclerView rec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_pop);
        rec = findViewById(R.id.rec);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.t1, "Pyramids","El haram"));
        places.add(new Place(R.drawable.t5, "Feyla island","Aswan"));
        places.add(new Place(R.drawable.t4, "Cairo Tower","cairo"));
        places.add(new Place(R.drawable.t3, "Wale vally","Faioum"));
        places.add(new Place(R.drawable.t2, "Siwa Palms","Siwa"));


        CovMostAdapter  adapter = new CovMostAdapter(places,this);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rec.setLayoutManager(lm);
        rec.setAdapter(adapter);
        rec.setHasFixedSize(true);

    }
}
