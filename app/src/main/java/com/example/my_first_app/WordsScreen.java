package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class WordsScreen extends AppCompatActivity {
    public int a = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_screen);

        String[] a = Question.CreateQuestion();

        Button button1 = findViewById(R.id.button1);
        button1.setText(a[0]);

        Button button2 = findViewById(R.id.button2);
        button2.setText("second answer");

        Button button3 = findViewById(R.id.button3);
        button3.setText("therth answer");

        Button button4 = findViewById(R.id.button4);
        button4.setText("fourth answer");

    }

    public void onButtonClick1 (View v) {
        TextView b = findViewById(R.id.textScore);
        a = a + 1;
        b.setText("aaa"+Integer.toString(a));

    }

    public void onButtonClick2 (View v) {
        TextView b = findViewById(R.id.textScore);
        a = a + 10;
        a = Word.testMethod(a);
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

        TextView TextQuestion = findViewById(R.id.textQuestion);
        String TextQuestionText = TextQuestion.getText() + "1234";

        TextQuestion.setText(TextQuestionText);
        //получить слово и значения
        Date date = new Date();
        TextQuestion.setText(date.toString());

        Question.CreateQuestion();



    }

    public void SwitchAddWordScreen (View v) {
        Intent intent = new Intent(WordsScreen.this,AddUpdateWord.class);
        startActivity(intent);
    }
}