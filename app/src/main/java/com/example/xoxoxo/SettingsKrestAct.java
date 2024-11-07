package com.example.xoxoxo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class SettingsKrestAct extends AppCompatActivity {

    ImageView backBtn;
    Button btnReset;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings_krest);

        sharedPreferences = this.getSharedPreferences("kristik", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        btnReset = findViewById(R.id.btnReset);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackMenu(view);
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putInt("pointsOfHuman", 0);
                editor.putInt("pointsOfPc", 0);
                editor.apply();
                Toast.makeText(SettingsKrestAct.this ,"Points are reseted", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onBackMenu(View view) {
        startActivity( new Intent(SettingsKrestAct.this, xoxo.class));
        finish();
    }
}
