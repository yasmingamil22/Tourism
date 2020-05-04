package com.example.tourism;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity  {
ImageView imgForDrawer;
DrawerLayout drawerLayout;
Button btCountries,btMostPop;
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btCountries=findViewById(R.id.bt_allPopular);
        btCountries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main2Activity.this, Countries.class);
           startActivity(i);
            }
        });
        btMostPop=findViewById(R.id.bt_mostPopular);
        btMostPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main2Activity.this, Cairo.class);
                startActivity(i);
            }
        });
        //for navigation drawer
        drawerLayout = findViewById(R.id.drawer);
        imgForDrawer =findViewById(R.id.img_draw_open);
        imgForDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(drawerLayout.isDrawerOpen(Gravity.LEFT)){
                    drawerLayout.closeDrawer(Gravity.LEFT);
                }else {
                    drawerLayout.openDrawer(Gravity.LEFT);
                }
            }
        });
        // this is for moveing the images
        models = new ArrayList<>();
        models.add(new Model(R.drawable.al_ahramat,"Egyptian Pyramids"," It is the only one of the Seven Wonders of the Ancient World still in existence."));
        models.add(new Model(R.drawable.t5,"St. Catherine Mountain","It is the highest mountain is Sinai "));
        models.add(new Model(R.drawable.almgohratalmalkia,"The Royal Jewelry Museum","Contains most of the royal jewelry"));
        models.add(new Model(R.drawable.t4,"Karnak Temple","pharaonic temple in Luxor"));
        models.add(new Model(R.drawable.alobra,"Opera House","you can attend cocerts in it "));
        models.add(new Model(R.drawable.algona,"Gona","Overlooking the Red Sea"));
        models.add(new Model(R.drawable.wadyalrayan,"Wadi Al Rayan waterfalls","It is a part of nature reseve"));


        adapter = new Adapter(models,this);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);

    }
}
