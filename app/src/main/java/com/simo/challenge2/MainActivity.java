package com.simo.challenge2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer ;

    public void showgame(View view) {

        Intent intent = new Intent(MainActivity.this,game_activity.class);

        MainActivity.this.startActivity(intent);

        mediaPlayer.stop();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.start);

        mediaPlayer.start();
    }
}
