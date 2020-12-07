package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class setting_degree extends AppCompatActivity {

    EditText editText;
    ImageButton time, plane_figure, arithmetic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_degree);
        editText = findViewById(R.id.name);
        time = findViewById(R.id.timeButton);
        plane_figure = findViewById(R.id.plane_figureButton);
        arithmetic = findViewById(R.id.arithmeticButton);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//時間
                if (editText.getText().toString().length() == 0) {
                    Toast.makeText(setting_degree.this, "請輸入使用者名稱", Toast.LENGTH_SHORT).show();
                } else {
                    SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                    setting.edit().putInt("degree", 2).apply();
                    setting.edit().putString("name_easy", editText.getText().toString()).apply();
                    Intent intent = new Intent();
                    intent.setClass(setting_degree.this, rule.class);
                    startActivity(intent);
                }
            }
        });
        arithmetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//四則運算
                if (editText.getText().toString().length() == 0) {
                    Toast.makeText(setting_degree.this, "請輸入使用者名稱", Toast.LENGTH_SHORT).show();
                } else {
                    SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                    setting.edit().putInt("degree", 0).apply();
                    setting.edit().putString("name_mid", editText.getText().toString()).apply();
                    Intent intent = new Intent();
                    intent.setClass(setting_degree.this, rule.class);
                    startActivity(intent);
                }
            }
        });
        plane_figure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//平面圖形
                if (editText.getText().toString().length() == 0) {
                    Toast.makeText(setting_degree.this, "請輸入使用者名稱", Toast.LENGTH_SHORT).show();
                } else {
                    SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                    setting.edit().putInt("degree", 1).apply();
                    setting.edit().putString("name_hard", editText.getText().toString()).apply();
                    Intent intent = new Intent();
                    intent.setClass(setting_degree.this, rule.class);
                    startActivity(intent);
                }
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
