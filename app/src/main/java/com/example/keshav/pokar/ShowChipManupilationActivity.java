package com.example.keshav.pokar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ShowChipManupilationActivity extends AppCompatActivity {
    private static final int red = 5;
    private static final int blue =25;
    private static final int green =50;
    private static final int black = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_chip_manupilation);

    }

    private void chipCalculation(int amount){

        int chipRed,chipBlue,chipGreen,chipBlack;
        chipBlack=(amount/black);
        amount = amount%black;
        chipGreen=(amount/green);
        amount = amount%green;
        chipBlue = (amount/blue);
        amount = amount%blue;
        chipRed = (amount/red);
    }

    private int moneyCalculation(int chipRed,int chipBlue,int chipGreen,int chipBlack){
        int amount=0;
        amount = (chipRed*red)+(chipBlack*black)+(chipGreen*green)+(chipBlue*blue);
        return amount;
    }
}

