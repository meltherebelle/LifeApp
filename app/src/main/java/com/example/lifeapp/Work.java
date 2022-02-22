package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.os.Bundle;

public class Work extends AppCompatActivity {

    Button ReturnBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        //retourner sur l'acceuil au clic du bouton Return
        ReturnBtn2 = (Button) findViewById(R.id.ReturnBtn2);
        ReturnBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceuil();
            }
        });
    }

    public void openAcceuil() {
        Intent intent = new Intent(this, Acceuil.class);
        startActivity(intent);
    }

}