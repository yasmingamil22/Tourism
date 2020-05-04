package com.example.tourism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MuAliPalace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tv1m,tv2m;
        Button btn1m, btn2m, btn3m, btn4m;
        ImageView im1m;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymu_ali_palace);
        tv1m = findViewById(R.id.tvm);
        tv2m = findViewById(R.id.tv2m);
        btn1m = findViewById(R.id.btn1m);
        btn2m = findViewById(R.id.btn2m);
        btn3m = findViewById(R.id.btn3m);
        btn4m = findViewById(R.id.btn4m);
        im1m = findViewById((R.id.im1m));
    }
}
