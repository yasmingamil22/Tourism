package com.example.tourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tourism.R;

public class Countries extends AppCompatActivity {
    Button cairo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
        cairo = findViewById(R.id.bt_cairo);
        cairo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Countries.this,Cairo.class);
                startActivity(i);
            }
        });
    }
}
