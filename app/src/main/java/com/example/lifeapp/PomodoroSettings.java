package com.example.lifeapp;

// tuto shared preference
//https://gist.github.com/codinginflow/b4f4c0cb30dbc135129c89fa13c184a1
//https://developer.android.com/reference/android/content/SharedPreferences
//https://www.youtube.com/watch?v=jiD2fxn8iKA


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import android.content.Context;
import android.content.SharedPreferences;


public class PomodoroSettings extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    long timetemp;
    long FTime;
    long SPTime;
    long LPTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomodoro_settings);

        Spinner spinner1 = findViewById(R.id.SpinnerFocus);
        Spinner spinner2 = findViewById(R.id.SpinnerShortPause);
        Spinner spinner3 = findViewById(R.id.SpinnerLongPause);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.Options_focus, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.Options_short, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.Options_long, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(this);
        FTime = timetemp;
        System.out.println("ICI JE VAIS IMPRIMER FTIME " + timetemp);


        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);
        SPTime = timetemp;
        System.out.println(timetemp);


        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(this);
        LPTime = timetemp;
        System.out.println(timetemp);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
        System.out.println("LA JE VAIS PRINT TEXT " + text);

        if (text.contains("10 min")){timetemp = 600;}
        else if (text.contains("15 min")){timetemp = 900;}
        else if (text.contains("20 min")){timetemp = 1200;}
        else if (text.contains("25 min")){timetemp = 1500;}
        else if (text.contains("30 min")){timetemp = 1800;}
        else {timetemp = 1;}

        System.out.println("LA JE VAIS PRINT TIMETEMP " + timetemp);
        System.out.println("LA JE VAIS PRINT Text " + text);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }



}