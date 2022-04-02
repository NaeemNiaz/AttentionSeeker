package com.Project.Attention_Seeker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeAfterLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_after_login);
    }

    public void VideoFaceDetectionActivity(View view) {
        startActivity(new Intent(getApplicationContext(), VideoFaceDetectionActivity.class));
    }


    public void Home(View view) {
        startActivity(new Intent(getApplicationContext(), Home.class));
    }
}