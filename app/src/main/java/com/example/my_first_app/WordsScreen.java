package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WordsScreen extends AppCompatActivity {
    public int a = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_screen);

    }

    public void onButtonClick1 (View v) {
        TextView b = findViewById(R.id.textScore);
        a = a + 1;
        b.setText("aaa"+Integer.toString(a));
        // System.out.print(v)
    }

    public void onButtonClick2 (View v) {
        TextView b = findViewById(R.id.textScore);
        a = a + 10;
        a = Word.testa(a);
        b.setText("aaa"+Integer.toString(a));

        // System.out.print(v);

    }

    public void onButtonClick3 (View v) {
        TextView b = findViewById(R.id.textScore);
        a = a + 100;
        b.setText("aaa"+Integer.toString(a));
        // System.out.print(v);

    }

    public void onButtonClick4 (View v) {
        TextView b = findViewById(R.id.textScore);
        a = a + 100;
        b.setText("aaa"+Integer.toString(a));
        // System.out.print(v);

    }

    public void onButtonClickSkip (View v) {
        TextView b = findViewById(R.id.textScore);
        a = a + 100000;
        b.setText("aaa" + Integer.toString(a));
        // System.out.print(v);
        SQLiteDatabase myDB =
                openOrCreateDatabase("my.db", MODE_PRIVATE, null);

        b.setText("database open");

        myDB.execSQL(
                "CREATE TABLE IF NOT EXISTS user (name VARCHAR(200), age INT, is_single INT)"
        );
        b.setText("table create");

        myDB.execSQL(
                "insert into user values ('leo',1,1)"
        );

        Cursor myCursor =
                myDB.rawQuery("select count(name) as n from user", null);

        while(myCursor.moveToNext()) {
            String abc = myCursor.getString(0);
            b.setText(abc);
        }


        /*          b.setText(a);*/
    }
}