package com.example.bamrem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Game_2Activity extends AppCompatActivity {
    EditText textWord; //Declara la variable de texto que se ingresa
    TextView txtResultado; //Declara el cuadro de texto de la respuesta
    int PuntosAc; //Variable de acumulación de puntos global
    int PuntosTot=0; //Variable de acumulación de puntos del juego

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_2);

        textWord = findViewById(R.id.txtWord); //Toma los datos del id de plaintext
        txtResultado = findViewById(R.id.txtResultado);// Declara el objeto donde se mostrará el resultado
    }


    public void BotonResponder(View view){
        String Respuesta = textWord.getText().toString();   //Convierte a string lo ingresado por el usuario
        if(textWord.length()==0) {                          //Valida que el campo no esté vacío
            Toast.makeText(this, "Debe ingresar una respuesta", Toast.LENGTH_SHORT).show(); //Solicita llenar el campo de texto
        }else{
            Toast.makeText(this, "Tu Respuesta fue: " + Respuesta, Toast.LENGTH_SHORT).show(); //Indica la respuesta ingresada
            switch (Respuesta){
                case "nudo":
                    //txtResultado.setText("Respuesta Correcta"); //Se modifica por pantalla correcta
                    try {
                        //set time in mili
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    PuntosAc=PuntosAc+PuntosTot;
                    Intent Correcto = new Intent(Game_2Activity.this, CorrectoG2Activity.class); //Envío a activodad Correcto
                    startActivity(Correcto);

                    break;

                case "NUDO":
                    //txtResultado.setText("Respuesta Correcta"); //Se modifica por pantalla Correcto
                    try {
                        //set time in mili
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    PuntosAc=PuntosAc+PuntosTot;
                    Intent Correcto2 = new Intent(Game_2Activity.this, CorrectoG2Activity.class); //Envío a activodad Correcto
                    startActivity(Correcto2);
                    break;

                default:
                    //txtResultado.setText("Inténtalo Nuevamente"); //Se modifica por pantalla Incorrecto
                    Intent Inorrecto = new Intent(Game_2Activity.this, IncorrectoG2Activity.class); //Envío a actividad Inorrecto
                    startActivity(Inorrecto);
                    break;
            }
        }
    }

    public void BotonRetornar (View view){
        Intent Anterior = new Intent(Game_2Activity.this, GameActivity.class);
        startActivity(Anterior);
    }
}
