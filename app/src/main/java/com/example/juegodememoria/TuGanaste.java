package com.example.juegodememoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TuGanaste extends AppCompatActivity {

    private TextView tvTuScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu_ganaste);
        String scoreFinal = getIntent().getStringExtra("scorefinal");
        tvTuScore = (TextView)findViewById(R.id.textViewTuScore);
        tvTuScore.setText("Tu score total es: " + scoreFinal);
    }
    public void IrMenu(View view){
        Intent IrMenu = new Intent(this, MainActivity.class);
        startActivity(IrMenu);
    }
}