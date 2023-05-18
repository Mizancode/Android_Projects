package com.example.quizeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private TextView textView2;
        private Button button;
        private Button button2;
        private String S[]={"1.Java is developed in 1995?","2.Java is hybrid language?","3.Java is spoken language?","4.Java is Invented by Dennis Ritchie?",
        "5.Java has a abstract class?","6.Java is a platform Independent Language?"};
        private boolean b[]={true,true,false,false,true,true};
         int index=0;
        private int Score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2=findViewById(R.id.textView2);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        textView2.setText(S[index]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=S.length-1){
                    if(b[index]==true){
                       Score++;
                    }
                    index++;
                    if(index<=S.length-1){
                        textView2.setText(S[index]);
                    }else{
                        Toast.makeText(MainActivity.this, "Your Score is "+Score+"/"+S.length, Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "If You Want To Play Again Restart the App...!", Toast.LENGTH_SHORT).show();
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=S.length-1){
                    if(b[index]==false){
                        Score++;
                    }
                    index++;
                    if(index<=S.length-1){
                        textView2.setText(S[index]);
                    }else{
                        Toast.makeText(MainActivity.this, "Your Score is "+Score+"/"+S.length, Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "If You Want To Play Again Restart the App...!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}