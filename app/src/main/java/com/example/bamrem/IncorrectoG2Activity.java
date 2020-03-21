package com.example.bamrem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IncorrectoG2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrecto_g2);
    }
    public void toReintentar (View view){
        Intent Reintentar = new Intent(IncorrectoG2Activity.this, Game_2Activity.class);
        startActivity(Reintentar);
    }

    public void toInicio (View view){
        Intent Inicio = new Intent(IncorrectoG2Activity.this, SeleccionActivity.class);
        startActivity(Inicio);
    }
}
