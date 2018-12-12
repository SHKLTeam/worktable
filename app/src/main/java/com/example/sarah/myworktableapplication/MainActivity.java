package com.example.sarah.myworktableapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView diary,note,calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diary = (ImageView) findViewById(R.id.diaryImg);
        note = (ImageView) findViewById(R.id.noteImg);
        calendar = (ImageView) findViewById(R.id.calendarImg);

        diary.setOnClickListener(this);
        note.setOnClickListener(this);
        calendar.setOnClickListener(this);

        diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScrollingActivity_Diary.class));
            }
        });

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FastNote.class));
            }
        });

        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Calendar.class));
            }
        });
    }


    @Override
    public void onClick(View v) {
    }




}
