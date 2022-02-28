package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;


public class ImBored extends AppCompatActivity {

    Button Return13Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im_bored);

        //retourner sur Perso
        Return13Btn = (Button) findViewById(R.id.Return13Btn);
        Return13Btn.setOnClickListener(new View.OnClickListener() {
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