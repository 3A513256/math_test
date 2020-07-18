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
    int lastScore, Degree;
    int best1, best2, best3;
    String name1, name2, name3, name0;
    Button button1, button2, clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        tv_score = findViewById(R.id.tv_score);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        clear = findViewById(R.id.clear);


        Typeface mytype = Typeface.createFromAsset(getAssets(), "setofont.ttf");

        final SharedPreferences setting = getSharedPreferences("setting", 0);
        final SharedPreferences score = getSharedPreferences("score", 0);
        Degree = setting.getInt("Degree", 0);

        if (Degree == 0) {
            name0 = setting.getString("name_easy", "");
            name1 = setting.getString("name1_easy", "");
            name2 = setting.getString("name2_easy", "");
            name3 = setting.getString("name3_easy", "");
            lastScore = score.getInt("lastScore_easy", 0);
            best1 = score.getInt("best1_easy", 0);
            best2 = score.getInt("best2_easy", 0);
            best3 = score.getInt("best3_easy", 0);

            if (lastScore > best3) {
                best3 = lastScore;
                name3 = name0;
                score.edit().putInt("best3_easy", best3).commit();
                setting.edit().putString("name3_easy", name3).commit();
            }
            if (lastScore > best2) {
                int temp = best2;
                String string = name2;
                best2 = lastScore;
                name2 = name0;
                best3 = temp;
                name3 = string;
                score.edit().putInt("best3_easy", best3).commit();
                score.edit().putInt("best2_easy", best2).commit();
                setting.edit().putString("name3_easy", name3).commit();
                setting.edit().putString("name2_easy", name2).commit();
            }
            if (lastScore > best1) {
                int temp = best1;
                String string = name1;
                best1 = lastScore;
                name1 = name0;
                best2 = temp;
                name2 = string;
                score.edit().putInt("best2_easy", best2).commit();
                score.edit().putInt("best1_easy", best1).commit();
                setting.edit().putString("name2_easy", name2).commit();
                setting.edit().putString("name1_easy", name1).commit();
            }

            tv_score.setText(
                    "遊戲結束！\n" +
                            "\n" +
                            "本次分數: " + name0 + " " + lastScore + "\n" +
                            "\n" +
                            "BEST1: " + name1 + " " + best1 + "\n" +
                            "\n" +
                            "BEST2: " + name2 + " " + best2 + "\n" +
                            "\n" +
                            "BEST3: " + name3 + " " + best3);
        }

        if (Degree == 1) {
            name0 = setting.getString("name_hard", "");
            name1 = setting.getString("name1_hard", "");
            name2 = setting.getString("name2_hard", "");
            name3 = setting.getString("name3_hard", "");
            lastScore = score.getInt("lastScore_hard", 0);
            best1 = score.getInt("best1_hard", 0);
            best2 = score.getInt("best2_hard", 0);
            best3 = score.getInt("best3_hard", 0);

            if (lastScore > best3) {
                best3 = lastScore;
                name3 = name0;
                score.edit().putInt("best3_hard", best3).commit();
                setting.edit().putString("name3_hard", name3).commit();
            }
            if (lastScore > best2) {
                int temp = best2;
                String string = name2;
                best2 = lastScore;
                name2 = name0;
                best3 = temp;
                name3 = string;
                score.edit().putInt("best3_hard", best3).commit();
                score.edit().putInt("best2_hard", best2).commit();
                setting.edit().putString("name3_hard", name3).commit();
                setting.edit().putString("name2_hard", name2).commit();
            }
            if (lastScore > best1) {
                int temp = best1;
                String string = name1;
                best1 = lastScore;
                name1 = name0;
                best2 = temp;
                name2 = string;
                score.edit().putInt("best2_hard", best2).commit();
                score.edit().putInt("best1_hard", best1).commit();
                setting.edit().putString("name2_hard", name2).commit();
                setting.edit().putString("name1_hard", name1).commit();
            }

            tv_score.setText(
                    "遊戲結束！\n" +
                            "\n" +
                            "本次分數: " + name0 + " " + lastScore + "\n" +
                            "\n" +
                            "BEST1: " + name1 + " " + best1 + "\n" +
                            "\n" +
                            "BEST2: " + name2 + " " + best2 + "\n" +
                            "\n" +
                            "BEST3: " + name3 + " " + best3);
        }


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
                intent.setClass(BestActivity.this, setting.class);
                startActivity(intent);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score.edit().clear().commit();
                setting.edit().clear().commit();
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