package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class Mood extends AppCompatActivity {

    Button Return14Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);

        //retourner sur Perso
        Return14Btn = (Button) findViewById(R.id.Return14Btn);
        Return14Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPerso();
            }
        });
    }

    public void openPerso () {
        Intent intent = new Intent(this, Perso.class);
        startActivity(intent);
    }

}