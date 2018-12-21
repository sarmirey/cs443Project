package com.example.sarmirey.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;

    DataBase d = new DataBase(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view)
    {
        if(view.getId() == R.id.loginButton)
        {
            EditText a = (EditText)findViewById(R.id.username);

            String str = a.getText().toString();

            EditText b = (EditText)findViewById(R.id.password);

            String pass = b.getText().toString();

            String password = d.searchPass(str);


            if(password.equals(pass))
            {
                Intent i = new Intent(MainActivity.this, activity_home. class);
                i.putExtra("Username", str);
                startActivity(i);
            }


            else
            {
              Toast toast = Toast.makeText(MainActivity.this, "Username and Password don't match", Toast.LENGTH_SHORT);
              toast.show();
            }



        }

        if(view.getId() == R.id.registerButton)
        {
            Intent intent = new Intent(MainActivity.this, activity_register. class);
            startActivity(intent);
        }
    }


}
