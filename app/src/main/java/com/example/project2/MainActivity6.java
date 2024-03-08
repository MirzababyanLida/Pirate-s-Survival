package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void startGame(View view) {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
        finish();
    }

    public void Start(View v) {
         Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
        finish();
    }
}