package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hobby extends AppCompatActivity {

    Button RealHobbyBtn;
    Button return22Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby);

        //retourner sur l'acceuil au clic du bouton Return1Btn
        return22Btn = (Button) findViewById(R.id.return22Btn);
        return22Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //aller sur écran Mood au clic du bouton MoodBtn
        RealHobbyBtn = (Button) findViewById(R.id.RealHobbyBtn);
        RealHobbyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHobby();
            }
        });
    }

    public void openHobby () {
        Intent intent = new Intent(this, Hobby.class);
        startActivity(intent);
    }

}