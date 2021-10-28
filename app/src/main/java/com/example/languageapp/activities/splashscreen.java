package com.example.languageapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import com.example.languageapp.R;
import com.example.languageapp.login.LoginActivity;

import java.util.Random;

public class splashscreen extends AppCompatActivity {

    //
    TextView txtSplashScreen, txtLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        //
        Random rnd = new Random();
        //
        txtLoading = findViewById(R.id.txtLoading);
        //

        new CountDownTimer(5000,1000) {
            String[] s = {"A", "B", "C", "D", "E", "F", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            String c = "#";

            @Override
            public void onTick(long l) {
                for (int k = 0; k < 6; k++) {
                    c += s[rnd.nextInt(s.length)];

                }
                txtLoading.setTextColor(Color.parseColor(c));
                c = "#";
            }

            @Override
            public void onFinish() {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
                 finishAffinity();
            }
        }.start();
    }
}
