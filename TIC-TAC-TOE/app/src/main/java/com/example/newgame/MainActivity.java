package com.example.newgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int Change=0;
    int Count=0;
    String B1,B2,B3,B4,B5,B6,B7,B8,B9;
 Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findID();
    }
    public void findID(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
    }
    public void Click(View view){
         Count++;
         Button btn=(Button)view;
         if(btn.getText().toString().equals("")) {
             if (Change == 0) {
                 btn.setText("X");
                 Change = 1;
             } else {
                 btn.setText("O");
                 Change = 0;
             }
             if (Count > 4) {
                 B1 = btn1.getText().toString();
                 B2 = btn2.getText().toString();
                 B3 = btn3.getText().toString();
                 B4 = btn4.getText().toString();
                 B5 = btn5.getText().toString();
                 B6 = btn6.getText().toString();
                 B7 = btn7.getText().toString();
                 B8 = btn8.getText().toString();
                 B9 = btn9.getText().toString();
                 if (B1.equals(B2) && B2.equals(B3) && !B1.equals("")) {
                     if (B1.equals("X")) {
                         Toast.makeText(this, "X is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent=new Intent(this,MainActivity2.class);
                         Animation move= AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.slide_in_left);
                         btn1.setAnimation(move);
                         btn2.setAnimation(move);
                         btn3.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent);
                             }
                         },700);

                     } else {
                         Toast.makeText(this, "O is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent1=new Intent(this,MainActivity3.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.slide_in_left);
                         btn1.setAnimation(move);
                         btn2.setAnimation(move);
                         btn3.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent1);
                             }
                         },700);

                     }
                 } else if (B4.equals(B5) && B5.equals(B6) && !B4.equals("")) {
                     if (B4.equals("X")) {
                         Toast.makeText(this, "X is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent=new Intent(this,MainActivity2.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.slide_in_left);
                         btn4.setAnimation(move);
                         btn5.setAnimation(move);
                         btn6.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent);
                             }
                         },700);

                     } else {
                         Toast.makeText(this, "O is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent1=new Intent(this,MainActivity3.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.slide_in_left);
                         btn4.setAnimation(move);
                         btn5.setAnimation(move);
                         btn6.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent1);
                             }
                         },700);

                     }
                 } else if (B7.equals(B8) && B8.equals(B9) && !B7.equals("")) {
                     if (B7.equals("X")) {
                         Toast.makeText(this, "X is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent=new Intent(this,MainActivity2.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.slide_in_left);
                         btn7.setAnimation(move);
                         btn8.setAnimation(move);
                         btn9.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent);
                             }
                         },700);

                     } else {
                         Toast.makeText(this, "O is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent1=new Intent(this,MainActivity3.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.slide_in_left);
                         btn7.setAnimation(move);
                         btn8.setAnimation(move);
                         btn9.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent1);
                             }
                         },700);
                     }
                 } else if (B1.equals(B4) && B4.equals(B7) && !B1.equals("")) {
                     if (B1.equals("X")) {
                         Toast.makeText(this, "X is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent=new Intent(this,MainActivity2.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in);
                         btn1.setAnimation(move);
                         btn4.setAnimation(move);
                         btn7.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent);
                             }
                         },700);
                     } else {
                         Toast.makeText(this, "O is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent1=new Intent(this,MainActivity3.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in);
                         btn1.setAnimation(move);
                         btn4.setAnimation(move);
                         btn7.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent1);
                             }
                         },700);
                     }
                 } else if (B2.equals(B5) && B5.equals(B8) && !B2.equals("")) {
                     if (B2.equals("X")) {
                         Toast.makeText(this, "X is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent=new Intent(this,MainActivity2.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in);
                         btn2.setAnimation(move);
                         btn5.setAnimation(move);
                         btn8.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent);
                             }
                         },700);
                     } else {
                         Toast.makeText(this, "O is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent1=new Intent(this,MainActivity3.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in);
                         btn2.setAnimation(move);
                         btn5.setAnimation(move);
                         btn8.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent1);
                             }
                         },700);
                     }
                 } else if (B3.equals(B6) && B6.equals(B9) && !B3.equals("")) {
                     if (B3.equals("X")) {
                         Toast.makeText(this, "X is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent=new Intent(this,MainActivity2.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in);
                         btn3.setAnimation(move);
                         btn6.setAnimation(move);
                         btn9.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent);
                             }
                         },700);
                     } else {
                         Toast.makeText(this, "O is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent1=new Intent(this,MainActivity3.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in);
                         btn3.setAnimation(move);
                         btn6.setAnimation(move);
                         btn9.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent1);
                             }
                         },700);
                     }
                 } else if (B1.equals(B5) && B5.equals(B9) && !B1.equals("")) {
                     if (B1.equals("X")) {
                         Toast.makeText(this, "X is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent=new Intent(this,MainActivity2.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_out);
                         btn1.setAnimation(move);
                         btn5.setAnimation(move);
                         btn9.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent);
                             }
                         },700);
                     } else {
                         Toast.makeText(this, "O is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent1=new Intent(this,MainActivity3.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_out);
                         btn1.setAnimation(move);
                         btn5.setAnimation(move);
                         btn9.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent1);
                             }
                         },700);
                     }
                 } else if (B3.equals(B5) && B5.equals(B7) && !B3.equals("")) {
                     if (B3.equals("X")) {
                         Toast.makeText(this, "X is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent=new Intent(this,MainActivity2.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_out);
                         btn3.setAnimation(move);
                         btn5.setAnimation(move);
                         btn7.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent);
                             }
                         },700);
                     } else {
                         Toast.makeText(this, "O is Winner...", Toast.LENGTH_SHORT).show();
                         Intent intent1=new Intent(this,MainActivity3.class);
                         Animation move=AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_out);
                         btn3.setAnimation(move);
                         btn5.setAnimation(move);
                         btn7.setAnimation(move);
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 startActivity(intent1);
                             }
                         },700);
                     }
                 }else if(Count==9){
                     Toast.makeText(this, "Match Draw... Please Restart it...", Toast.LENGTH_SHORT).show();
                 }
             }
         }
    }
    public void Restart(View view){
        Change=0;
        Count=0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }
}