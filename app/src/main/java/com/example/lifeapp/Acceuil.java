package com.example.lifeapp;

import static com.example.lifeapp.R.id.WorkBtn;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.os.Bundle;

public class Acceuil extends AppCompatActivity {

    Button returnBtn;
    Button PersoBtn;
    Button WorkBtn;
    Button DatasBtn;
    Button ResultsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        /*//retourner sur l'activité main au clic du bouton Return
        returnBtn = (Button) findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });*/

        //ouvrir activité Perso au clic du PersoBtn
        PersoBtn = (Button) findViewById(R.id.PersoBtn);
        PersoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPerso();
            }
        });

        //ouvrir activité Results au clic du ResultsBtn
        ResultsBtn = (Button) findViewById(R.id.ResultsBtn);
        ResultsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openResults();
            }
        });

        //ouvrir activité Datas au clic du DatasBtn
        DatasBtn = (Button) findViewById(R.id.DatasBtn);
        DatasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDatas();
            }
        });


        //ouvrir activité Work au clic du WorkBtn
        WorkBtn = (Button) findViewById(R.id.WorkBtn);
        WorkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWork();
            }
        });
    }

    //méthode pour ouvrir le mainActivity
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openPerso() {
        Intent intent = new Intent(this, Perso.class);
        startActivity(intent);
    }

    public void openWork() {
        Intent intent = new Intent(this, Work.class);
        startActivity(intent);
    }

    public void openDatas() {
        Intent intent = new Intent(this,Datas.class);
        startActivity(intent);
    }

    public void openResults() {
        Intent intent = new Intent(this,Results.class);
        startActivity(intent);
    }
}