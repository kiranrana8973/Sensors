package com.example.sensors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCheckAll, btnAccelerometer, btnGyroscope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCheckAll = findViewById(R.id.btnCheckAll);
        btnAccelerometer = findViewById(R.id.btnAccelerometer);
        btnGyroscope = findViewById(R.id.btnGyroscope);

        btnCheckAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckAllActivity.class);
                startActivity(intent);
            }
        });

        btnAccelerometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckAllActivity.class);
                startActivity(intent);
            }
        });


        btnGyroscope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckAllActivity.class);
                startActivity(intent);
            }
        });


    }
}
