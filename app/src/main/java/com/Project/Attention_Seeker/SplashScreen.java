package com.Project.Attention_Seeker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread splash = new Thread() {
            public void run() {
                try {
                    sleep(2 * 1000);
                    Intent intent = new Intent(getBaseContext(), Home.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        };
        splash.start();
    }
}