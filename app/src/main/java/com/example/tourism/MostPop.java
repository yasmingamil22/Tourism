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
        places.add(new Place(R.drawable.pyr, "pyramid"));
        Cov_adapter  adapter = new Cov_adapter(places,MostPop.this);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(this);
        rec.setHasFixedSize(true);
        rec.setLayoutManager(lm);
        rec.setAdapter(adapter);


    }
}
