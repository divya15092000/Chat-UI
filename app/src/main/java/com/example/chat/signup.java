package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
        EditText username,password;
        Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(username.getText().toString().isEmpty() && password.getText().toString().isEmpty()) {
                        Toast.makeText(signup.this, "Enter the username", Toast.LENGTH_SHORT).show();
                    }else{
                        SharedPreferences preferences = getSharedPreferences("signup",MODE_PRIVATE);
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.putBoolean("flag",true);
                        editor.apply();

                        Intent intent = new Intent(signup.this,MainActivity.class);
                        startActivity(intent);
                    }

            }
        });
    }
}