package com.example.bamrem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Incorrecto_VidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrecto__vid);
    }

    public void toReintentar (View view){
        Intent Reintentar = new Intent(Incorrecto_VidActivity.this, VideoRepActivity.class);
        startActivity(Reintentar);
    }

    public void toInicio (View view){
        Intent Inicio = new Intent(Incorrecto_VidActivity.this, SeleccionActivity.class);
        startActivity(Inicio);
    }
}
