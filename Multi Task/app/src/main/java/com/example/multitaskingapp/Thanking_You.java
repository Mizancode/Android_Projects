package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Thanking_You extends AppCompatActivity {
      private TextView textView15;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanking_you);
        textView15=findViewById(R.id.textView15);
        textView15.setText("Thanks For Using This APP...! See You Again...!");
    }
}