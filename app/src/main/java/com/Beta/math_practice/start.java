package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ImageView startimage = findViewById(R.id.startImage);
        SharedPreferences setting = getSharedPreferences("setting", 0);
        int gender = setting.getInt("gender", 0);
        if (gender == 0) {
            startimage.setImageResource(R.drawable.girl_start);
        } else if (gender == 1) {
            startimage.setImageResource(R.drawable.boy_start);
        }

        int SPLASH_TIME_OUT = 1500;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(start.this, MainActivity.class);
                start.this.startActivity(intent);
                start.this.finish();
            }
        }, SPLASH_TIME_OUT);
    }
}