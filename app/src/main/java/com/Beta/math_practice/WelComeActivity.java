package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelComeActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000; //開啟畫面時間(2秒)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelComeActivity.this, page1.class); //MainActivity為主要檔案名稱
                WelComeActivity.this.startActivity(intent);
                WelComeActivity.this.finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
