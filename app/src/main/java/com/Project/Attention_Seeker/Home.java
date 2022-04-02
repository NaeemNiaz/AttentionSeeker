package com.Project.Attention_Seeker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
            }

    public void VideoFaceDetectionActivity(View view) {
        startActivity(new Intent(getApplicationContext(), VideoFaceDetectionActivity.class));
    }

    public void RegisterActivity(View view) {
        startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
    }

}