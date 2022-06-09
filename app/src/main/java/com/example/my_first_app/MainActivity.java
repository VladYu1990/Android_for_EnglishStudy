package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextQuestion textQuestion;
    private But buttonGoToProperty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        But = findViewById(R.id.buttonGoToProperty);
        TextQuestion = findViewById(R.id.textQuestion);

        But.setOnClockListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextQuestion.TextView = 'gerere'

            }
        });
    }
}

public class Aaaa