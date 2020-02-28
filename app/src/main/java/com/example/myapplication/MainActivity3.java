package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

private int teamAScore;
private int teamBScore;
private TextView teamAtextViewScore;
private TextView teamBtextViewScore;
    private TextView Team_A_Score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        teamAtextViewScore=findViewById(R.id.Team_A_Score);
        teamBtextViewScore=findViewById(R.id.Team_B_Score);


    }


    public void Button1(View view) {


    }
}
