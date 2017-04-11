package com.example.keshav.pokar;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ShowChipManupilationActivity extends AppCompatActivity {
    private static final int red = 5;
    private static final int blue = 25;
    private static final int green = 50;
    private static final int black = 100;
    private static int amount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_chip_manupilation);
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        amount = sharedPref.getInt(getString(R.string.amount), 0);
        Toast.makeText(this, String.valueOf(amount), Toast.LENGTH_SHORT).show();
    }

    private void chipCalculation(int amount) {

        int chipRed, chipBlue, chipGreen, chipBlack;
        chipBlack = (amount / black);
        amount = amount % black;
        chipGreen = (amount / green);
        amount = amount % green;
        chipBlue = (amount / blue);
        amount = amount % blue;
        chipRed = (amount / red);
    }

    private int moneyCalculation(int chipRed, int chipBlue, int chipGreen, int chipBlack) {
        int amount = 0;
        amount = (chipRed * red) + (chipBlack * black) + (chipGreen * green) + (chipBlue * blue);
        return amount;
    }
}

