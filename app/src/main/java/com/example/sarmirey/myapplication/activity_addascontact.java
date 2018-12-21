package com.example.sarmirey.myapplication;

import android.content.Intent;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_addascontact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addvetcontact);

        Bundle b = getIntent().getExtras();


        String first = getIntent().getStringExtra("firstname");
        TextView tv1 = (TextView)findViewById(R.id.firstname);
        tv1.setText(first);

        String second = getIntent().getStringExtra("lastname");
        TextView tv2 = (TextView)findViewById(R.id.lastname);
        tv2.setText(second);

        String email = getIntent().getStringExtra("email");
        TextView tv3 = (TextView)findViewById(R.id.email);
        tv3.setText(email);

        String phone = getIntent().getStringExtra("phone");
        TextView tv4 = (TextView)findViewById(R.id.phone);
        tv4.setText(phone);

        int picture = b.getInt("picture");
        ImageView image = (ImageView)findViewById(R.id.pic);
        image.setImageResource(picture);

    }

    public void onClick(View view)
    {
        Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);

        TextView firstname = (TextView) findViewById(R.id.firstname);
        TextView lastname =  (TextView)findViewById(R.id.lastname);
        TextView phone = (TextView)findViewById(R.id.phone);
        TextView email = (TextView)findViewById(R.id.email);

        intent
                .putExtra(ContactsContract.Intents.Insert.EMAIL, email.getText())
                .putExtra(ContactsContract.Intents.Insert.EMAIL_TYPE, ContactsContract.CommonDataKinds.Email.TYPE_WORK)
                .putExtra(ContactsContract.Intents.Insert.PHONE, phone.getText())
                .putExtra(ContactsContract.Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_WORK)
                .putExtra(ContactsContract.Intents.Insert.NAME, firstname.getText() + " " + lastname.getText())
        ;

        startActivity(intent);

    }

}
