package com.example.sarmirey.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_cats extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats);

        b1 = (Button)findViewById(R.id.cat1Button);
        b2 = (Button)findViewById(R.id.cat2Button);
        b3 = (Button)findViewById(R.id.cat3Button);
        b4 = (Button)findViewById(R.id.cat4Button);
        b5 = (Button)findViewById(R.id.cat5Button);
        b6 = (Button)findViewById(R.id.cat6Button);
    }

    public void clickonDog(View v)
    {
        Intent i = new Intent(this, activity_dogs.class);
        startActivity(i);
    }

    public void clickonCats(View v)
    {
        Toast toast = Toast.makeText(activity_cats.this, "You are already on this page", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void cat1Button(View v)
    {
        Toast toast = Toast.makeText(activity_cats.this, "You have just adopted the cat!", Toast.LENGTH_SHORT);
        toast.show();
        b1.setEnabled(false);
        b1.setText(" Adopted Already ");
    }

    public void cat2Button(View v)
    {
        Toast toast = Toast.makeText(activity_cats.this, "You have just adopted the cat!", Toast.LENGTH_SHORT);
        toast.show();
        b2.setEnabled(false);
        b2.setText(" Adopted Already ");
    }

    public void cat3Button(View v)
    {
        Toast toast = Toast.makeText(activity_cats.this, "You have just adopted the cat!", Toast.LENGTH_SHORT);
        toast.show();
        b3.setEnabled(false);
        b3.setText(" Adopted Already ");
    }

    public void cat4Button(View v)
    {
        Toast toast = Toast.makeText(activity_cats.this, "You have just adopted the cat!", Toast.LENGTH_SHORT);
        toast.show();
        b4.setEnabled(false);
        b4.setText(" Adopted Already ");
    }

    public void cat5Button(View v)
    {
        Toast toast = Toast.makeText(activity_cats.this, "You have just adopted the cat!", Toast.LENGTH_SHORT);
        toast.show();
        b5.setEnabled(false);
        b5.setText(" Adopted Already ");
    }

    public void cat6Button(View v)
    {
        Toast toast = Toast.makeText(activity_cats.this, "You have just adopted the cat!", Toast.LENGTH_SHORT);
        toast.show();
        b6.setEnabled(false);
        b6.setText(" Adopted Already ");
    }
}
