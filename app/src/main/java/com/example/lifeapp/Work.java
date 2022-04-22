package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class Work extends AppCompatActivity {

    Button ReturnBtn2;
    Button Pomodoro;
    Button GoalsWork;
    Button Quotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        /* retourner sur l'acceuil au clic du bouton Return */
        ReturnBtn2 = (Button) findViewById(R.id.ReturnBtn2);
        ReturnBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceuil();
            }
        });

        /* aller sur la page Quotes au clic du bouton Get Motivated */
        Quotes = (Button) findViewById(R.id.Quotes);
        Quotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuotes();
            }
        });

        /* aller sur la page Pomodoro au clic du bouton Pomodoro */
        Pomodoro = (Button) findViewById(R.id.Pomodoro);
        Pomodoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPomodoro();
            }
        });

        /* aller sur la page GoalsWork au clic du bouton GoalsWork */
        GoalsWork = (Button) findViewById(R.id.GoalsWork);
        GoalsWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGoalsWork();
            }
        });
    }

    public void openAcceuil() {
        Intent intent = new Intent(this, Acceuil.class);
        startActivity(intent);
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