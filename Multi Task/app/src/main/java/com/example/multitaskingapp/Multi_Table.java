package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Multi_Table extends AppCompatActivity {
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    private TextView textView11;
    private TextView textView12;
    private TextView textView13;
    private TextView textView17;
    private TextView textView18;
    private TextView textView19;
    private TextView textView20;
    private TextView textView21;
    private TextView textView22;
    private TextView textView23;
    private TextView textView25;
    private TextView textView26;
    private TextView textView27;
    private EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_table);
    }
    public void Calculate(View view){
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);
        textView12=findViewById(R.id.textView12);
        textView13=findViewById(R.id.textView13);
        textView17=findViewById(R.id.textView17);
        textView18=findViewById(R.id.textView18);
        textView19=findViewById(R.id.textView19);
        textView20=findViewById(R.id.textView20);
        textView21=findViewById(R.id.textView21);
        textView22=findViewById(R.id.textView22);
        textView23=findViewById(R.id.textView23);
        textView25=findViewById(R.id.textView25);
        textView26=findViewById(R.id.textView26);
        textView27=findViewById(R.id.textView27);
        editTextNumber=findViewById(R.id.editTextNumber);
        String S=editTextNumber.getText().toString();
        textView3.setText("The Multiplication of "+S+"...!");
        int z=Integer.parseInt(S);
        textView4.setText(z+" X 1"+" = "+z*1);
        textView5.setText(z+" X 2"+" = "+z*2);
        textView6.setText(z+" X 3"+" = "+z*3);
        textView7.setText(z+" X 4"+" = "+z*4);
        textView8.setText(z+" X 5"+" = "+z*5);
        textView9.setText(z+" X 6"+" = "+z*6);
        textView10.setText(z+" X 7"+" = "+z*7);
        textView11.setText(z+" X 8"+" = "+z*8);
        textView12.setText(z+" X 9"+" = "+z*9);
        textView13.setText(z+" X 10"+" = "+z*10);
        textView17.setText(z+" X 11"+" = "+z*11);
        textView18.setText(z+" X 12"+" = "+z*12);
        textView19.setText(z+" X 13"+" = "+z*13);
        textView20.setText(z+" X 14"+" = "+z*14);
        textView21.setText(z+" X 15"+" = "+z*15);
        textView22.setText(z+" X 16"+" = "+z*16);
        textView23.setText(z+" X 17"+" = "+z*17);
        textView25.setText(z+" X 18"+" = "+z*18);
        textView26.setText(z+" X 19"+" = "+z*19);
        textView27.setText(z+" X 20"+" = "+z*20);
    }
}