package com.example.asynctaskinicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultado = findViewById(R.id.txtRespuesta);
        String nombreUsuario = getIntent().getStringExtra("Usuario: ");
        resultado.setText("Bienvenido: "+nombreUsuario);


    }
}