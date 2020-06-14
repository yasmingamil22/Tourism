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
        places.add(new Place(R.drawable.alazher, "Al Azhar","El Darasa"));
        places.add(new Place(R.drawable.mohamed_ali, "Muhammed Ali Pasha Palace","El Manial"));
        places.add(new Place(R.drawable.almat7af_almasry, "The Egyption museum","El tahrir"));
        places.add(new Place(R.drawable.aesh, "Aesha Fahmy Palace","El Zamalek"));
        places.add(new Place(R.drawable.cas, "Salah El Din Citadel","El Moqatam"));
        places.add(new Place(R.drawable.cairott, "Cairo Tower","El Zamalek"));
        places.add(new Place(R.drawable.mazged_alhakm, "Al Hakem ","El Moe'eez st."));

        Cov_adapter  adapter = new Cov_adapter(places,this);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(this);
        Rv.setHasFixedSize(true);
        Rv.setLayoutManager(lm);
        Rv.setAdapter(adapter);






}}
