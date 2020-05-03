package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class PlaceDetails extends AppCompatActivity {
    ViewFlipper flipper;
    TextView mPageTitle;
    String recivedTitle;
CollapsingToolbarLayout collapsingToolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);
        flipper = findViewById(R.id.v_flipper);
        collapsingToolbarLayout = findViewById(R.id.collapse);
        mPageTitle = findViewById(R.id.page_title);
        int images[] = {R.drawable.t7, R.drawable.t2, R.drawable.t3, R.drawable.t4};
        for (int image : images) {
            fipperImages(image);

        }

        recivedTitle = getIntent().getStringExtra("itemName");
        mPageTitle.setText(recivedTitle);

    }

    public void fipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }

}
