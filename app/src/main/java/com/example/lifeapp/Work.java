package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class Work extends AppCompatActivity {

    Button Pomodoro;
    Button GoalsWork;
    Button Quotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        /* aller sur la page Quotes au clic du bouton Get Motivated */
        Quotes = (Button) findViewById(R.id.Quotes);
        Quotes.setOnClickListener(view -> openQuotes());

        /* aller sur la page Pomodoro au clic du bouton Pomodoro */
        Pomodoro = (Button) findViewById(R.id.Pomodoro);
        Pomodoro.setOnClickListener(view -> openPomodoro());

        /* aller sur la page GoalsWork au clic du bouton GoalsWork */
        GoalsWork = (Button) findViewById(R.id.GoalsWork);
        GoalsWork.setOnClickListener(view -> openGoalsWork());
    }


    public void openQuotes() {
        Intent intent = new Intent(this, actQuotes.class);
        startActivity(intent);
    }

    public void openPomodoro() {
        Intent intent = new Intent(this, Pomodoro.class);
        startActivity(intent);
    }

    public void openGoalsWork() {
        Intent intent = new Intent(this, GoalsWork.class);
        startActivity(intent);
    }
}