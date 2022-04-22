package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class actQuotes extends AppCompatActivity {

    TextView RandomQuote;
    Button NewQuote;
    Button ReturnBtn21;

    private String quotes[] = {"Be the change you wish to see in the world", " Be cool, Be Lea", "Thank you Mr.Darties for all the help"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_quotes);

        // retourner sur la page Work au clic du bouton Return21
        ReturnBtn21 = (Button) findViewById(R.id.ReturnBtn21);
        ReturnBtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWork();
            }
        });

        RandomQuote = (TextView) findViewById(R.id.RandomQuote);
        NewQuote = (Button) findViewById(R.id.NewQuote);
        NewQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(quotes.length);
                RandomQuote.setText(quotes[num]);
            }
        });
    }

    public void openWork() {
        Intent intent = new Intent(this, Work.class);
        startActivity(intent);
    }
}
//https://www.youtube.com/watch?v=RsirzntnFAw