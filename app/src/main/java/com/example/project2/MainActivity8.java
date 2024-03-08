package com.example.project2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public void startGame(View view) {
        Intent intent = new Intent(this, GameView2.class);
        startActivity(intent);
        finish();
    }
}