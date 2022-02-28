package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Hobbies extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton add_button;

    Button Return11Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);

        recyclerView = findViewById(R.id.recyclerView);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Hobbies.this, AddActivity.class);
                startActivity(intent);
            }
        });

        //retourner sur Perso
        Return11Btn = (Button) findViewById(R.id.Return11Btn);
        Return11Btn.setOnClickListener(new View.OnClickListener() {
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