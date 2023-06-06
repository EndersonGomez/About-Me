package com.example.sprint_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.sprint_final.databinding.ActivityContactBinding;

public class ContactActivity extends AppCompatActivity {

    //Creamos el atributo del tipo viewBiding
    private ActivityContactBinding Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Le damos el valor al atributo y enlazamos el diseño con el codigo.
        Binding = ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(Binding.getRoot());

        //Creamos el evento escuchador que nos llevara al perfil del linkedin al presionar.
        Binding.botonLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlLinkedin = "https://www.linkedin.com/in/enderson-gomez-b2a793153";

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlLinkedin));
                startActivity(intent);
            }
        });

        //Creamos el evento escuchador que nos llevara un chat con el numero asignado dentro de la aplicacion whatsapp.
        Binding.botonWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = "+56945768102";
                String mensaje = "Hola, me gustaria contactar contigo";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + numero + "&text=" + mensaje));
                startActivity(intent);

            }
        });
    }
}