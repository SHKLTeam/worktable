package com.example.sarah.myworktableapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;


public class Calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        CalendarView cv = (CalendarView) findViewById(R.id.calendarView);

        cv.setVerticalScrollBarEnabled(false);
        cv.setHorizontalScrollBarEnabled(false);
    }
}
