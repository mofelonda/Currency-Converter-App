package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textFromMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textFromMain = findViewById(R.id.textFromMain);
        Intent intent = getIntent();
        String dollars = intent.getStringExtra("message");
        double number = Double.parseDouble(dollars);
        double pounds = number * 0.77;
        textFromMain.setText("£" + pounds);
    }
}