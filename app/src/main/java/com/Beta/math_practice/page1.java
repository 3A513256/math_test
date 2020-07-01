package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import static android.view.Gravity.CENTER;


public class page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        Button nextPageBtn = (Button)findViewById(R.id.start);
        TextView title;
        Button start;
        start = findViewById(R.id.start);
        title = findViewById(R.id.title);
        Typeface mytype=Typeface.createFromAsset(getAssets(),"setofont.ttf");

        start.setText("遊戲開始");
        start.setTypeface(mytype);
        start.setTextSize(30);
        start.setGravity(CENTER);

        title.setText("數學小天才");
        title.setTypeface(mytype);
        title.setTextSize(60);
        title.setGravity(CENTER);

        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(page1.this , setting.class);
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