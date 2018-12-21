package com.example.sarmirey.myapplication;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE__NAME = "data.db";
    private static final String TABLE_NAME = "data";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_UNAME = "uname";
    private static final String COLUMN_PASS = "pass";
    SQLiteDatabase db;
    private static final String TABLE_CREATE = " create table data (id integer primary key not null ," +
            "name text not null, email text not null, uname not null, pass text not null); ";


    public DataBase (Context context)
    {
        super(context, DATABASE__NAME, null, DATABASE_VERSION);
    }

    public void insertContact(registerInfo c)
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = " select * from data ";
        Cursor cursor = db.rawQuery(query,null);
        int count = cursor.getCount();
        values.put(COLUMN_ID, count);
        values.put(COLUMN_NAME, c.getName());
        values.put(COLUMN_EMAIL, c.getEmail());
        values.put(COLUMN_UNAME, c.getUname());
        values.put(COLUMN_PASS, c.getPass());

        db.insert(TABLE_NAME, null, values);
        db.close();


    }

    public String searchPass(String uname)
    {
        db = this.getReadableDatabase();
        String query = " select * from " +TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String x;
        String y;
        y = "not found";
        if(cursor.moveToFirst())
        {
            do
                {
                x = cursor.getString(3); //username


                if(x.equals(uname))
                {
                    y = cursor.getString(4); //password
                    break;
                }
            }
            while(cursor.moveToNext());
        }
        return y;
    }

    public String searchUsername(String username)
    {
        db = this.getReadableDatabase();
        String query = " select * from " +TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String x;
        String y = "not found";

        if(cursor.moveToFirst()) {
            do {
                x = cursor.getString(3);

                if(x.equals(username))
                {
                    y = cursor.getString(3);
                }
            }
            while(cursor.moveToNext());
        }
        return y;
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = " DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}
