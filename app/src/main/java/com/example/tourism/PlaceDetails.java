package com.example.tourism;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.android.material.tabs.TabLayout;

public class PlaceDetails extends AppCompatActivity {
    ViewFlipper flipper;
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);
        flipper = findViewById(R.id.v_flipper);
        int images[] ={R.drawable.t7,R.drawable.t2,R.drawable.t3,R.drawable.t4};
        for(int image : images){
            fipperImages(image);

        }
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab);
tabLayout.setupWithViewPager(viewPager);
    }
    public void fipperImages (int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(this,android.R.anim.slide_in_left);
        flipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }

}
