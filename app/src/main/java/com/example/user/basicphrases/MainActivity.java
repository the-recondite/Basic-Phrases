package com.example.user.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.user.basicphrases.R.raw.hello;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayerHello;
    MediaPlayer mediaPlayerBye;
    MediaPlayer mediaPlayerGoodAfternoon;
    MediaPlayer mediaPlayerEvening;
    MediaPlayer mediaPlayerPlease;
    MediaPlayer mediaPlayerSee;
    MediaPlayer mediaPlayerThank;
    MediaPlayer mediaPlayerWelcome;
    public void speak(View view) {
        switch(view.getId()) {
            case R.id.buttonHello:
                mediaPlayerHello.start();
                break;
            case R.id.buttonBye:
                mediaPlayerBye.start();
                break;
            case R.id.buttonAfternoon:
                mediaPlayerGoodAfternoon.start();
                break;
            case R.id.buttonEvening:
                mediaPlayerEvening.start();
                break;
            case R.id.buttonPlease:
                mediaPlayerPlease.start();
                break;
            case R.id.buttonSeeYou:
                mediaPlayerSee.start();
                break;
            case R.id.buttonThankYou:
                mediaPlayerThank.start();
                break;
            case R.id.buttonWelcome:
                mediaPlayerWelcome.start();
                break;

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayerHello = MediaPlayer.create(this, R.raw.hello);
        mediaPlayerBye = MediaPlayer.create(this, R.raw.bye);
        mediaPlayerGoodAfternoon = MediaPlayer.create(this, R.raw.goodafternoon);
        mediaPlayerEvening = MediaPlayer.create(this, R.raw.goodevening);
        mediaPlayerPlease = MediaPlayer.create(this, R.raw.please);
        mediaPlayerSee = MediaPlayer.create(this, R.raw.seeyou);
        mediaPlayerThank = MediaPlayer.create(this, R.raw.thankyou);
        mediaPlayerWelcome = MediaPlayer.create(this, R.raw.welcome);
    }
}
