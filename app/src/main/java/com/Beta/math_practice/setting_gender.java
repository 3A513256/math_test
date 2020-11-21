package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

public class setting_gender extends AppCompatActivity {

    ImageButton boy, girl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_gender);
        boy = findViewById(R.id.boybutton);
        girl = findViewById(R.id.girlbutton);
        boy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                Intent intent = new Intent();
                setting.edit().putInt("gender", 1).commit();
                intent.setClass(setting_gender.this, setting_degree.class);
                startActivity(intent);
            }
        });

        girl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                Intent intent = new Intent();
                setting.edit().putInt("gender", 0).commit();
                intent.setClass(setting_gender.this, setting_degree.class);
                startActivity(intent);

            }
        });
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (getApplicationInfo().targetSdkVersion >= Build.VERSION_CODES.ECLAIR) {
                event.startTracking();
            } else {
                onBackPressed();
            }
        }
        return false;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return super.onKeyUp(keyCode, event);
    }
}
