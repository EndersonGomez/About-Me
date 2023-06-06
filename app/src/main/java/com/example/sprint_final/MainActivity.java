package com.example.sprint_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sprint_final.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Creamos el atributo del tipo viewBiding.
    private ActivityMainBinding Biding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Le damos el valor al biding y vinculamos el diseno y nuestro codigo.
        Biding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(Biding.getRoot());

        Biding.btonFlotante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(intent);
            }
        });
    }
}