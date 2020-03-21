package com.example.bamrem;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoRepActivity extends AppCompatActivity {
    VideoView videoView; //Inicializa la variable
    CheckBox Op1, Op2, Op3, Op4; //Define las variables de selección de checkbox
    int Puntos1,Puntos2,Puntos3,Puntos4,PuntosAc;
    int PuntosTot=0; //Inicializa la variable de puntos
    int PuntosReq=10; //Define el valor de puntos necesarios para el ejercicio

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_rep);

        /*Se enlazan las variables definidas con el valor de cada checkbox en pantalla*/
        Op1=findViewById(R.id.checkBox_Op1);
        Op2=findViewById(R.id.checkBox_Op2);
        Op3=findViewById(R.id.checkBox_Op3);
        Op4=findViewById(R.id.checkBox_Op4);

        videoView = (VideoView) findViewById(R.id.videoRep); //Se asigna la variable al objeto
        //videoView.setVideoURI(Uri.parse("android.resources//" + getPackageName() + "/" +R.raw.videomastermensaje));
        //MediaController mediaController = new MediaController(this);//Se crea el media Controller
        //mediaController.setAnchorView(videoView);

        //Uri uri = Uri.parse("C:\\Users\\Luis Vargas Tola\\Documents\\Master Creación y Gestión de Empresas\\Gestión de Proyectos\\VideoMasterMensaje");
        //Uri uri = Uri.parse("https://techslides.com/demos/samples/sample.mp4"); //Se genera el link al contenido a reproducir
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.videomastermensajeand);
        videoView.setVideoURI(uri);
        //videoView.setMediaController(mediaController);
        //videoView.requestFocus();
        videoView.start();
    }

    public void clickValidar(View view){

        if (Op1.isChecked()==true){
            Puntos1=-5;
        }
        if (Op2.isChecked()==true){
            Puntos2=5;
        }
        if (Op3.isChecked()==true){
            Puntos3=5;
        }
        if (Op4.isChecked()==true){
            Puntos4=-5;
        }

        PuntosTot=Puntos1+Puntos2+Puntos3+Puntos4;

        if (PuntosTot==PuntosReq){
            PuntosAc=PuntosAc+PuntosTot;
            Intent Correcto = new Intent(VideoRepActivity.this, Correcto_VidActivity.class); //Envío a activodad Correcto
            startActivity(Correcto);
        }
        else{
            Intent Incorrecto = new Intent(VideoRepActivity.this, Incorrecto_VidActivity.class); //Envío a activodad Correcto
            startActivity(Incorrecto);
        }

    }
    public void BotonRetornar (View view){
        Intent Retornar = new Intent(VideoRepActivity.this, SeleccionActivity.class);
        startActivity(Retornar);
    }

}
