package com.Beta.math_practice;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;


public class MainActivity_puzzle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_puzzle);
        AssetManager am = getAssets();
        try {
            final String[] files = am.list("img");

            GridView grid = findViewById(R.id.grid);
            grid.setAdapter(new ImageAdapter(this));
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent_score = getIntent();
                    int mScore = intent_score.getIntExtra("mScore", 0);
                    if (mScore < 80) {
                        if (i < 5) {
                            Intent intent = new Intent(getApplicationContext(), PuzzleActivity.class);
                            intent.putExtra("assetName", files[i % files.length]);
                            startActivity(intent);
                        } else {
                            Toast.makeText(MainActivity_puzzle.this, "分數不夠", Toast.LENGTH_SHORT).show();
                        }
                    } else if (mScore < 90) {
                        if (i < 15) {
                            Intent intent = new Intent(getApplicationContext(), PuzzleActivity.class);
                            intent.putExtra("assetName", files[i % files.length]);
                            startActivity(intent);
                        } else {
                            Toast.makeText(MainActivity_puzzle.this, "分數不夠", Toast.LENGTH_SHORT).show();
                        }
                    } else if (mScore < 100) {
                        Intent intent = new Intent(getApplicationContext(), PuzzleActivity.class);
                        intent.putExtra("assetName", files[i % files.length]);
                        startActivity(intent);
                    }

                }
            });
        } catch (IOException e) {
            Toast.makeText(this, e.getLocalizedMessage(), Toast.LENGTH_SHORT);
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