package com.chaurasiya.thecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView counterText, welcomeText;
    Button button;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterText = findViewById(R.id.counterText);
        welcomeText = findViewById(R.id.welcomeText);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                    counterText.setText(""+increaseCounter());
            }
        });
    }
    public int increaseCounter(){
        return ++counter;
    }
}