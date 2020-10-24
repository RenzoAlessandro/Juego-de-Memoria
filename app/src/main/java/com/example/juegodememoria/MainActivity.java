package com.example.juegodememoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Jugar(View view){
        Intent jugar = new Intent(this, Nivel1.class);
        startActivity(jugar);
    }
    public void Salir(View view){
        finish();
        System.exit(0);
    }
}