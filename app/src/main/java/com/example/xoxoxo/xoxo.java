package com.example.xoxoxo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class xoxo extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String krist, nil;
    TextView textView, humanPoints, PCPoints;
    int pointsOfHuman, pointsOfPc;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xoxo);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);

        humanPoints = findViewById(R.id.humanPoints);
        PCPoints = findViewById(R.id.PCPoints);

        sharedPreferences = this.getSharedPreferences("kristik", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        pointsOfHuman = sharedPreferences.getInt("pointsOfHuman", 0);
        humanPoints.setText(""+pointsOfHuman);

        //pointsOfPc = sharedPreferences.getInt("pointsOfPc", 0);
        //PCPoints.setText(""+PCPoints);

        krist = "X";
        nil = "0";
        textView.setText("");
    }

    public void clcBtn1(View view) {
        if (button1.getText() == "" && textView.getText() == ""){
            button1.setText(krist);
            isPlayerWinner();
            if (textView.getText() == "") {
                rofl_PC();
            }
        }
    }

    public void clcBtn2(View view) {
        if (button2.getText() == "" && textView.getText() == ""){
            button2.setText(krist);
            isPlayerWinner();
            if (textView.getText() == "") {
                rofl_PC();
            }
        }
    }
    public void clcBtn3(View view) {
        if (button3.getText() == "" && textView.getText() == ""){
            button3.setText(krist);
            isPlayerWinner();
            if (textView.getText() == "") {
                rofl_PC();
            }
        }
    }
    public void clcBtn4(View view) {
        if (button4.getText() == "" && textView.getText() == ""){
            button4.setText(krist);
            isPlayerWinner();
            if (textView.getText() == "") {
                rofl_PC();
            }
        }
    }
    public void clcBtn5(View view) {
        if (button5.getText() == "" && textView.getText() == ""){
            button5.setText(krist);
            isPlayerWinner();
            if (textView.getText() == "") {
                rofl_PC();
            }
        }
    }
    public void clcBtn6(View view) {
        if (button6.getText() == "" && textView.getText() == ""){
            button6.setText(krist);
            isPlayerWinner();
            if (textView.getText() == "") {
                rofl_PC();
            }
        }
    }
    public void clcBtn7(View view) {
        if (button7.getText() == "" && textView.getText() == ""){
            button7.setText(krist);
            isPlayerWinner();
            if (textView.getText() == "") {
                rofl_PC();
            }
        }
    }
    public void clcBtn8(View view) {
        if (button8.getText() == "" && textView.getText() == ""){
            button8.setText(krist);
            isPlayerWinner();
            if (textView.getText() == "") {
                rofl_PC();
            }
        }
    }
    public void clcBtn9(View view) {
        if (button9.getText() == "" && textView.getText() == ""){
            button9.setText(krist);
            isPlayerWinner();
            if (textView.getText() == "") {
                rofl_PC();
            }
        }
    }
    public void isPlayerWinner() {
        if (button1.getText()==krist && button2.getText()==krist && button3.getText()==krist) {
            button1.setBackgroundColor(Color.GREEN);
            button2.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_msg);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        } else
        if (button4.getText()==krist && button5.getText()==krist && button6.getText()==krist) {
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_msg);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else
        if (button7.getText()==krist && button8.getText()==krist && button9.getText()==krist) {
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_msg);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else

        if (button1.getText()==krist && button4.getText()==krist && button7.getText()==krist) {
            textView.setText(R.string.winner_msg);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            button1.setBackgroundColor(Color.GREEN);
            button4.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else
        if (button2.getText()==krist && button5.getText()==krist && button8.getText()==krist) {
            button2.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_msg);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else
        if (button3.getText()==krist && button6.getText()==krist && button9.getText()==krist) {
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_msg);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else

        if (button1.getText()==krist && button5.getText()==krist && button9.getText()==krist) {
            button1.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_msg);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else
        if (button3.getText()==krist && button5.getText()==krist && button7.getText()==krist) {
            button3.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_msg);
            pointsOfHuman++;
            humanPoints.setText(""+pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
        }else if (button1.getText()!="" && button2.getText()!="" && button3.getText()!="" &&
                button4.getText()!="" && button5.getText()!="" && button6.getText()!="" &&
                button7.getText()!="" && button8.getText()!="" && button9.getText()!="" ) {
            textView.setText(R.string.draw_msg);
        }
    }

    public void isPCWinner() {
        if (button1.getText()==nil && button2.getText()==nil && button3.getText()==nil) {
            textView.setText(R.string.pc_winner_msg);
            pointsOfPc++;
            PCPoints.setText(""+pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else
        if (button4.getText()==nil && button5.getText()==nil && button6.getText()==nil) {
            textView.setText(R.string.pc_winner_msg);
            pointsOfPc++;
            PCPoints.setText(""+pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else
        if (button7.getText()==nil && button8.getText()==nil && button9.getText()==nil) {
            textView.setText(R.string.pc_winner_msg);
            pointsOfPc++;
            PCPoints.setText(""+pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else

        if (button1.getText()==nil && button4.getText()==nil && button7.getText()==nil) {
            textView.setText(R.string.pc_winner_msg);
            pointsOfPc++;
            PCPoints.setText(""+pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else
        if (button2.getText()==nil && button5.getText()==nil && button8.getText()==nil) {
            textView.setText(R.string.pc_winner_msg);
            pointsOfPc++;
            PCPoints.setText(""+pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else
        if (button3.getText()==nil && button6.getText()==nil && button9.getText()==nil) {
            textView.setText(R.string.pc_winner_msg);
            pointsOfPc++;
            PCPoints.setText(""+pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else

        if (button1.getText()==nil && button5.getText()==nil && button9.getText()==nil) {
            textView.setText(R.string.pc_winner_msg);
            pointsOfPc++;
            PCPoints.setText(""+pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else
        if (button3.getText()==nil && button5.getText()==nil && button7.getText()==nil) {
            textView.setText(R.string.pc_winner_msg);
            pointsOfPc++;
            PCPoints.setText(""+pointsOfPc);
        }
    }

    private void rofl_PC() {
        Random random = new Random();
        int buttonPcClick = 1 + random.nextInt(9);
        Log.i("rofl_PC", "buttonPcClick - " + buttonPcClick);
        switch (buttonPcClick){
            case (1): if (button1.getText() == ""){
                button1.setText(nil); isPCWinner();
            } else {rofl_PC();}
                break;
            case (2): if (button2.getText() == ""){
                button2.setText(nil);isPCWinner();
            } else {rofl_PC();}
                break;
            case (3): if (button3.getText() == ""){
                button3.setText(nil);isPCWinner();
            } else {rofl_PC();}
                break;
            case (4): if (button4.getText() == ""){
                button4.setText(nil);isPCWinner();
            } else {rofl_PC();}
                break;
            case (5): if (button5.getText() == ""){
                button6.setText(nil);isPCWinner();
            } else {rofl_PC();}
                break;
            case (6): if (button6.getText() == ""){
                button6.setText(nil);isPCWinner();
            } else {rofl_PC();}
                break;
            case (7): if (button7.getText() == ""){
                button7.setText(nil);isPCWinner();
            } else {rofl_PC();}
                break;
            case (8): if (button8.getText() == ""){
                button8.setText(nil);isPCWinner();
            } else {rofl_PC();}
                break;
            case (9): if (button9.getText() == ""){
                button9.setText(nil);isPCWinner();
            } else {rofl_PC();}
                break;
        }
    }

    public void clickRestart(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");

        textView.setText("");

        button1.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple));
        button2.setBackgroundColor(button2.getContext().getResources().getColor(R.color.purple));
        button3.setBackgroundColor(button3.getContext().getResources().getColor(R.color.purple));
        button4.setBackgroundColor(button4.getContext().getResources().getColor(R.color.purple));
        button5.setBackgroundColor(button5.getContext().getResources().getColor(R.color.purple));
        button6.setBackgroundColor(button6.getContext().getResources().getColor(R.color.purple));
        button7.setBackgroundColor(button7.getContext().getResources().getColor(R.color.purple));
        button8.setBackgroundColor(button8.getContext().getResources().getColor(R.color.purple));
        button9.setBackgroundColor(button9.getContext().getResources().getColor(R.color.purple));
    }


    public void onBackMenu(View view) {
        startActivity( new Intent(xoxo.this, MainActivity.class));
        finish();
    }

    public void onSettingsClick(View view) {
        startActivity(new Intent(xoxo.this, SettingsKrestAct.class));
        finish();
    }

}