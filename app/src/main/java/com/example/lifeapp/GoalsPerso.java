package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class GoalsPerso extends AppCompatActivity {

    Button Return12Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals_perso);

        //retourner sur Perso
        Return12Btn = (Button) findViewById(R.id.Return12Btn);
        Return12Btn.setOnClickListener(new View.OnClickListener() {
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