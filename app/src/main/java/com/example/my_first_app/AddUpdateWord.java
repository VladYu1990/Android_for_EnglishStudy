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

import com.google.android.material.textfield.TextInputEditText;

public class AddUpdateWord extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_update_word);
    }


    public void AddWord (View v) {
        TextView ScoreText = findViewById(R.id.textScore);
        TextInputEditText AddWord = findViewById(R.id.in_word);
        TextInputEditText AddMeaning = findViewById(R.id.in_meaning);

        String AddWordText = AddWord.getText().toString();
        String AddMeaningText = AddMeaning.getText().toString();

        SQLiteDatabase myDB =
                openOrCreateDatabase("my.db", MODE_PRIVATE, null);

        myDB.execSQL(
                "CREATE TABLE IF NOT EXISTS word (id int, name VARCHAR(200), mianing VARCHAR(200))"
        );

        String S = "insert into word values (1,'" + AddWordText.toString() + "','" + AddMeaningText.toString() + "')";

        ScoreText.setText(S);


        Cursor myCursor =
                myDB.rawQuery("select name from word", null);

        while (myCursor.moveToNext()) {
            String abc = myCursor.getString(0);
            ScoreText.setText(abc);
            //ScoreText.setText("word's added successfully");*/
        }
    }
}