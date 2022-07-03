package com.example.my_first_app;

import static java.time.LocalTime.now;

import android.database.Cursor;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.sql.*;

class Word {
    int id;
    String name;
    String translate;
    int PartSpeechId;
    int LangWordId;
    int LangTranslateId;
    String WordDefinition;
    Date DateLastRepeated;
    Date DateNextRepeated;
    Boolean Learned;
    Boolean UpdateByUser;
    int SuccessfulAnswersRow;
    int TotalRepetitions;


    public static int testMethod(int b){
        b = b +1000;
        return b;

    }

    public static String AddWord(String AddWord, String AddTranslate){

        //добавить проверку, что слово новое

        String S = "insert into word values (1,'" + AddWord + "','" + AddTranslate + "')";

        WorkWithDatabase.myDB.insert(s);

        String reply = "word added in Database";

        return reply;

    }

    public static void Update(int idWord, boolean correctAnswer){
        int id = idWord;
        //запрашиваем слово из бд
        WorkWithDatabase.myDB.execSQL(
                "select id, name, translate, PartSpeechId, LangWordId, LangTranslateId,WordDefinition, DateLastRepeated, Learned, UpdateByUser, SuccessfulAnswersRow, TotalRepetitionsfrom word where id = 'idword');
        );

        Date DateLastRepeated = now();
        Date DateNextRepeated;
        Boolean Learned;
        int SuccessfulAnswersRow;
        int TotalRepetitions;
        String StringForSQL;


        if true == correctAnswer {
            SuccessfulAnswersRow = SuccessfulAnswersRow + 1;
            if SuccessfulAnswersRow == 1 {
                DateNextRepeated = now() + 1 hour;
            }
            else if SuccessfulAnswersRow == 2 {
                DateNextRepeated = now() + 12 hour;
            }
            else if SuccessfulAnswersRow == 3 {
                DateNextRepeated = now() + 1 day;
            }
            else if SuccessfulAnswersRow == 4 {
                DateNextRepeated = now() + 3 days;
            }
            else if SuccessfulAnswersRow == 5 {
                DateNextRepeated = now() + 7 days;
            }
            else if SuccessfulAnswersRow =>7 and Learned == 0 {
                Learned = 1;
                DateNextRepeated = now() + 7 days;
            }
        }
        else {
            SuccessfulAnswersRow = 0;
        }

        TotalRepetitions = TotalRepetitions +1;
        //update word SET column_1 = new_value_1,
        //    column_2 = new_value_2
        //WHERE
        //    word.id =
        WorkWithDatabase.myDB.execSQL("select * from words where order by   ");

    }


    public static void Get(){
        String StringForSQL = "select id,word,translate from words where DateNextRepeated <" + now() + "order by DateNextRepeated desc limit 1";

        Cursor myCursor =
                WorkWithDatabase.myDB.rawQuery(StringForSQL, null);

        while (myCursor.moveToNext()) {
            String abc = myCursor.getString(0);
            ScoreText.setText(abc);
            //ScoreText.setText("word's added successfully");*/

    }

    public static void Delete(){

    }
}
