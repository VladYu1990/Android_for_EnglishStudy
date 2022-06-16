package com.example.my_first_app;


import androidx.appcompat.app.AppCompatActivity;
import java.sql.*;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int a = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        a = word.testa(a);
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
}
