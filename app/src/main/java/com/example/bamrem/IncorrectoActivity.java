package com.example.bamrem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IncorrectoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrecto);
    }

    public void toReintentar (View view){
        Intent Reintentar = new Intent(IncorrectoActivity.this, GameActivity.class);
        startActivity(Reintentar);
    }

    public void toInicio (View view){
        Intent Inicio = new Intent(IncorrectoActivity.this, SeleccionActivity.class);
        startActivity(Inicio);
    }
}

