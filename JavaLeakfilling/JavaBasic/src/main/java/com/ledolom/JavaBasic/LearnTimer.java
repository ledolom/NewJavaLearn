package com.ledolom.JavaBasic;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class LearnTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new FindTask(),0, TimeUnit.SECONDS.toMillis(2));
    }
}
