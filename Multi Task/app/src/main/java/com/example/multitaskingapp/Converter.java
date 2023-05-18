package com.example.multitaskingapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Converter extends AppCompatActivity {
    public EditText editTextNumber2;
     public TextView textView2;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        textView2=findViewById(R.id.textView2);
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(v -> {
            String S=editTextNumber2.getText().toString();
            int d=Integer.parseInt(S);
            double result=d*81.3;
            textView2.setText("Your Dollar($) "+d+" in INR is "+result);
        });
    }
}