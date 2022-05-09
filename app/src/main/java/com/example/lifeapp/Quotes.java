package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

//voir partie Lea


public class Quotes extends AppCompatActivity {

    TextView RandomQuote;
    Button NewQuote;

    private String[] quotes = {"Be the change you wish to see in the world", " Be cool, Be Lea", "Thank you Mr.Darties for all the help"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        RandomQuote = findViewById(R.id.RandomQuote);
        NewQuote = findViewById(R.id.NewQuote);
        NewQuote.setOnClickListener(view -> {
            Random random = new Random();
            int num = random.nextInt(quotes.length);
            RandomQuote.setText(quotes[num]);
        });
    }

}
//https://www.youtube.com/watch?v=RsirzntnFAw