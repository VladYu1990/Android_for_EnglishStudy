package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.sql.*;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.TextView;

public class AddUpdateWord extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_update_word);
    }


    @Override
    protected void AddWord (View v) {
        TextView b = findViewById(R.id.textScore);

        SQLiteDatabase myDB =
                openOrCreateDatabase("my.db", MODE_PRIVATE, null);

        b.setText("database open");

        myDB.execSQL(
                "CREATE TABLE IF NOT EXISTS user (name VARCHAR(200), age INT, is_single INT)"
        );

        b.setText("table create");

        myDB.execSQL(
                "insert into user values ('leon',1,1)"
        );

        myDB.execSQL(
                "insert into user values ('leok',1,1)"
        );

        myDB.execSQL(
                "insert into user values ('leog',1,1)"
        );
        Cursor myCursor =
                myDB.rawQuery("select name as n from user", null);

        while (myCursor.moveToNext()) {
            String abc = myCursor.getString(0);
            b.setText(abc);
        }
    }
}