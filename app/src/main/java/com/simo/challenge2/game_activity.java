package com.simo.challenge2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class game_activity extends AppCompatActivity {

    TextView textViewTimer ;
    TextView textOperation ;
    TextView textViewPoint ;
    int nombre1,nombre2,resultat_correct;
    ArrayList<Integer> nombreanser ;
    ArrayList<Integer> nombre_button ;
    Button button1,button2,button3,button4;

    static int pointCor =0;
    static int pointInc =0;

    TextView textViewResult;
    MediaPlayer mediaPlayer ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_activity);

        nombreanser = new ArrayList<Integer>();
        nombre_button = new ArrayList<Integer>();
        nombre1 = (int)(Math.random()*100);
        nombre2 = (int)(Math.random()*100);

        resultat_correct = nombre1+nombre2;

        nombreanser.add(resultat_correct);
        nombreanser.add((int)(Math.random()*100));
        nombreanser.add((int)(Math.random()*100));
        nombreanser.add((int)(Math.random()*100));

        for(int i=0;i<=3;i++) {
            nombre_button.add(i+1);
        }
        Collections.shuffle(nombre_button);
        Collections.shuffle(nombreanser);

        textViewTimer = (TextView) findViewById(R.id.textViewTime);
        textOperation = (TextView) findViewById(R.id.textviewop);

        textOperation.setText(nombre1+"+"+nombre2);
        for(int i=0;i<=3;i++) {
                int id = getResources().getIdentifier("button"+(nombre_button.get(i)), "id", getPackageName());
            Button btn = (Button) findViewById(id);
                btn.setText(nombreanser.get(i)+"");

        }


        new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textViewTimer.setText((millisUntilFinished/1000)+"");
            }

            @Override
            public void onFinish() {
                textViewTimer.setText("END!");
            }
        }.start();
    }

    public void showresult(View view) {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        textViewResult = (TextView)findViewById(R.id.textresult);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewPoint= (TextView)findViewById(R.id.textViewPoint);
                if(button1.getText().toString().equals(resultat_correct+"")){
                    textViewResult.setText("Correct");
                    pointCor++;
                    textViewPoint.setText(pointCor+"/"+pointInc);
                    mediaPlayer = MediaPlayer.create(game_activity.this,R.raw.victoire);
                    mediaPlayer.start();
                   /* Intent intent = new Intent(game_activity.this,game_activity.class);
                    game_activity.this.startActivity(intent);*/

                    //mediaPlayer.stop();
                }else{
                    textViewResult.setText("InCorrect");
                    pointInc++;
                    textViewPoint.setText(pointCor+"/"+pointInc);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewPoint= (TextView)findViewById(R.id.textViewPoint);
                if(button2.getText().toString().equals(resultat_correct+"")){
                    textViewResult.setText("Correct");
                    pointCor++;
                    textViewPoint.setText(pointCor+"/"+pointInc);
                    mediaPlayer = MediaPlayer.create(game_activity.this,R.raw.victoire);
                    mediaPlayer.start();
                    Intent intent = new Intent(game_activity.this,game_activity.class);
                    game_activity.this.startActivity(intent);
                    mediaPlayer.stop();
                }else{
                    textViewResult.setText("InCorrect");
                    pointInc++;
                    textViewPoint.setText(pointCor+"/"+pointInc);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textViewPoint= (TextView)findViewById(R.id.textViewPoint);
                if(button3.getText().toString().equals(resultat_correct+"")){
                    textViewResult.setText("Correct");
                    pointCor++;
                    textViewPoint.setText(pointCor+"/"+pointInc);
                    mediaPlayer = MediaPlayer.create(game_activity.this,R.raw.victoire);
                    mediaPlayer.start();
                    Intent intent = new Intent(game_activity.this,game_activity.class);
                    game_activity.this.startActivity(intent);
                    mediaPlayer.stop();
                }else{
                    textViewResult.setText("InCorrect");
                    pointInc++;
                    textViewPoint.setText(pointCor+"/"+pointInc);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewPoint= (TextView)findViewById(R.id.textViewPoint);
                if(button4.getText().toString().equals(resultat_correct+"")){
                    textViewResult.setText("Correct");
                    pointCor++;
                    textViewPoint.setText(pointCor+"/"+pointInc);
                    mediaPlayer = MediaPlayer.create(game_activity.this,R.raw.victoire);
                    mediaPlayer.start();
                    Intent intent = new Intent(game_activity.this,game_activity.class);
                    game_activity.this.startActivity(intent);
                    mediaPlayer.stop();
                }else{
                    textViewResult.setText("InCorrect");
                    pointInc++;
                    textViewPoint.setText(pointCor+"/"+pointInc);
                }
            }
        });



    }



}
