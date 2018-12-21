package com.example.sarmirey.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Vets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vets);
    }

    public void alyceButton(View view)
    {

        Intent i = new Intent(this, activity_addascontact.class);
        String firstname = "Alyce";
        String lastname = "Altman";
        String phone = " (617)-378-1634";
        String email = "aaltman@gmail.com";
        i.putExtra("picture", R.drawable.vetperson);
        i.putExtra("firstname", firstname);
        i.putExtra("lastname", lastname);
        i.putExtra("email", email);
        i.putExtra("phone", phone);
        startActivity(i);
    }

    public void jacksonButton(View view)
    {

        Intent i = new Intent(this, activity_addascontact.class);
        String firstname = "Henry";
        String lastname = "Jackson";
        String phone = " (617)-222-1564";
        String email = "jhenry@gmail.com";
        i.putExtra("picture", R.drawable.henryjackson);
        i.putExtra("firstname", firstname);
        i.putExtra("lastname", lastname);
        i.putExtra("email", email);
        i.putExtra("phone", phone);
        startActivity(i);
    }

    public void stewartButton(View view)
    {

        Intent i = new Intent(this, activity_addascontact.class);
        String firstname = "Jenna";
        String lastname = "Stewart";
        String phone = " (617)-456-9876";
        String email = "sjenna@gmail.com";
        i.putExtra("picture", R.drawable.jennastewart);
        i.putExtra("firstname", firstname);
        i.putExtra("lastname", lastname);
        i.putExtra("email", email);
        i.putExtra("phone", phone);
        startActivity(i);
    }

    public void smithButton(View view)
    {

        Intent i = new Intent(this, activity_addascontact.class);
        String firstname = "Robert";
        String lastname = "Smith";
        String phone = " (617)-555-3245";
        String email = "srobert@gmail.com";
        i.putExtra("picture", R.drawable.robertsmith);
        i.putExtra("firstname", firstname);
        i.putExtra("lastname", lastname);
        i.putExtra("email", email);
        i.putExtra("phone", phone);
        startActivity(i);
    }

    public void whiteButton(View view)
    {

        Intent i = new Intent(this, activity_addascontact.class);
        String firstname = "Holly";
        String lastname = "White";
        String phone = " (617)-890-0003";
        String email = "wholly@gmail.com";
        i.putExtra("picture", R.drawable.hollywhite);
        i.putExtra("firstname", firstname);
        i.putExtra("lastname", lastname);
        i.putExtra("email",email);
        i.putExtra("phone", phone);
        startActivity(i);
    }

    public void joeButton(View view)
    {

        Intent i = new Intent(this, activity_addascontact.class);
        String firstname = "Joe";
        String lastname = "Fong";
        String phone = " (617)-121-3490";
        String email = "fjoe@gmail.com";
        i.putExtra("email", email);
        i.putExtra("picture", R.drawable.fong);
        i.putExtra("firstname", firstname);
        i.putExtra("lastname", lastname);
        i.putExtra("phone", phone);
        startActivity(i);
    }


}
