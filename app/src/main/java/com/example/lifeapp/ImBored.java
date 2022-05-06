package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;


public class ImBored extends AppCompatActivity {

    Button Return13Btn;
    //MediaPlayer skrillex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im_bored);

        //hello lea c'est delph j'ai mis en commentaire la partie musique pcq ça affiche des ...
        // ...erreurs de mon côte surement pcq ça va chercher des fichiers locaux chez toi du coup...
        //...c'est juste temporaire tqt

        //Mettre de la musique
        //skrillex = MediaPlayer.create(getApplicationContext(),R.raw.skrillex);
        //skrillex.start();


        /*//retourner sur Perso
        Return13Btn = (Button) findViewById(R.id.Return13Btn);
        Return13Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPerso();
                onPause(); //et on arrête la musique
            }
        });*/
    }
    public void openPerso () {
        Intent intent = new Intent(this, Perso.class);
        startActivity(intent);
    }

    //Couper le son :
    //protected void onPause() {
        //super.onPause();
        //skrillex.release();
        //finish();
    //}

}
