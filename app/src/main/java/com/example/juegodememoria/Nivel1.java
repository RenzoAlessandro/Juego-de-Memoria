package com.example.juegodememoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Nivel1 extends AppCompatActivity {

    private TextView tvScore,tvNivel;
    private ImageButton imageButton1,imageButton2,imageButton3,imageButton4;
    private int Contador_Ver, score = 0;
    private int CoincidirImg1, CoincidirImg2, CoincidirImg3, CoincidirImg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1);

        tvNivel = (TextView)findViewById(R.id.textViewNivelN1);
        tvScore = (TextView)findViewById(R.id.textViewScoreN1);
        tvNivel.setText("1");
        imageButton1 = (ImageButton)findViewById(R.id.imageButtonN);
        imageButton2 = (ImageButton)findViewById(R.id.imageButtonN2);
        imageButton3 = (ImageButton)findViewById(R.id.imageButtonN3);
        imageButton4 = (ImageButton)findViewById(R.id.imageButtonN4);
    }

    public void ClickImg1(View view){
        Contador_Ver = Contador_Ver + 1;
        CoincidirImg1 = 1;
        if(Contador_Ver == 3){
            imageButton1.setImageResource(R.mipmap.imagen0);
            imageButton2.setImageResource(R.mipmap.imagen0);
            imageButton3.setImageResource(R.mipmap.imagen0);
            imageButton4.setImageResource(R.mipmap.imagen0);
            Contador_Ver = 0;
            CoincidirImg1 = 0;
            CoincidirImg2 = 0;
            CoincidirImg3 = 0;
            CoincidirImg4 = 0;
        }
        else if (Contador_Ver == 2){
            imageButton1.setImageResource(R.mipmap.imagen1);
            if(CoincidirImg1 == CoincidirImg3){
                score = score + 50;
                Toast.makeText(this,"Si coinciden",Toast.LENGTH_SHORT).show();
                tvScore.setText(Integer.toString(score));
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                if (score >= 100){
                    score = 100;
                    tvScore.setText(Integer.toString(score));
                    Toast.makeText(this,"Gano el primer Nivel",Toast.LENGTH_SHORT).show();
                    Intent siguiente = new Intent(this, Nivel2.class);
                    siguiente.putExtra("scoree", tvScore.getText().toString());
                    startActivity(siguiente);
                }
                tvScore.setText(Integer.toString(score));
            }
            else {
                score = score - 50;
                Toast.makeText(this,"No coinciden",Toast.LENGTH_SHORT).show();
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                if (score <= 0){
                    score = 0;
                }
                tvScore.setText(Integer.toString(score));
            }
        }
        else
            imageButton1.setImageResource(R.mipmap.imagen1);
    }
    public void ClickImg2(View view){
        Contador_Ver = Contador_Ver + 1;
        CoincidirImg2 = 2;
        if(Contador_Ver == 3){
            imageButton1.setImageResource(R.mipmap.imagen0);
            imageButton2.setImageResource(R.mipmap.imagen0);
            imageButton3.setImageResource(R.mipmap.imagen0);
            imageButton4.setImageResource(R.mipmap.imagen0);
            Contador_Ver = 0;
            CoincidirImg1 = 0;
            CoincidirImg2 = 0;
            CoincidirImg3 = 0;
            CoincidirImg4 = 0;
        }
        else if (Contador_Ver == 2){
            imageButton2.setImageResource(R.mipmap.imagen3);
            if(CoincidirImg2 == CoincidirImg4){
                score = score + 50;
                Toast.makeText(this,"Si coinciden",Toast.LENGTH_SHORT).show();
                tvScore.setText(Integer.toString(score));
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                if (score >= 100){
                    score = 100;
                    tvScore.setText(Integer.toString(score));
                    Toast.makeText(this,"Gano el primer Nivel",Toast.LENGTH_SHORT).show();
                    Intent siguiente = new Intent(this, Nivel2.class);
                    siguiente.putExtra("scoree", tvScore.getText().toString());
                    startActivity(siguiente);
                }
                tvScore.setText(Integer.toString(score));
            }
            else {
                score = score - 50;
                Toast.makeText(this,"No coinciden",Toast.LENGTH_SHORT).show();
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                if (score <= 0){
                    score = 0;
                }
                tvScore.setText(Integer.toString(score));
            }
        }
        else
            imageButton2.setImageResource(R.mipmap.imagen3);
    }
    public void ClickImg3(View view){
        Contador_Ver = Contador_Ver + 1;
        CoincidirImg3 = 1;
        if(Contador_Ver == 3){
            imageButton1.setImageResource(R.mipmap.imagen0);
            imageButton2.setImageResource(R.mipmap.imagen0);
            imageButton3.setImageResource(R.mipmap.imagen0);
            imageButton4.setImageResource(R.mipmap.imagen0);
            Contador_Ver = 0;
            CoincidirImg1 = 0;
            CoincidirImg2 = 0;
            CoincidirImg3 = 0;
            CoincidirImg4 = 0;
        }
        else if (Contador_Ver == 2){
            imageButton3.setImageResource(R.mipmap.imagen1);
            if(CoincidirImg3 == CoincidirImg1){
                score = score + 50;
                Toast.makeText(this,"Si coinciden",Toast.LENGTH_SHORT).show();
                tvScore.setText(Integer.toString(score));
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                if (score >= 100){
                    score = 100;
                    tvScore.setText(Integer.toString(score));
                    Toast.makeText(this,"Gano el primer Nivel",Toast.LENGTH_SHORT).show();
                    Intent siguiente = new Intent(this, Nivel2.class);
                    siguiente.putExtra("scoree", tvScore.getText().toString());
                    startActivity(siguiente);
                }
                tvScore.setText(Integer.toString(score));
            }
            else {
                score = score - 50;
                Toast.makeText(this,"No coinciden",Toast.LENGTH_SHORT).show();
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                if (score <= 0){
                    score = 0;
                }
                tvScore.setText(Integer.toString(score));
            }
        }
        else
            imageButton3.setImageResource(R.mipmap.imagen1);
    }
    public void ClickImg4(View view){
        Contador_Ver = Contador_Ver + 1;
        CoincidirImg4 = 2;
        if(Contador_Ver == 3){
            imageButton1.setImageResource(R.mipmap.imagen0);
            imageButton2.setImageResource(R.mipmap.imagen0);
            imageButton3.setImageResource(R.mipmap.imagen0);
            imageButton4.setImageResource(R.mipmap.imagen0);
            Contador_Ver = 0;
            CoincidirImg1 = 0;
            CoincidirImg2 = 0;
            CoincidirImg3 = 0;
            CoincidirImg4 = 0;
        }
        else if(Contador_Ver == 2){
            imageButton4.setImageResource(R.mipmap.imagen3);
            if(CoincidirImg4 == CoincidirImg2){
                score = score + 50;
                Toast.makeText(this,"Si coinciden",Toast.LENGTH_SHORT).show();
                tvScore.setText(Integer.toString(score));
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                if (score >= 100){
                    score = 100;
                    tvScore.setText(Integer.toString(score));
                    Toast.makeText(this,"Gano el primer Nivel",Toast.LENGTH_SHORT).show();
                    Intent siguiente = new Intent(this, Nivel2.class);
                    siguiente.putExtra("scoree", tvScore.getText().toString());
                    startActivity(siguiente);
                }
            }
            else {
                score = score - 50;
                Toast.makeText(this,"No coinciden",Toast.LENGTH_SHORT).show();
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                if (score <= 0){
                    score = 0;
                }
                tvScore.setText(Integer.toString(score));
            }
        }
        else
            imageButton4.setImageResource(R.mipmap.imagen3);
    }

    public void Siguiente(View view){
        Intent siguiente = new Intent(this, Nivel2.class);
        startActivity(siguiente);
    }

    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}