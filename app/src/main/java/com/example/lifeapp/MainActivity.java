package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button enterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //accéder à l'écran d'acceuil en cliquant sur Enter
        button = (Button) findViewById(R.id.EnterBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceuil();
            }
        });
    }

    //méthode pour ouvrir l'écran d'acceuil
    public void openAcceuil() {
        Intent intent = new Intent(this, Acceuil.class);
        startActivity(intent);
    }
}