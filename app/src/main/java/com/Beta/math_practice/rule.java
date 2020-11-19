package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class rule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);
        TextView rule = findViewById(R.id.rule);
        ImageButton imageButton = findViewById(R.id.go);
        Typeface mytype = Typeface.createFromAsset(getAssets(), "jf.ttf");
        rule.setTypeface(mytype);
        rule.setText(
                "挑戰者_，你好" + '\n' +
                        "歡迎來到「數學小天才」的小殿堂。" + '\n' +
                        "☆以下為挑戰的規則☆" + '\n' +
                        "一開始的底分為 0 分" + '\n' +
                        "順利過關得 10 分" + '\n' +
                        "使用提示卡則只得 5 分" + '\n' +
                        "答錯的話積分不變" + '\n' +
                        "每答對一題，將獲得一枚拼圖" + '\n' +
                        "答完 10 題後，" + '\n' +
                        "將會顯示所獲得的拼圖畫面以及排行。" + '\n' + '\n' +
                        "您選擇的是：_類別" + '\n' +
                        "題目開始前將會提供相關的數學公式" + '\n' +
                        "讓我們一起邊玩邊學習☆" + '\n' +
                        "準備好接受挑戰成為" + '\n' +
                        "「數學小天才」了嗎？" + '\n' +
                        "沒問題就開始吧！");
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(rule.this, MainActivity.class);
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