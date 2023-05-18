package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Birthday_Wishes extends AppCompatActivity {
    public EditText editTextTextPersonName;
    public static final String EXTRA_NAME="com.example.multitaskingapp.EXTRA_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_wishes);
    }
    public void Wishe(View v3){
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        String S=editTextTextPersonName.getText().toString();
        Intent intent=new Intent(this,Wishes.class);
        intent.putExtra(EXTRA_NAME,S);
        startActivity(intent);
    }
}