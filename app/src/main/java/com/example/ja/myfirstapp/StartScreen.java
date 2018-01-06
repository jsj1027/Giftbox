package com.example.ja.myfirstapp;

import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StartScreen extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        Calendar currentDateTime = Calendar.getInstance();
        Calendar eventDateTime = calendarSetup();
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MusicActivity.class);
        startActivity(intent);
    }

    public Calendar calendarSetup(){
        Calendar eventDateTime = Calendar.getInstance();
        eventDateTime.set(Calendar.MONTH, Calendar.NOVEMBER);
        eventDateTime.set(Calendar.DATE, 27);
        eventDateTime.set(Calendar.YEAR, 2017);
        eventDateTime.set(Calendar.HOUR, 12);
        eventDateTime.set(Calendar.AM, 0);
        return eventDateTime;
    }

    public boolean dateTimeCheck(Calendar current, Calendar event){
        return current.after(event);
    }
}
