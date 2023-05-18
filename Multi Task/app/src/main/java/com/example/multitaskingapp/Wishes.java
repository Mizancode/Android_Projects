package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Wishes extends AppCompatActivity {
     private TextView textView14;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishes);
        textView14=findViewById(R.id.textView14);
        Intent intent=getIntent();
        String S=intent.getStringExtra(Birthday_Wishes.EXTRA_NAME);
        textView14.setText("Best Wishes For The Upcoming Life "+S+"...!");
    }
}