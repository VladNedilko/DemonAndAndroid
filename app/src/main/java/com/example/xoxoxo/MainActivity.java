package com.example.xoxoxo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    ImageView imageGame_01, imageGame_02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageGame_01 = findViewById(R.id.icon_game_01);
        imageGame_02 = findViewById(R.id.icon_game_02);
        }

    public void startGame_01(View view) {
        Intent intent = new Intent(MainActivity.this, xoxo.class);
        startActivity(intent);
        finish();
    }
}