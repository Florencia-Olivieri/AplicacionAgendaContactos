package com.florenciaolivieri.aplicacionagendacontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfirmarDatos extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

    }

    public void volverEditarDatos(View v) {
        Intent intent = new Intent(ConfirmarDatos.this, MainActivity.class);
        startActivity(intent);
    }
}