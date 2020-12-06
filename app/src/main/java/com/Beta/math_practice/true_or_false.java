package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class true_or_false extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_or_false);
        ImageView img = findViewById(R.id.ture_false);
        TextView textView = findViewById(R.id.textView);
        ImageButton imageButton = findViewById(R.id.imageButton);
        Typeface mytype = Typeface.createFromAsset(getAssets(), "jf.ttf");
        textView.setTypeface(mytype);
        textView.setTextColor(Color.rgb(5, 15, 138));
        Intent intent = getIntent();
        int answer = intent.getIntExtra("answer", 0);
        String answers = intent.getStringExtra("answers");
        final int time = intent.getIntExtra("time", 1);
        if (answer == 1) { //答對
            img.setImageResource(R.drawable.pass);
            textView.setTextSize(18);
            textView.setText("恭喜答對！\n" +
                    "答案就是" + answers);
        }

        if (answer == 2) {
            img.setImageResource(R.drawable.miss);
            textView.setTextSize(18);
            textView.setText("好可惜答錯了☹\n" +
                    "正確答案是" + answers);
        }

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (time < 10) {
                    Intent intent = new Intent();
                    intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    intent.setClass(true_or_false.this, MainActivity.class);
                    startActivity(intent);
                } else gameOver();
            }
        });
    }

    private void gameOver() {
        SharedPreferences setting = getSharedPreferences("setting", 0);
        int Degree = setting.getInt("degree", 0);
        Intent intent = getIntent();
        int mScore = intent.getIntExtra("mScore", 0);
        SharedPreferences score = getSharedPreferences("score", 0);
        if (Degree == 2) {
            score.edit().putInt("lastScore_easy", mScore).apply();
        }
        if (Degree == 1) {
            score.edit().putInt("lastScore_hard", mScore).apply();
        }
        if (Degree == 0) {
            score.edit().putInt("lastScore_mid", mScore).apply();
        }
        if (mScore<70){
            intent.setClass(true_or_false.this,BestActivity.class);
        }
        else
        intent.setClass(true_or_false.this, MainActivity_puzzle.class);
        startActivity(intent);
        finish();
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
