package com.example.chat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout lay1,lay2,lay3,lay4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lay1 = findViewById(R.id.lay1);
        lay2 = findViewById(R.id.lay2);
        lay3 = findViewById(R.id.lay3);
        lay4 = findViewById(R.id.lay4);

        lay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,main1.class);
                startActivity(intent);
            }
        });
        lay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,main2.class);
                startActivity(intent);
            }
        });
        lay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,main3.class);
                startActivity(intent);
            }
        });
        lay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,main4.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Settings:
                Intent intent = new Intent(MainActivity.this,settings.class);
                startActivity(intent);
                break;
            case R.id.Account:
                Intent intent1 = new Intent(MainActivity.this,account.class);
                startActivity(intent1);
                break;
            case R.id.Logout:
               SharedPreferences preferences = getSharedPreferences("signup",MODE_PRIVATE);
               SharedPreferences.Editor editor = preferences.edit();
               editor.putBoolean("flag",false);
               editor.apply();
                Intent intent2 = new Intent(MainActivity.this,signup.class);
                startActivity(intent2);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}