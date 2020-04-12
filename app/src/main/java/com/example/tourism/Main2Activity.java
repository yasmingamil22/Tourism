package com.example.tourism;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        models = new ArrayList<>();
        models.add(new Model(R.drawable.t1,"Egyptian pyramids"," It is the only one of the Seven Wonders of the Ancient World still in existence."));
        models.add(new Model(R.drawable.t3,"El Andalos park","One of the rare green areas that people could come across in Cairo "));
        models.add(new Model(R.drawable.t5,"Japanese Gardens","this park is beautiful, lots of statues and also games "));
        models.add(new Model(R.drawable.t4,"Family Park","Landscaped garden with a zoo, amusement park, cinema"));
        models.add(new Model(R.drawable.t7,"Family Park","Landscaped garden with a zoo, amusement park, cinema"));
        models.add(new Model(R.drawable.t2,"Family Park","Landscaped garden with a zoo, amusement park, cinema"));
        models.add(new Model(R.drawable.t6,"Family Park","Landscaped garden with a zoo, amusement park, cinema"));

        adapter = new Adapter(models,this);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);
    }
}
