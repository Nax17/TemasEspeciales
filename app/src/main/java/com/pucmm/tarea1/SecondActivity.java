package com.pucmm.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        TextView nombre = findViewById(R.id.textNombreCompleto1);
        nombre.setText(intent.getStringExtra("NAME"));
        TextView apellido = findViewById(R.id.textNombreCompleto2);
        apellido.setText(intent.getStringExtra("LASTNAME"));
        TextView genero = findViewById(R.id.textSoyGenero);
        genero.setText(intent.getStringExtra("GENDER"));
        TextView gusta = findViewById(R.id.textSioNo);
        gusta.setText(intent.getStringExtra("GUSTA"));
        TextView sgusta = findViewById(R.id.textMis);
        sgusta.setText(intent.getStringExtra("SGUSTA"));
        TextView java = findViewById(R.id.textJava);
        java.setText(intent.getStringExtra("Java"));
        TextView js = findViewById(R.id.textJS);
        js.setText(intent.getStringExtra("JS"));
        TextView c = findViewById(R.id.textC);
        c.setText(intent.getStringExtra("C"));
        TextView cs = findViewById(R.id.textCS);
        cs.setText(intent.getStringExtra("CS"));
        TextView go = findViewById(R.id.textGo);
        go.setText(intent.getStringExtra("GO"));
        TextView python = findViewById(R.id.textPython);
        python.setText(intent.getStringExtra("PYTHON"));
    }
}