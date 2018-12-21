package com.example.sarmirey.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class congrats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats);
    }

    public void placeOrder (View v)
    {
        Toast toast = Toast.makeText(congrats.this, "Your prize is on its way", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void backtoHome(View v)
    {
        Intent i = new Intent(this, activity_home.class);
        startActivity(i);
    }
}
