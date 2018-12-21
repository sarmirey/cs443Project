package com.example.sarmirey.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class pickaGame extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickagame);
    }

    public void guessNum(View view)
    {
        Intent i = new Intent(this, GuesstheNumbers.class);
        startActivity(i);
    }

    public void tof(View view)
    {
        Intent i = new Intent(this, trueorFalse.class);
        startActivity(i);
    }
}
