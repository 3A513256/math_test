package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.Gravity.CENTER;

public class BestActivity extends AppCompatActivity {

    TextView tv_score;
    int lastScore;
    int best1, best2, best3;
    String name1, name2, name3, name0;
    Button button1, button2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        tv_score = findViewById(R.id.tv_score);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        Typeface mytype = Typeface.createFromAsset(getAssets(), "setofont.ttf");

        SharedPreferences setting = getSharedPreferences("setting", 0);
        SharedPreferences score = getSharedPreferences("score", 0);

        name0 = setting.getString("name", "");
        name1 = setting.getString("name1", "");
        name2 = setting.getString("name2", "");
        name3 = setting.getString("name3", "");
        lastScore = score.getInt("lastScore", 0);
        best1 = score.getInt("best1", 0);
        best2 = score.getInt("best2", 0);
        best3 = score.getInt("best3", 0);

        if (lastScore > best3) {
            best3 = lastScore;
            name3 = name0;
            score.edit().putInt("best3", best3).apply();
            setting.edit().putString("name3", name3).apply();
        }
        if (lastScore > best2) {
            int temp = best2;
            best2 = lastScore;
            name2 = name0;
            best3 = temp;
            score.edit().putInt("best3", best3).apply();
            score.edit().putInt("best2", best2).apply();
            setting.edit().putString("name3", name3).apply();
            setting.edit().putString("name2", name2).apply();
        }
        if (lastScore > best1) {
            int temp = best1;
            best1 = lastScore;
            name1 = name0;
            best2 = temp;
            score.edit().putInt("best2", best2).apply();
            score.edit().putInt("best1", best1).apply();
            setting.edit().putString("name2", name2).apply();
            setting.edit().putString("name1", name1).apply();
        }

        tv_score.setText(
                "遊戲結束！\n" +
                        "\n" +
                        "本次分數: " + name0 + " " + lastScore + "\n" +
                        "BEST1: " + name1 + " " + best1 + "\n" +
                        "BEST2: " + name2 + " " + best2 + "\n" +
                        "BEST3: " + name3 + " " + best3);

        tv_score.setTypeface(mytype);
        tv_score.setTextSize(30);
        tv_score.setGravity(CENTER);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(BestActivity.this, page1.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(BestActivity.this, MainActivity.class);
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