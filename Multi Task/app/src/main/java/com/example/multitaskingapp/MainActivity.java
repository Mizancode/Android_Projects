package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
      Button button;
     Button button2;
     Button button3;
     Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Table(View v1){
        button=findViewById(R.id.button);
        Intent i1=new Intent(this,Multi_Table.class);
        startActivity(i1);
    }
    public void Dollor(View v2){
        button2=findViewById(R.id.button2);
        Intent i2=new Intent(this,Converter.class);
        startActivity(i2);
    }
    public void Birthday(View v3){
        button3=findViewById(R.id.button3);
        Intent i3=new Intent(this,Birthday_Wishes.class);
        startActivity(i3);
    }
    public void Thanks(View v1){
        button4=findViewById(R.id.button4);
        Intent i4=new Intent(this,Thanking_You.class);
        startActivity(i4);
    }

}