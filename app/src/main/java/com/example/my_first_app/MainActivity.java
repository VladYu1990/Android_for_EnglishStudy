package com.example.my_first_app;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClickABC (View v) {
        TextView b = findViewById(R.id.button_go_to);
        System.out.print("done1");
        Intent intent = new Intent(MainActivity.this,WordsScreen.class);
        System.out.print("done2");
        startActivity(intent);
        System.out.print("done3");
    }
}
