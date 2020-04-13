package com.example.tourism;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Cairo extends AppCompatActivity {
RecyclerView Rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cairo);
        Rv = findViewById(R.id.rv);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.pyr, "pyramid"));
        places.add(new Place(R.drawable.aesh, "aesha fahmy"));
        places.add(new Place(R.drawable.cas, "castle"));
        Cov_adapter  adapter = new Cov_adapter(places);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        Rv.setHasFixedSize(true);
        Rv.setLayoutManager(lm);
        Rv.setAdapter(adapter);

    }

}
