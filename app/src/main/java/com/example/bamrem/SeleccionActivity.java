package com.example.bamrem;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SeleccionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);
    }

    public void toVideo (View view){
        Intent Video = new Intent(SeleccionActivity.this, VideoRepActivity.class);
        startActivity(Video);
    }

    public void toGame (View view){
        Intent Game = new Intent(SeleccionActivity.this, GameActivity.class);
        startActivity(Game);
    }
}
