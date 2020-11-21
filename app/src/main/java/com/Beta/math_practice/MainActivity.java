package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4, tip, prompt, draw;
    TextView score, question;
    private arithmetic mQuestions_mid = new arithmetic();
    private plane_figure mQuestions_hard = new plane_figure();
    private time mQuestions_easy = new time();
    private String mAnswer, mtip, mprompt;
    private int mScore = 0;
    private int Degree;
    private int time = 1;

    ArrayList<String> Questions = new ArrayList<String>(10);
    ArrayList<String> Answer1 = new ArrayList<String>(10);
    ArrayList<String> Answer2 = new ArrayList<String>(10);
    ArrayList<String> Answer3 = new ArrayList<String>(10);
    ArrayList<String> Answer4 = new ArrayList<String>(10);
    ArrayList<String> correct = new ArrayList<String>(10);
    ArrayList<String> Prompt = new ArrayList<String>(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences setting = getSharedPreferences("setting", 0);
        Degree = setting.getInt("degree", 0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1 = findViewById(R.id.answer4);
        answer2 = findViewById(R.id.answer3);
        answer3 = findViewById(R.id.answer2);
        answer4 = findViewById(R.id.answer1);
        draw = findViewById(R.id.draw);
        tip = findViewById(R.id.tip);
        prompt = findViewById(R.id.prompt);
        score = findViewById(R.id.score);
        question = findViewById(R.id.question);
        score.setText("第" + time + "題" + "\n" + "\n" + "得分: 0");
        tip.setText("公式");
        prompt.setText("提示");
        draw.setText("畫板");
        question.setTextColor(Color.rgb(5, 15, 138));
        Typeface mytype = Typeface.createFromAsset(getAssets(), "jf.ttf");

        draw.setTypeface(mytype);
        tip.setTypeface(mytype);
        prompt.setTypeface(mytype);
        answer1.setTypeface(mytype);
        answer2.setTypeface(mytype);
        answer3.setTypeface(mytype);
        answer4.setTypeface(mytype);
        score.setTypeface(mytype);
        question.setTypeface(mytype);
        question.setTextColor(Color.rgb(5, 15, 138));
        updateArrayList();
        updateQuestion(time - 1);

        tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder
                        .setMessage(mtip)
                        .setCancelable(false)
                        .setPositiveButton("確定", null);
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                alertDialog.getWindow().getAttributes();
                TextView textView = (TextView) alertDialog.findViewById(android.R.id.message);
                textView.setTextSize(13);
            }
        });

        prompt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder
                        .setMessage(mprompt)
                        .setCancelable(false)
                        .setPositiveButton("確定", null);
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == mAnswer) {
                    mScore++;
                    gameNext_true();
                } else {
                    gameNext_false();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mAnswer) {
                    mScore++;
                    gameNext_true();
                } else {
                    gameNext_false();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mAnswer) {
                    mScore++;
                    gameNext_true();
                } else {
                    gameNext_false();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == mAnswer) {
                    mScore++;
                    gameNext_true();
                } else {
                    gameNext_false();
                }
            }
        });
        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, DrawView_setting.class);
                Bundle bundle = new Bundle();
                bundle.putString("question", Questions.get(time - 1));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void updateArrayList() {

        if (Degree == 0) {
            int[] randomArray = new int[10];
            Random rnd = new Random();  //產生亂數初始值
            for (int i = 0; i < 10; i++) {
                randomArray[i] = rnd.nextInt(mQuestions_mid.mQuestions.length);   //亂數產生，亂數產生的範圍是題目字串數
                for (int j = 0; j < i; j++) {
                    while (randomArray[j] == randomArray[i]) {   //檢查是否與前面產生的數值發生重複，如果有就重新產生
                        j = 0;  //如有重複，將變數j設為0，再次檢查 (因為還是有重複的可能)
                        randomArray[i] = rnd.nextInt(mQuestions_mid.mQuestions.length);   //重新產生，存回陣列，亂數產生的範圍是題目字串數
                    }
                }
                Questions.add(mQuestions_mid.getQuestion(randomArray[i]));
                Answer1.add(mQuestions_mid.getChoice1(randomArray[i]));
                Answer2.add(mQuestions_mid.getChoice2(randomArray[i]));
                Answer3.add(mQuestions_mid.getChoice3(randomArray[i]));
                Answer4.add(mQuestions_mid.getChoice4(randomArray[i]));
                correct.add(mQuestions_mid.getCorrectAnswer(randomArray[i]));
                Prompt.add(mQuestions_mid.getprompt(randomArray[i]));
            }
        }//普通
        if (Degree == 1) {
            int[] randomArray = new int[10];
            Random rnd = new Random();
            for (int i = 0; i < 10; i++) {
                randomArray[i] = rnd.nextInt(mQuestions_hard.mQuestions.length);
                for (int j = 0; j < i; j++) {
                    while (randomArray[j] == randomArray[i]) {
                        j = 0;
                        randomArray[i] = rnd.nextInt(mQuestions_hard.mQuestions.length);
                    }
                }
                Questions.add(mQuestions_hard.getQuestion(randomArray[i]));
                Answer1.add(mQuestions_hard.getChoice1(randomArray[i]));
                Answer2.add(mQuestions_hard.getChoice2(randomArray[i]));
                Answer3.add(mQuestions_hard.getChoice3(randomArray[i]));
                Answer4.add(mQuestions_hard.getChoice4(randomArray[i]));
                correct.add(mQuestions_hard.getCorrectAnswer(randomArray[i]));
                Prompt.add(mQuestions_hard.getprompt(randomArray[i]));
            }
        }//困難
        if (Degree == 2) {
            int[] randomArray = new int[10];
            Random rnd = new Random();  //產生亂數初始值
            for (int i = 0; i < 10; i++) {
                randomArray[i] = rnd.nextInt(mQuestions_easy.mQuestions.length);
                for (int j = 0; j < i; j++) {
                    while (randomArray[j] == randomArray[i]) {
                        j = 0;
                        randomArray[i] = rnd.nextInt(mQuestions_easy.mQuestions.length);
                    }
                }
                Questions.add(mQuestions_easy.getQuestion(randomArray[i]));
                Answer1.add(mQuestions_easy.getChoice1(randomArray[i]));
                Answer2.add(mQuestions_easy.getChoice2(randomArray[i]));
                Answer3.add(mQuestions_easy.getChoice3(randomArray[i]));
                Answer4.add(mQuestions_easy.getChoice4(randomArray[i]));
                correct.add(mQuestions_easy.getCorrectAnswer(randomArray[i]));
                Prompt.add(mQuestions_easy.getprompt(randomArray[i]));
            }
        }//簡單
    }

    private void updateQuestion(int num) {
        if (Degree == 0) {
            question.setText(Questions.get(num));
            answer1.setText(Answer1.get(num));
            answer2.setText(Answer2.get(num));
            answer3.setText(Answer3.get(num));
            answer4.setText(Answer4.get(num));
            mAnswer = correct.get(num);
            mprompt = Prompt.get(num);
            mtip = mQuestions_hard.formula();
        }

        if (Degree == 1) {
            question.setText(Questions.get(num));
            answer1.setText(Answer1.get(num));
            answer2.setText(Answer2.get(num));
            answer3.setText(Answer3.get(num));
            answer4.setText(Answer4.get(num));
            mAnswer = correct.get(num);
            mprompt = Prompt.get(num);
            mtip = mQuestions_mid.formula();
        }

        if (Degree == 2) {
            question.setText(Questions.get(num));
            answer1.setText(Answer1.get(num));
            answer2.setText(Answer2.get(num));
            answer3.setText(Answer3.get(num));
            answer4.setText(Answer4.get(num));
            mAnswer = correct.get(num);
            mprompt = Prompt.get(num);
            mtip = mQuestions_easy.formula();
        }
    }

    private void gameOver() {
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
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, BestActivity.class);
        startActivity(intent);
        finish();
    }

    private void gameNext_false() {

        Intent intent = new Intent(this, true_or_false.class);
        intent.putExtra("answer", 2); //答錯
        startActivity(intent);
        if (time < 10) {
            time++;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    //你想要延遲執行的程式碼
                    updateQuestion(time - 1);
                    score.setText("第" + time + "題" + "\n" + "\n" + "得分:" + mScore);
                }
            }, 500);
        } else {
            gameOver();
        }
    }

    private void gameNext_true() {

        Intent intent = new Intent(this, true_or_false.class);
        intent.putExtra("answer", 1);  //答對
        startActivity(intent);
        if (time < 10) {
            time++;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    //你想要延遲執行的程式碼
                    updateQuestion(time - 1);
                    score.setText("第" + time + "題" + "\n" + "\n" + "得分:" + mScore);
                }
            }, 500);
        } else {
            gameOver();
        }
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
