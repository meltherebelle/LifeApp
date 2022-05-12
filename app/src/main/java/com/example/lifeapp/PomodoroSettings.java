package com.example.lifeapp;

// tuto shared preference
//https://gist.github.com/codinginflow/b4f4c0cb30dbc135129c89fa13c184a1
//https://developer.android.com/reference/android/content/SharedPreferences
//https://www.youtube.com/watch?v=jiD2fxn8iKA

// envoyer les durees sur la classe pomodoro:
//https://developer.android.com/training/basics/intents/result
//https://stackoverflow.com/questions/10674390/how-to-pass-value-data-between-classes-activity-in-android


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class PomodoroSettings extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    static long timetemp;
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
        // on create ne s'execute qu'une seule fois
        // il fauxdrait intégrer l'enregistrement des variables dans la methode onitemselected

        String text1 =  "ICI JE VAIS IMPRIMER FTIME " + FTime;
        Toast.makeText(getApplicationContext(), text1, Toast.LENGTH_SHORT).show();

        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);

        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
        attributionDuree(text);
    }

    public void attributionDuree(String text){

        if (text.contains("f : 20 min")){FTime = 1200;}
        else if (text.contains("f : 25 min")){FTime = 1500;}
        else if (text.contains("f : 30 min")){FTime = 1800;}

        else if (text.contains("sp : 10 min")){SPTime = 600;}
        else if (text.contains("sp : 15 min")){SPTime = 900;}
        else if (text.contains("sp : 20 min")){SPTime = 1200;}

        else if (text.contains("lp : 20 min")){LPTime = 1200;}
        else if (text.contains("lp : 25 min")){LPTime = 1500;}
        else if (text.contains("lp : 30 min")){LPTime = 1800;}

        else {System.out.println("erreur dans la méthode attribution des durées");}

        System.out.println("ICI JE VAIS IMPRIMER FTIME " + FTime);
        System.out.println("ICI JE VAIS IMPRIMER SPTIME " + SPTime);
        System.out.println("ICI JE VAIS IMPRIMER LPTIME " + LPTime);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }


}