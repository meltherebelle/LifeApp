package com.example.lifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class Pomodoro extends AppCompatActivity {

    private static final long START_TIME_IN_MILLIS = 600000;

    private TextView CountdownView;
    private Button ButtonStartPause;
    private Button ButtonReset;
    Button ReturnBtn22;
    Button PersonalizeTimerBtn;

    private CountDownTimer CountDownTimer;

    private boolean TimerRunning;

    private long TimeLeftInMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomodoro);

        CountdownView = findViewById(R.id.CountownView);
        ButtonStartPause = findViewById(R.id.button_start_pause);
        ButtonReset = findViewById(R.id.button_reset);
        ReturnBtn22 = (Button) findViewById(R.id.ReturnBtn22);
        PersonalizeTimerBtn = (Button) findViewById(R.id.PersonalizeTimerBtn);


        ReturnBtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWork();
            }
        });

        PersonalizeTimerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSetting();
            }
        });

        ButtonStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TimerRunning) {
                    pauseTimer();
                } else {
                    startTimer();
                }
            }
        });

        ButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });

        updateCountDownText();
    }

    private void startTimer() {
        CountDownTimer = new CountDownTimer(TimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                TimeLeftInMillis = millisUntilFinished;
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

    public void openWork() {
        Intent intent = new Intent(this, Work.class);
        startActivity(intent);
    }

    public void openSetting() {
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
        TimeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
        ButtonReset.setVisibility(View.INVISIBLE);
        ButtonStartPause.setVisibility(View.VISIBLE);
    }

    private void updateCountDownText() {
        int minutes = (int) (TimeLeftInMillis / 1000) / 60;
        int seconds = (int) (TimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        CountdownView.setText(timeLeftFormatted);
    }

}
//https://www.youtube.com/watch?v=MDuGwI6P-X8