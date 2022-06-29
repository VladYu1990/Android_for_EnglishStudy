package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.sql.*;

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

    }

    public void onButtonClick2 (View v) {
        TextView b = findViewById(R.id.textScore);
        a = a + 10;
        a = Word.testa(a);
        b.setText("aaa"+Integer.toString(a));

    }

    public void onButtonClick3 (View v) {
        TextView b = findViewById(R.id.textScore);
        a = a + 100;
        b.setText("aaa"+Integer.toString(a));

    }

    public void onButtonClick4 (View v) {
        TextView b = findViewById(R.id.textScore);
        a = a + 100;
        b.setText("aaa"+Integer.toString(a));

    }

    public void onButtonClickSkip (View v) {
        TextView b = findViewById(R.id.textScore);
        a = a + 100000;
        b.setText("aaa" + Integer.toString(a));






    }
}