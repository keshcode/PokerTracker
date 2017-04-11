package com.example.keshav.pokar;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstName, etLastName, etAmount;
    private Button btnStart;
    private String mFullName;
    private int mAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getText();
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(getString(R.string.full_name), mFullName);
                editor.putInt(getString(R.string.amount), mAmount);
                editor.apply();
            }
        });

    }

    private void init() {
        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        etAmount = (EditText) findViewById(R.id.etAmount);
        btnStart = (Button) findViewById(R.id.btnStart);
    }

    private void getText() {
        mFullName = etFirstName.getText().toString() + etLastName.getText().toString();
        mAmount = Integer.parseInt(etAmount.getText().toString());
    }
}
