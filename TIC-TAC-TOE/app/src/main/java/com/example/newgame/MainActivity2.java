package com.example.newgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView7=findViewById(R.id.imageView7);
        Intent intent=new Intent(MainActivity2.this,MainActivity.class);
        Animation move= AnimationUtils.loadAnimation(MainActivity2.this,R.anim.anim_layout);
        imageView7.startAnimation(move);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        },3000);
    }
}