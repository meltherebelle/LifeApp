package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;
import android.widget.Toast;
import android.content.SharedPreferences;

import java.util.Locale;

public class Pomodoro extends AppCompatActivity {

    /* INFORMATIONS
    - toutes les durées sont en millisecondes
    - les durées des différentes phases sont par défaut 25/5/30 min
    - les durées peuvent êtres modifiées dans PomodoroSettings grâce aux SharedPreferences
    - Le cycle Pomodoro comporte 8 phases : (permet de déterminer la durée affichée sur le minuteur)
            > 1,3,5,7 : période de concentration
            > 2,4,6 : courte pause
            > 8 : longue pause
     */

    int Phase = 1;



    private static final long Time = 600000;
    private boolean TimerRunning;
    private long TimeLeft = Time;

    private TextView CountdownView;
    private Button ButtonStartPause, ButtonReset;
    private CountDownTimer CountDownTimer;

    Button PersonalizeTimerBtn;

    /*
    SharedPreferences sp = getApplicationContext().getSharedPreferences("PomodoroSettings", Context.MODE_PRIVATE);

    int TimeLeftInSFocus = sp.getInt("FocusTime",0);
    int TimeLeftInSShort = sp.getInt("ShortPauseTime",0);
    int TimeLeftInSLong = sp.getInt("LongPauseTime",0);
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomodoro);

        CountdownView = findViewById(R.id.CountownView);
        ButtonStartPause = findViewById(R.id.button_start_pause);
        ButtonReset = findViewById(R.id.button_reset);
        PersonalizeTimerBtn = findViewById(R.id.PersonalizeTimerBtn);

        PersonalizeTimerBtn.setOnClickListener(v -> openSettings());

        ButtonStartPause.setOnClickListener(v -> {
            if (TimerRunning) {
                pauseTimer();
            } else {
                startTimer();
            }
        });

        ButtonReset.setOnClickListener(v -> resetTimer());

        updateCountDownText();
    }

    private void startTimer() {
        CountDownTimer = new CountDownTimer(TimeLeft, 1) {
            @Override
            public void onTick(long millisUntilFinished) {
                TimeLeft = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                TimerRunning = false;
                ButtonStartPause.setText("Start");
                ButtonStartPause.setVisibility(View.INVISIBLE);
                ButtonReset.setVisibility(View.VISIBLE);
            }
        }.start();

        TimerRunning = true;
        ButtonStartPause.setText("pause");
        ButtonReset.setVisibility(View.INVISIBLE);
    }

    public void openSettings() {
        Intent intent = new Intent(this, PomodoroSettings.class);
        startActivity(intent);
    }

    private void pauseTimer() {
        CountDownTimer.cancel();
        TimerRunning = false;
        ButtonStartPause.setText("Start");
        ButtonReset.setVisibility(View.VISIBLE);
    }

    private void resetTimer() {
        TimeLeft = Time;
        updateCountDownText();
        ButtonReset.setVisibility(View.INVISIBLE);
        ButtonStartPause.setVisibility(View.VISIBLE);
    }

    private void updateCountDownText() {
        int minutes = (int) (TimeLeft/1000) / 60;
        int seconds = (int) (TimeLeft/1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        CountdownView.setText(timeLeftFormatted);
    }

}
//https://www.youtube.com/watch?v=MDuGwI6P-X8