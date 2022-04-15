package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;


public class ImBored extends AppCompatActivity {

    Button Return13Btn;
    MediaPlayer mysound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im_bored);

        //Mettre de la musique
        MediaPlayer mysound = MediaPlayer.create(getApplicationContext(),R.raw.mysound);
        mysound.start();


        //retourner sur Perso
        Return13Btn = (Button) findViewById(R.id.Return13Btn);
        Return13Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPerso();
                onPause(); //et on arrête la musique
            }
        });
    }
    public void openPerso () {
        Intent intent = new Intent(this, Perso.class);
        startActivity(intent);
    }

    //Couper le son :
    protected void onPause() {
        super.onPause();
        mysound.release();
        finish();
    }

}