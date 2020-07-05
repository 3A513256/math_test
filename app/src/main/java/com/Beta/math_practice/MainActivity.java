package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;
    TextView score, question;
    private Qusetion mQuestions = new Qusetion();
    private Qusetion_hard mQuestions_hard = new Qusetion_hard();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;
    private int mQuestionsLength_hard = mQuestions_hard.mQuestions1.length;
    private int question_Degree;
    private int Degree;
    Random r;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences setting = getSharedPreferences("setting", 0);
        Degree=setting.getInt("Degree", 0);
        if(Degree==0){question_Degree=mQuestionsLength;}
        if(Degree==1){question_Degree=mQuestionsLength_hard;}

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = new Random();

        answer1 = findViewById(R.id.answer4);
        answer2 = findViewById(R.id.answer3);
        answer3 = findViewById(R.id.answer2);
        answer4 = findViewById(R.id.answer1);
        score = findViewById(R.id.score);
        question = findViewById(R.id.question);
        updateQuestion(r.nextInt(question_Degree));
        score.setText("得分: " + 0);

        Typeface mytype=Typeface.createFromAsset(getAssets(),"setofont.ttf");
        answer1.setTypeface(mytype);
        answer2.setTypeface(mytype);
        answer3.setTypeface(mytype);
        answer4.setTypeface(mytype);
        score.setTypeface(mytype);
        question.setTypeface(mytype);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == mAnswer) {
                    mScore++;
                    score.setText("得分: " + mScore);
                    gameNext();
                } else {
                    gameOver();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mAnswer) {
                    mScore++;
                    score.setText("得分: " + mScore);
                    gameNext();
                } else {
                    gameOver();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mAnswer) {
                    mScore++;
                    score.setText("得分: " + mScore);
                    gameNext();
                } else {
                    gameOver();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == mAnswer) {
                    mScore++;
                    score.setText("得分: " + mScore);
                    gameNext();
                } else {
                    gameOver();
                }
            }
        });
    }

    private void updateQuestion(int num) {
        if (Degree == 0) {
            question.setText(mQuestions.getQuestion(num));
            answer1.setText(mQuestions.getChoice1(num));
            answer2.setText(mQuestions.getChoice2(num));
            answer3.setText(mQuestions.getChoice3(num));
            answer4.setText(mQuestions.getChoice4(num));
            mAnswer = mQuestions.getCorrectAnswer(num);
        }
        if (Degree == 1) {
            question.setText(mQuestions_hard.getQuestion(num));
            answer1.setText(mQuestions_hard.getChoice1(num));
            answer2.setText(mQuestions_hard.getChoice2(num));
            answer3.setText(mQuestions_hard.getChoice3(num));
            answer4.setText(mQuestions_hard.getChoice4(num));
            mAnswer = mQuestions_hard.getCorrectAnswer(num);
        }
    }
    private void gameOver() {
        SharedPreferences score = getSharedPreferences("score", 0);
        score.edit().putInt("lastScore", mScore).apply();
        Intent intent = new Intent();
        intent.setClass(MainActivity.this , BestActivity.class);
        startActivity(intent);
        finish();
    }

    private void gameNext() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("答對了！")
                .setCancelable(false)
                .setPositiveButton("下一題", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        updateQuestion(r.nextInt(question_Degree));
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
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
