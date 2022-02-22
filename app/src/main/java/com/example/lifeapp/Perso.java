package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class Perso extends AppCompatActivity {

    Button Return1Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perso);

        //retourner sur l'acceuil au clic du bouton Return1Btn
        Return1Btn = (Button) findViewById(R.id.Return1Btn);
        Return1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceuil();
            }
        });
    }
    public void openAcceuil () {
        Intent intent = new Intent(this, Acceuil.class);
        startActivity(intent);
    }
}
