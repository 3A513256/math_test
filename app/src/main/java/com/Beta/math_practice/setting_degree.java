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
import android.widget.EditText;
import android.widget.ImageButton;

import android.widget.Toast;

public class setting_degree extends AppCompatActivity {

    int check = 0;
    String name_input = "";
    EditText editText;
    Button confirm;
    ImageButton easy, hard, mid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_degree);
        confirm = findViewById(R.id.confirm);
        editText = findViewById(R.id.name);
        easy = findViewById(R.id.easyButton);
        hard = findViewById(R.id.hardButton);
        mid = findViewById(R.id.midButton);
        confirm.setText("Start!");
        Typeface mytype = Typeface.createFromAsset(getAssets(), "setofont.ttf");
        confirm.setTypeface(mytype);
        confirm.setTextSize(20);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                name_input = editText.getText().toString();
                if (name_input.trim().matches("")) {
                    Toast.makeText(setting_degree.this, "請輸入使用者名稱", Toast.LENGTH_SHORT).show();
                }
                if (check == 0) {
                    Toast.makeText(setting_degree.this, "請選擇難易度", Toast.LENGTH_SHORT).show();
                }
                if (check == 1 && editText.length() != 0) {
                    setting.edit().putString("name_easy", name_input).commit();
                    Intent intent = new Intent();
                    intent.setClass(setting_degree.this, MainActivity.class);
                    startActivity(intent);
                }//簡單
                if (check == 2 && editText.length() != 0) {
                    setting.edit().putString("name_mid", name_input).commit();
                    Intent intent = new Intent();
                    intent.setClass(setting_degree.this, MainActivity.class);
                    startActivity(intent);
                }//普通
                if (check == 3 && editText.length() != 0) {
                    setting.edit().putString("name_hard", name_input).commit();
                    Intent intent = new Intent();
                    intent.setClass(setting_degree.this, MainActivity.class);
                    startActivity(intent);
                }//困難
            }
        });

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = 1;
                SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                setting.edit().putInt("degree", 2).commit();
            }
        });
        mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = 2;
                SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                setting.edit().putInt("degree", 0).commit();
            }
        });
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = 3;
                SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                setting.edit().putInt("degree", 1).commit();
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
