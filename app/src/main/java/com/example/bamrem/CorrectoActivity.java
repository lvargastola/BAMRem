package com.example.bamrem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CorrectoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correcto);

    }

    public void toContinuar (View view){
        Intent Continuar = new Intent(CorrectoActivity.this, Game_2Activity.class);
        startActivity(Continuar);
    }

    public void toInicio (View view){
        Intent Inicio = new Intent(CorrectoActivity.this, SeleccionActivity.class);
        startActivity(Inicio);
    }
}
