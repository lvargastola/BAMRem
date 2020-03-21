package com.example.bamrem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CorrectoG2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto_g2);
    }

    public void toContinuar (View view){
        Intent Continuar = new Intent(CorrectoG2Activity.this, SeleccionActivity.class);
        startActivity(Continuar);
    }

    public void toInicio (View view){
        Intent Inicio = new Intent(CorrectoG2Activity.this, SeleccionActivity.class);
        startActivity(Inicio);
    }
}
