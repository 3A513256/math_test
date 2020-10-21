package com.Beta.math_practice;

import androidx.appcompat.app.AppCompatActivity;

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

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4, tip, prompt;
    TextView score, question;
    private Qusetion_mid mQuestions_mid = new Qusetion_mid();
    private Qusetion_hard mQuestions_hard = new Qusetion_hard();
    private Qusetion_easy mQuestions_easy = new Qusetion_easy();
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
    ArrayList<String> Tip = new ArrayList<String>(10);
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
        tip = findViewById(R.id.tip);
        prompt = findViewById(R.id.prompt);
        score = findViewById(R.id.score);
        question = findViewById(R.id.question);
        score.setText("第" + time + "題" + "\n" + "\n" + "得分: 0");
        tip.setText("基本提示");
        prompt.setText("進階提示");
        Typeface mytype = Typeface.createFromAsset(getAssets(), "setofont.ttf");
        answer1.setTypeface(mytype);
        answer2.setTypeface(mytype);
        answer3.setTypeface(mytype);
        answer4.setTypeface(mytype);
        score.setTypeface(mytype);
        question.setTypeface(mytype);
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
    }

    private void updateArrayList() {
        if (Degree == 2) {
            int[] randomArray = new int[10];
            Random rnd = new Random();  //產生亂數初始值
            for (int i = 0; i < 10; i++) {
                randomArray[i] = rnd.nextInt(mQuestions_easy.mQuestions.length);   //亂數產生，亂數產生的範圍是1~17
                for (int j = 0; j < i; j++) {
                    while (randomArray[j] == randomArray[i]) {   //檢查是否與前面產生的數值發生重複，如果有就重新產生
                        j = 0;  //如有重複，將變數j設為0，再次檢查 (因為還是有重複的可能)
                        randomArray[i] = rnd.nextInt(mQuestions_easy.mQuestions.length);   //重新產生，存回陣列，亂數產生的範圍是1~9
                    }
                }
                Questions.add(mQuestions_easy.getQuestion(randomArray[i]));
                Answer1.add(mQuestions_easy.getChoice1(randomArray[i]));
                Answer2.add(mQuestions_easy.getChoice2(randomArray[i]));
                Answer3.add(mQuestions_easy.getChoice3(randomArray[i]));
                Answer4.add(mQuestions_easy.getChoice4(randomArray[i]));
                correct.add(mQuestions_easy.getCorrectAnswer(randomArray[i]));
                Tip.add(mQuestions_easy.gettip(randomArray[i]));
                Prompt.add(mQuestions_easy.getprompt(randomArray[i]));
            }
        }
        if (Degree == 0) {
            int[] randomArray = new int[10];
            Random rnd = new Random();  //產生亂數初始值
            for (int i = 0; i < 10; i++) {
                randomArray[i] = rnd.nextInt(mQuestions_mid.mQuestions.length);   //亂數產生，亂數產生的範圍是1~17
                for (int j = 0; j < i; j++) {
                    while (randomArray[j] == randomArray[i]) {   //檢查是否與前面產生的數值發生重複，如果有就重新產生
                        j = 0;  //如有重複，將變數j設為0，再次檢查 (因為還是有重複的可能)
                        randomArray[i] = rnd.nextInt(mQuestions_mid.mQuestions.length);   //重新產生，存回陣列，亂數產生的範圍是1~9
                    }
                }
                Questions.add(mQuestions_mid.getQuestion(randomArray[i]));
                Answer1.add(mQuestions_mid.getChoice1(randomArray[i]));
                Answer2.add(mQuestions_mid.getChoice2(randomArray[i]));
                Answer3.add(mQuestions_mid.getChoice3(randomArray[i]));
                Answer4.add(mQuestions_mid.getChoice4(randomArray[i]));
                correct.add(mQuestions_mid.getCorrectAnswer(randomArray[i]));
                Tip.add(mQuestions_mid.gettip(randomArray[i]));
                Prompt.add(mQuestions_mid.getprompt(randomArray[i]));
            }
        }
        if (Degree == 1) {
            int[] randomArray = new int[10];
            Random rnd = new Random();  //產生亂數初始值
            for (int i = 0; i < 10; i++) {
                randomArray[i] = rnd.nextInt(mQuestions_hard.mQuestions.length);   //亂數產生，亂數產生的範圍是1~17
                for (int j = 0; j < i; j++) {
                    while (randomArray[j] == randomArray[i]) {   //檢查是否與前面產生的數值發生重複，如果有就重新產生
                        j = 0;  //如有重複，將變數j設為0，再次檢查 (因為還是有重複的可能)
                        randomArray[i] = rnd.nextInt(mQuestions_hard.mQuestions.length);   //重新產生，存回陣列，亂數產生的範圍是1~9
                    }
                }
                Questions.add(mQuestions_hard.getQuestion(randomArray[i]));
                Answer1.add(mQuestions_hard.getChoice1(randomArray[i]));
                Answer2.add(mQuestions_hard.getChoice2(randomArray[i]));
                Answer3.add(mQuestions_hard.getChoice3(randomArray[i]));
                Answer4.add(mQuestions_hard.getChoice4(randomArray[i]));
                correct.add(mQuestions_hard.getCorrectAnswer(randomArray[i]));
                Tip.add(mQuestions_hard.gettip(randomArray[i]));
                Prompt.add(mQuestions_hard.getprompt(randomArray[i]));
            }
        }
    }

    private void updateQuestion(int num) {
        if (Degree == 0) {
            question.setText(Questions.get(num));
            answer1.setText(Answer1.get(num));
            answer2.setText(Answer2.get(num));
            answer3.setText(Answer3.get(num));
            answer4.setText(Answer4.get(num));
            mAnswer = correct.get(num);
            mtip = Tip.get(num);
            mprompt = Prompt.get(num);
        }

        if (Degree == 1) {
            question.setText(Questions.get(num));
            answer1.setText(Answer1.get(num));
            answer2.setText(Answer2.get(num));
            answer3.setText(Answer3.get(num));
            answer4.setText(Answer4.get(num));
            mAnswer = correct.get(num);
            mtip = Tip.get(num);
            mprompt = Prompt.get(num);
        }

        if (Degree == 2) {
            question.setText(Questions.get(num));
            answer1.setText(Answer1.get(num));
            answer2.setText(Answer2.get(num));
            answer3.setText(Answer3.get(num));
            answer4.setText(Answer4.get(num));
            mAnswer = correct.get(num);
            mtip = Tip.get(num);
            mprompt = Prompt.get(num);
        }
    }

    private void gameOver() {
        SharedPreferences score = getSharedPreferences("score", 0);
        if (Degree == 0) {
            score.edit().putInt("lastScore_easy", mScore).apply();
        }
        if (Degree == 1) {
            score.edit().putInt("lastScore_hard", mScore).apply();
        }
        if (Degree == 2) {
            score.edit().putInt("lastScore_hard", mScore).apply();
        }
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, BestActivity.class);
        startActivity(intent);
        finish();
    }

    private void gameNext_false() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("答錯了！")
                .setCancelable(false)
                .setPositiveButton("下一題", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (time < 10) {
                            time++;
                            updateQuestion(time - 1);
                            score.setText("第" + time + "題" + "\n" + "\n" + "得分:" + mScore);
                        } else {
                            gameOver();
                        }
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void gameNext_true() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("答對了！")
                .setCancelable(false)
                .setPositiveButton("下一題", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (time < 10) {
                            time++;
                            updateQuestion(time - 1);
                            score.setText("第" + time + "題" + "\n" + "\n" + "得分:" + mScore);
                        } else {
                            gameOver();
                        }
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
