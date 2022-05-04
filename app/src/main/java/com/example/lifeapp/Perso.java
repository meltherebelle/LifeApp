package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class Perso extends AppCompatActivity {

    Button MoodBtn;
    Button mydayBtn;
    Button ImBoredBtn;
    Button RealHobbyBtn;
    Button todolistBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perso);

        /*//retourner sur l'acceuil au clic du bouton Return1Btn
        Return1Btn = (Button) findViewById(R.id.Return1Btn);
        Return1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceuil();
            }
        });*/
        //ouvrir My day page
        mydayBtn = (Button) findViewById(R.id.mydayBtn);
        mydayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyDay();
            }
        });

        //aller sur écran Mood au clic du bouton MoodBtn
        MoodBtn = (Button) findViewById(R.id.MoodBtn);
        MoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMood();
            }
        });

        //aller sur écran TodoList au clic du bouton MoodBtn
        todolistBtn = (Button) findViewById(R.id.todolistBtn);
        todolistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHobbies();
            }
        });

        //aller sur écran ImBored au clic du bouton ImBoredBtn
        ImBoredBtn = (Button) findViewById(R.id.ImBoredBtn);
        ImBoredBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openImBored();
            }
        });

        //aller sur écran Hobbies au clic du bouton HobbiesBtn
        RealHobbyBtn = (Button) findViewById(R.id.RealHobbyBtn);
        RealHobbyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHobby();
            }
        });
    }
    public void openAcceuil () {
        Intent intent = new Intent(this, Acceuil.class);
        startActivity(intent);
    }

    public void openMood () {
        Intent intent = new Intent(this, Mood.class);
        startActivity(intent);
    }

    public void openImBored () {
        Intent intent = new Intent(this, ImBored.class);
        startActivity(intent);
    }

    public void openHobby () {
        Intent intent = new Intent(this, Hobby.class);
        startActivity(intent);
    }

    public void openHobbies () {
        Intent intent = new Intent(this, Hobbies.class);
        startActivity(intent);
    }

    public void openMyDay () {
        Intent intent = new Intent(this, Myday.class);
        startActivity(intent);
    }
}
