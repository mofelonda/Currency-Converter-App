package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertClick(View view) {
        EditText dollarField = findViewById(R.id.dollarField);
        String input = dollarField.getText().toString();

        goToActivity2(input);
    }

    public void goToActivity2(String in) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", in);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
