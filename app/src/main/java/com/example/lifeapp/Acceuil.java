package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.os.Bundle;

public class Acceuil extends AppCompatActivity {

    Button returnBtn;
    Button PersoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        //retourner sur l'activité main au clic du bouton Return
        returnBtn = (Button) findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        //ouvrir activité Perso au clic du PersoBtn
        PersoBtn = (Button) findViewById(R.id.PersoBtn);
        PersoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPerso();
            }
        });}

    //méthode pour ouvrir le mainActivity
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void openPerso() {
        Intent intent = new Intent(this, Perso.class);
        startActivity(intent);
    }

    /*this.MyActivity.finish();


    //  OU BIEN :

    public class StatsActivity extends Activity {

    Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        returnBtn = (Button) findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReturn = new Intent(StatsActivity.this, MainActivity.class);
                startActivity(intentReturn);
            }
        });
    }
}

     */
}