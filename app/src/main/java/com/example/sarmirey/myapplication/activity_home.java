package com.example.sarmirey.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView)findViewById(R.id.textView6);
        tv.setText("Welcome Back " + username);
    }

    public void vetButton(View v)
    {
        Intent i = new Intent(this, Vets.class);
        startActivity(i);
    }


    public void adoptPets(View view)
    {
        Intent i = new Intent(this, activity_dogs.class);
        startActivity(i);
    }

    public void win_prizes(View view)
    {
        Intent i = new Intent(this, pickaGame.class);
        startActivity(i);
    }
}
