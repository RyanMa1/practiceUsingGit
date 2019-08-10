package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int Bscore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Bpoints3(View view){
        Bscore = Bscore + 3;
        displayForTeamB(Bscore);
    }
    public void Bpoints2(View view){
        Bscore = Bscore +2;
        displayForTeamB(Bscore);
    }
    public void Bfreethrow(View view){
        Bscore = Bscore + 1;
        displayForTeamB(Bscore);
    }
    public void points3(View view){
        score = score + 3;
        displayForTeamA(score);
    }
    public void points2(View view){
        score = score +2;
        displayForTeamA(score);
    }
    public void freethrow(View view){
        score = score + 1;
        displayForTeamA(score);
    }
    public void reset(View v){
        score = 0;
        Bscore = 0;
        displayForTeamA(score);
        displayForTeamB(Bscore);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }
}
