package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;

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
    String name1, name2, name3, lastName;
    Button NewGame, rst, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        tv_score = findViewById(R.id.tv_score);
        NewGame = findViewById(R.id.newgame);
        rst = findViewById(R.id.rst);
        clear = findViewById(R.id.clear);
        Typeface mytype = Typeface.createFromAsset(getAssets(), "jf.ttf");

        NewGame.setTypeface(mytype);
        rst.setTypeface(mytype);
        clear.setTypeface(mytype);
        NewGame.setText("再來一局！");
        rst.setText("離開");
        clear.setText("清除排行榜");
        SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
        SharedPreferences score = getSharedPreferences("score", MODE_PRIVATE);
        Degree = setting.getInt("degree", MODE_PRIVATE);

        if (Degree == 0) {
            lastName = setting.getString("name_mid", " ");
            name1 = setting.getString("name1_mid", " ");
            name2 = setting.getString("name2_mid", " ");
            name3 = setting.getString("name3_mid", " ");
            lastScore = score.getInt("lastScore_mid", 0);
            best1 = score.getInt("best1_mid", 0);
            best2 = score.getInt("best2_mid", 0);
            best3 = score.getInt("best3_mid", 0);

            if (lastScore >= best3) {
                best3 = lastScore;
                name3 = lastName;
                score.edit().putInt("best3_mid", best3).commit();
                setting.edit().putString("name3_mid", name3).commit();
            }
            if (lastScore >= best2) {
                int temp = best2;
                String string = name2;
                best2 = lastScore;
                name2 = lastName;
                best3 = temp;
                name3 = string;
                score.edit().putInt("best3_mid", best3).commit();
                score.edit().putInt("best2_mid", best2).commit();
                setting.edit().putString("name3_mid", name3).commit();
                setting.edit().putString("name2_mid", name2).commit();
            }
            if (lastScore >= best1) {
                int temp = best1;
                String string = name1;
                best1 = lastScore;
                name1 = lastName;
                best2 = temp;
                name2 = string;
                score.edit().putInt("best2_mid", best2).commit();
                score.edit().putInt("best1_mid", best1).commit();
                setting.edit().putString("name2_mid", name2).commit();
                setting.edit().putString("name1_mid", name1).commit();
            }

            tv_score.setText(
                    "遊戲結束！\n" +
                            "\n" +
                            "本次分數: " + lastName + " " + lastScore + "\n" +
                            "\n" +
                            "BEST1: " + name1 + " " + best1 + "\n" +
                            "\n" +
                            "BEST2: " + name2 + " " + best2 + "\n" +
                            "\n" +
                            "BEST3: " + name3 + " " + best3);
        }

        if (Degree == 1) {
            lastName = setting.getString("name_hard", " ");
            name1 = setting.getString("name1_hard", " ");
            name2 = setting.getString("name2_hard", " ");
            name3 = setting.getString("name3_hard", " ");
            lastScore = score.getInt("lastScore_hard", 0);
            best1 = score.getInt("best1_hard", 0);
            best2 = score.getInt("best2_hard", 0);
            best3 = score.getInt("best3_hard", 0);

            if (lastScore > best3) {
                best3 = lastScore;
                name3 = lastName;
                score.edit().putInt("best3_hard", best3).commit();
                setting.edit().putString("name3_hard", name3).commit();
            }
            if (lastScore > best2) {
                int temp = best2;
                String string = name2;
                best2 = lastScore;
                name2 = lastName;
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
                name1 = lastName;
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
                            "本次分數: " + lastName + " " + lastScore + "\n" +
                            "\n" +
                            "BEST1: " + name1 + " " + best1 + "\n" +
                            "\n" +
                            "BEST2: " + name2 + " " + best2 + "\n" +
                            "\n" +
                            "BEST3: " + name3 + " " + best3);
        }

        if (Degree == 2) {
            lastName = setting.getString("name_easy", " ");
            name1 = setting.getString("name1_easy", " ");
            name2 = setting.getString("name2_easy", " ");
            name3 = setting.getString("name3_easy", " ");
            lastScore = score.getInt("lastScore_easy", 0);
            best1 = score.getInt("best1_easy", 0);
            best2 = score.getInt("best2_easy", 0);
            best3 = score.getInt("best3_easy", 0);

            if (lastScore >= best3) {
                best3 = lastScore;
                name3 = lastName;
                score.edit().putInt("best3_easy", best3).commit();
                setting.edit().putString("name3_easy", name3).commit();
            }
            if (lastScore >= best2) {
                int temp = best2;
                String string = name2;
                best2 = lastScore;
                name2 = lastName;
                best3 = temp;
                name3 = string;
                score.edit().putInt("best3_easy", best3).commit();
                score.edit().putInt("best2_easy", best2).commit();
                setting.edit().putString("name3_easy", name3).commit();
                setting.edit().putString("name2_easy", name2).commit();
            }
            if (lastScore >= best1) {
                int temp = best1;
                String string = name1;
                best1 = lastScore;
                name1 = lastName;
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
                            "本次分數: " + lastName + " " + lastScore + "\n" +
                            "\n" +
                            "BEST1: " + name1 + " " + best1 + "\n" +
                            "\n" +
                            "BEST2: " + name2 + " " + best2 + "\n" +
                            "\n" +
                            "BEST3: " + name3 + " " + best3);
        }

        tv_score.setTypeface(mytype);
        tv_score.setTextSize(1, 30);
        tv_score.setGravity(CENTER);

        NewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(BestActivity.this, setting_gender.class);
                startActivity(intent);
            }
        });

        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(BestActivity.this, page1.class);
                startActivity(intent);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences setting = getSharedPreferences("setting", 0);
                SharedPreferences score = getSharedPreferences("score", 0);
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