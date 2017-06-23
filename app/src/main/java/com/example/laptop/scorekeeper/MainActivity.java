package com.example.laptop.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int pointsA=0;
    int foulA=0;
    int pointsB=0;
    int foulB=0;
    public void Point_A_3(View view)
    {

        pointsA=pointsA+3;
        displayforteamA(pointsA);
    }
    public void Point_A_2(View view)
    {
        pointsA=pointsA+2;
        displayforteamA(pointsA);
    }
    public void Point_A_1(View view)
    {
        pointsA=pointsA+1;
        displayforteamA(pointsA);
    }
    public void Point_A_foul(View view)
    {
        foulA=foulA+1;
        displayforteamFoul(foulA);
    }
    public void displayforteamFoul(int score)
    {
        TextView scoreview=(TextView) findViewById(R.id.foula_text_view);
        scoreview.setText(String.valueOf(score));
    }
    public void displayforteamA(int score)
    {
        TextView scoreview=(TextView) findViewById(R.id.detoit_text_view);
        scoreview.setText(String.valueOf(score));
    }


    public void Point_B_3(View view)
    {

        pointsB=pointsB+3;
        displayforteamB(pointsB);
    }
    public void Point_B_2(View view)
    {
        pointsB=pointsB+2;
        displayforteamB(pointsB);
    }
    public void Point_B_1(View view)
    {
        pointsB=pointsB+1;
        displayforteamB(pointsB);
    }
    public void Point_B_foul(View view)
    {
        foulB=foulB+1;
        displayforteamFoulB(foulB);
    }
    public void displayforteamFoulB(int score)
    {
        TextView scoreview=(TextView) findViewById(R.id.foulb_text_view);
        scoreview.setText(String.valueOf(score));
    }
    public void displayforteamB(int score)
    {
        TextView scoreview=(TextView) findViewById(R.id.bear_text_view);
        scoreview.setText(String.valueOf(score));
    }
    public void reset(View view)
    {
        displayforteamA(0);
        displayforteamB(0);
        displayforteamFoul(0);
        displayforteamFoulB(0);
        pointsA=0;
        pointsB=0;
        foulA=0;
        foulB=0;
    }

}
