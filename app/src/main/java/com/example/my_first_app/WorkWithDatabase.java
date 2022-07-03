package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.FileUriExposedException;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.sql.Date;


public class WorkWithDatabase extends AppCompatActivity{
    public static SQLiteDatabase myDB;
    public void CreateAndInitializationDB() {

         myDB =
                openOrCreateDatabase("my.db", MODE_PRIVATE, null);

        myDB.execSQL(
                "CREATE TABLE IF NOT EXISTS word ( id int, name VARCHAR(200), translate VARCHAR(200), PartSpeechId int, LangWordId int, LangTranslateId int,WordDefinition string, DateLastRepeated datetime, Learned bool, UpdateByUser bool, SuccessfulAnswersRow int, TotalRepetitions int");

        try{
            myDB.execSQL(
                    "Alter table word add id int"
            );
        } catch (FileUriExposedException e){
        }

        try{
            myDB.execSQL(
                    "Alter table word add name VARCHAR(200)"
            );
        } catch (FileUriExposedException e){
        }

        try{
            myDB.execSQL(
                    "Alter table word add translate VARCHAR(200)"
            );
        } catch (FileUriExposedException e){
        }

        try{
            myDB.execSQL(
                    "Alter table word add PartSpeechId int"
            );
        } catch (FileUriExposedException e){
        }

        try{
            myDB.execSQL(
                    "Alter table word add LangWordId int"
            );
        } catch (FileUriExposedException e){
        }

        try{
            myDB.execSQL(
                    "Alter table word add LangTranslateId int"
            );
        } catch (FileUriExposedException e){
        }

        try{
            myDB.execSQL(
                    "Alter table word add WordDefinition string"
            );
        } catch (FileUriExposedException e){
        }

        try{
            myDB.execSQL(
                    "Alter table word add Learned bool"
            );
        } catch (FileUriExposedException e){
        }

        try{
            myDB.execSQL(
                    "Alter table word add UpdateByUser bool"
            );
        } catch (FileUriExposedException e){
        }

        try{
            myDB.execSQL(
                    "Alter table word add SuccessfulAnswersRow int"
            );
        } catch (FileUriExposedException e){
        }

        try{
            myDB.execSQL(
                    "Alter table word add TotalRepetitions int"
            );
        } catch (FileUriExposedException e){
        }

        try{
            myDB.execSQL(
                    "Alter table word add DateNextRepited datetime"
            );
        } catch (FileUriExposedException e){
        }

    }
}
