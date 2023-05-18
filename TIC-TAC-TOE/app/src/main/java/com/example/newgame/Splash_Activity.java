package com.example.newgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Activity extends AppCompatActivity {
    TextView textView,textView2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        Animation move=AnimationUtils.loadAnimation(Splash_Activity.this,R.anim.splash_layout);
        textView.setAnimation(move);
        textView2.setAnimation(move);
        Intent intent=new Intent(Splash_Activity.this,MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        },2500);
    }
}