package com.example.sarmirey.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_register extends Activity {

    DataBase d = new DataBase(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onRegisterClick(View view)
    {
        if(view.getId() == R.id.registerB)
        {
            EditText name = (EditText)findViewById(R.id.nameEditText);
            EditText email = (EditText)findViewById(R.id.emailEditTex);
            EditText uname = (EditText)findViewById(R.id.usernameEditTex);
            EditText password1 = (EditText)findViewById(R.id.password1EditTex);
            EditText password2 = (EditText)findViewById(R.id.password2EditTex);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String usernamestr = uname.getText().toString();
            String password1str = password1.getText().toString();
            String password2str = password2.getText().toString();

            String usernameindatabase = d.searchUsername(usernamestr);

            if(!password1str.equals(password2str))
            {
                Toast pass = Toast.makeText(activity_register.this, "Passwords don't match", Toast.LENGTH_SHORT);
                pass.show();
            }

            if (usernamestr.equals(usernameindatabase)) {
                Toast pass = Toast.makeText(activity_register.this, "Username already exists, choose another one", Toast.LENGTH_SHORT);
                pass.show();
            }
            else
            {
                registerInfo c = new registerInfo();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(usernamestr);
                c.setPass(password1str);
                d.insertContact(c);
                Intent intent = new Intent(activity_register.this, MainActivity.class);
                startActivity(intent);

            }



        }
    }
}
