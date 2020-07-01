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
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;



public class setting extends AppCompatActivity {

    int boy=0,girls=0,Easy=0,Difficulty=0;

    String name_input;
    Button confirm, rst, start;
    TextView textView_name, textView_gender, textView_Degree;
    EditText editText;
    RadioButton boys,girl,easy,difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        confirm = findViewById(R.id.confirm);
        rst = findViewById(R.id.rst);
        start = findViewById(R.id.start);
        textView_name = findViewById(R.id.textView_name);
        textView_gender = findViewById(R.id.textView_gender);
        textView_Degree = findViewById(R.id.textView_Degree);
        editText = findViewById(R.id.name);
        boys = findViewById(R.id.gender_boy);
        girl = findViewById(R.id.gender_girl);
        easy =  findViewById(R.id.Degree_easy);
        difficulty =  findViewById(R.id.Degree_difficulty);
        boys.setOnCheckedChangeListener(gender);
        girl.setOnCheckedChangeListener(gender);
        easy.setOnCheckedChangeListener(Degree);
        difficulty.setOnCheckedChangeListener(Degree);

        Typeface mytype = Typeface.createFromAsset(getAssets(), "setofont.ttf");
        textView_name.setTypeface(mytype);
        textView_gender.setTypeface(mytype);
        textView_Degree.setTypeface(mytype);
        textView_name.setTextSize(30);
        textView_gender.setTextSize(30);
        textView_Degree.setTextSize(30);
        textView_name.setText("請輸入使用者名稱：");
        textView_gender.setText("請選擇性別");
        textView_Degree.setText("請選擇難易度");

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences setting = getSharedPreferences("setting", MODE_PRIVATE);
                setting.edit().apply();
                Intent intent = new Intent();
                setting.edit().putString("name", name_input).apply();
                if((Easy==Difficulty)){
                    Toast.makeText(setting.this, "請選擇條件", Toast.LENGTH_SHORT).show();}
                if(Easy < Difficulty) {
                    if (name_input == null) {
                        Toast.makeText(setting.this, "請輸入使用者名稱", Toast.LENGTH_SHORT).show();
                    } else {
                        setting.edit().putInt("Degree", 1).commit();
                        intent.setClass(setting.this, MainActivity.class);
                        startActivity(intent);}}
                if(Easy > Difficulty){
                    if(name_input==null){
                        Toast.makeText(setting.this, "請輸入使用者名稱", Toast.LENGTH_SHORT).show();}
                    else {
                        setting.edit().putInt("Degree", 0).commit();
                        intent.setClass(setting.this, MainActivity.class);
                        startActivity(intent);}}
                //補上性別功能
                if(boy > girls){
                    setting.edit().putInt("gender", 1).commit();}
                if(boy < girls){
                    setting.edit().putInt("gender", 0).commit();}

            }
        });

        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(setting.this, page1.class);
                startActivity(intent);
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name_input=editText.getText().toString();
                if(name_input==null){
                    Toast.makeText(setting.this, "請輸入使用者名稱", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(setting.this, "輸入成功", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private CompoundButton.OnCheckedChangeListener Degree = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            switch (buttonView.getId()) {
                case R.id.Degree_easy:
                    Easy=1;
                    Difficulty=0;
                    break;
                case R.id.Degree_difficulty:
                    Easy=0;
                    Difficulty=1;
                    break;
            }
        }
    };

    private CompoundButton.OnCheckedChangeListener gender = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            switch (buttonView.getId()) {
                case R.id.gender_boy:
                    boy=1;
                    girls=0;
                    break;
                case R.id.gender_girl:
                    boy=0;
                    girls=1;
                    break;
            }
        }
    };

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
