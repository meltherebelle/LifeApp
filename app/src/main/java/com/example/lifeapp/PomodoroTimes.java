package com.example.lifeapp;

import java.io.Serializable;


public class PomodoroTimes  implements Serializable {

    public long FocusTime;
    public long ShortPauseTime;
    public long LongPauseTime;

    public PomodoroTimes(long FTime, long SPTime, int LPTime) {
        FocusTime = FTime;
        ShortPauseTime = SPTime;
        LongPauseTime = LPTime;
    }

}
