package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                SharedPreferences preferences = getSharedPreferences("signup",MODE_PRIVATE);
                Boolean check = preferences.getBoolean("flag",false);
                Intent intent;
                if(check){//successfull login so show main screen
                    intent = new Intent(splash.this,MainActivity.class);
                }else{//if not login show signup page
                    intent = new Intent(splash.this,signup.class);
                }
                startActivity(intent);
            }
        },4000);
    }
}