package com.example.bamrem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
    }
    public void toVideoRep (View view){
        Intent Reproduccion = new Intent(VideoActivity.this, VideoRepActivity.class);
        startActivity(Reproduccion);
    }

}
