package com.example.juegodememoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Nivel2 extends AppCompatActivity {

    private TextView tvScore, tvNivel;
    private ImageButton imageButton1,imageButton2,imageButton3,imageButton4, imageButton5,imageButton6;
    private int Contador_Ver, score = 0;
    private int CoincidirImg1, CoincidirImg2, CoincidirImg3, CoincidirImg4, CoincidirImg5, CoincidirImg6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel2);
        String scoreAnterior = getIntent().getStringExtra("scoree");
        tvNivel = (TextView)findViewById(R.id.textViewNivelN2);
        tvScore = (TextView)findViewById(R.id.textViewScoreN2);
        tvNivel.setText("2");
        tvScore.setText(scoreAnterior);
        score = Integer.parseInt(scoreAnterior);
        imageButton1 = (ImageButton)findViewById(R.id.imageButtonNN1);
        imageButton2 = (ImageButton)findViewById(R.id.imageButtonNN2);
        imageButton3 = (ImageButton)findViewById(R.id.imageButtonNN3);
        imageButton4 = (ImageButton)findViewById(R.id.imageButtonNN4);
        imageButton5 = (ImageButton)findViewById(R.id.imageButtonNN5);
        imageButton6 = (ImageButton)findViewById(R.id.imageButtonNN6);
    }
    public void ClickImg11(View view){
        Contador_Ver = Contador_Ver + 1;
        CoincidirImg1 = 1;
        if(Contador_Ver == 3){
            imageButton1.setImageResource(R.mipmap.imagen0);
            imageButton2.setImageResource(R.mipmap.imagen0);
            imageButton3.setImageResource(R.mipmap.imagen0);
            imageButton4.setImageResource(R.mipmap.imagen0);
            imageButton5.setImageResource(R.mipmap.imagen0);
            imageButton6.setImageResource(R.mipmap.imagen0);
            Contador_Ver = 0;
            CoincidirImg1 = 0;
            CoincidirImg2 = 0;
            CoincidirImg3 = 0;
            CoincidirImg4 = 0;
            CoincidirImg5 = 0;
            CoincidirImg6 = 0;
        }
        else if (Contador_Ver == 2){
            imageButton1.setImageResource(R.mipmap.imagen4);
            if(CoincidirImg1 == CoincidirImg6){
                score = score + 50;
                Toast.makeText(this,"Si coinciden",Toast.LENGTH_SHORT).show();
                tvScore.setText(Integer.toString(score));
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score >= 250){
                    score = 250;
                    tvScore.setText(Integer.toString(score));
                    Toast.makeText(this,"Gano el Segundo Nivel",Toast.LENGTH_SHORT).show();
                    Intent siguientee = new Intent(this, TuGanaste.class);
                    siguientee.putExtra("scorefinal", tvScore.getText().toString());
                    startActivity(siguientee);
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
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score <= 0){
                    score = 0;
                }
                tvScore.setText(Integer.toString(score));
            }
        }
        else
            imageButton1.setImageResource(R.mipmap.imagen4);
    }
    public void ClickImg22(View view){
        Contador_Ver = Contador_Ver + 1;
        CoincidirImg2 = 2;
        if(Contador_Ver == 3){
            imageButton1.setImageResource(R.mipmap.imagen0);
            imageButton2.setImageResource(R.mipmap.imagen0);
            imageButton3.setImageResource(R.mipmap.imagen0);
            imageButton4.setImageResource(R.mipmap.imagen0);
            imageButton5.setImageResource(R.mipmap.imagen0);
            imageButton6.setImageResource(R.mipmap.imagen0);
            Contador_Ver = 0;
            CoincidirImg1 = 0;
            CoincidirImg2 = 0;
            CoincidirImg3 = 0;
            CoincidirImg4 = 0;
            CoincidirImg5 = 0;
            CoincidirImg6 = 0;
        }
        else if (Contador_Ver == 2){
            imageButton2.setImageResource(R.mipmap.imagen3);
            if(CoincidirImg2 == CoincidirImg3){
                score = score + 50;
                Toast.makeText(this,"Si coinciden",Toast.LENGTH_SHORT).show();
                tvScore.setText(Integer.toString(score));
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score >= 250){
                    score = 250;
                    tvScore.setText(Integer.toString(score));
                    Toast.makeText(this,"Gano el Segundo Nivel",Toast.LENGTH_SHORT).show();
                    Intent siguientee = new Intent(this, TuGanaste.class);
                    siguientee.putExtra("scorefinal", tvScore.getText().toString());
                    startActivity(siguientee);
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
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score <= 0){
                    score = 0;
                }
                tvScore.setText(Integer.toString(score));
            }
        }
        else
            imageButton2.setImageResource(R.mipmap.imagen3);
    }
    public void ClickImg33(View view){
        Contador_Ver = Contador_Ver + 1;
        CoincidirImg3 = 2;
        if(Contador_Ver == 3){
            imageButton1.setImageResource(R.mipmap.imagen0);
            imageButton2.setImageResource(R.mipmap.imagen0);
            imageButton3.setImageResource(R.mipmap.imagen0);
            imageButton4.setImageResource(R.mipmap.imagen0);
            imageButton5.setImageResource(R.mipmap.imagen0);
            imageButton6.setImageResource(R.mipmap.imagen0);
            Contador_Ver = 0;
            CoincidirImg1 = 0;
            CoincidirImg2 = 0;
            CoincidirImg3 = 0;
            CoincidirImg4 = 0;
            CoincidirImg5 = 0;
            CoincidirImg6 = 0;
        }
        else if (Contador_Ver == 2){
            imageButton3.setImageResource(R.mipmap.imagen3);
            if(CoincidirImg3 == CoincidirImg2){
                score = score + 50;
                Toast.makeText(this,"Si coinciden",Toast.LENGTH_SHORT).show();
                tvScore.setText(Integer.toString(score));
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score >= 250){
                    score = 250;
                    tvScore.setText(Integer.toString(score));
                    Toast.makeText(this,"Gano el Segundo Nivel",Toast.LENGTH_SHORT).show();
                    Intent siguientee = new Intent(this, TuGanaste.class);
                    siguientee.putExtra("scorefinal", tvScore.getText().toString());
                    startActivity(siguientee);
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
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score <= 0){
                    score = 0;
                }
                tvScore.setText(Integer.toString(score));
            }
        }
        else
            imageButton3.setImageResource(R.mipmap.imagen3);
    }
    public void ClickImg44(View view){
        Contador_Ver = Contador_Ver + 1;
        CoincidirImg4 = 3;
        if(Contador_Ver == 3){
            imageButton1.setImageResource(R.mipmap.imagen0);
            imageButton2.setImageResource(R.mipmap.imagen0);
            imageButton3.setImageResource(R.mipmap.imagen0);
            imageButton4.setImageResource(R.mipmap.imagen0);
            imageButton5.setImageResource(R.mipmap.imagen0);
            imageButton6.setImageResource(R.mipmap.imagen0);
            Contador_Ver = 0;
            CoincidirImg1 = 0;
            CoincidirImg2 = 0;
            CoincidirImg3 = 0;
            CoincidirImg4 = 0;
            CoincidirImg5 = 0;
            CoincidirImg6 = 0;
        }
        else if (Contador_Ver == 2){
            imageButton4.setImageResource(R.mipmap.imagen2);
            if(CoincidirImg4 == CoincidirImg5){
                score = score + 50;
                Toast.makeText(this,"Si coinciden",Toast.LENGTH_SHORT).show();
                tvScore.setText(Integer.toString(score));
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score >= 250){
                    score = 250;
                    tvScore.setText(Integer.toString(score));
                    Toast.makeText(this,"Gano el Segundo Nivel",Toast.LENGTH_SHORT).show();
                    Intent siguientee = new Intent(this, TuGanaste.class);
                    siguientee.putExtra("scorefinal", tvScore.getText().toString());
                    startActivity(siguientee);
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
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score <= 0){
                    score = 0;
                }
                tvScore.setText(Integer.toString(score));
            }
        }
        else
            imageButton4.setImageResource(R.mipmap.imagen2);
    }
    public void ClickImg55(View view){
        Contador_Ver = Contador_Ver + 1;
        CoincidirImg5 = 3;
        if(Contador_Ver == 3){
            imageButton1.setImageResource(R.mipmap.imagen0);
            imageButton2.setImageResource(R.mipmap.imagen0);
            imageButton3.setImageResource(R.mipmap.imagen0);
            imageButton4.setImageResource(R.mipmap.imagen0);
            imageButton5.setImageResource(R.mipmap.imagen0);
            imageButton6.setImageResource(R.mipmap.imagen0);
            Contador_Ver = 0;
            CoincidirImg1 = 0;
            CoincidirImg2 = 0;
            CoincidirImg3 = 0;
            CoincidirImg4 = 0;
            CoincidirImg5 = 0;
            CoincidirImg6 = 0;
        }
        else if (Contador_Ver == 2){
            imageButton5.setImageResource(R.mipmap.imagen2);
            if(CoincidirImg5 == CoincidirImg4){
                score = score + 50;
                Toast.makeText(this,"Si coinciden",Toast.LENGTH_SHORT).show();
                tvScore.setText(Integer.toString(score));
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score >= 250){
                    score = 250;
                    tvScore.setText(Integer.toString(score));
                    Toast.makeText(this,"Gano el Segundo Nivel",Toast.LENGTH_SHORT).show();
                    Intent siguientee = new Intent(this, TuGanaste.class);
                    siguientee.putExtra("scorefinal", tvScore.getText().toString());
                    startActivity(siguientee);
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
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score <= 0){
                    score = 0;
                }
                tvScore.setText(Integer.toString(score));
            }
        }
        else
            imageButton5.setImageResource(R.mipmap.imagen2);
    }
    public void ClickImg66(View view){
        Contador_Ver = Contador_Ver + 1;
        CoincidirImg6 = 1;
        if(Contador_Ver == 3){
            imageButton1.setImageResource(R.mipmap.imagen0);
            imageButton2.setImageResource(R.mipmap.imagen0);
            imageButton3.setImageResource(R.mipmap.imagen0);
            imageButton4.setImageResource(R.mipmap.imagen0);
            imageButton5.setImageResource(R.mipmap.imagen0);
            imageButton6.setImageResource(R.mipmap.imagen0);
            Contador_Ver = 0;
            CoincidirImg1 = 0;
            CoincidirImg2 = 0;
            CoincidirImg3 = 0;
            CoincidirImg4 = 0;
            CoincidirImg5 = 0;
            CoincidirImg6 = 0;
        }
        else if (Contador_Ver == 2){
            imageButton6.setImageResource(R.mipmap.imagen4);
            if(CoincidirImg6 == CoincidirImg1){
                score = score + 50;
                Toast.makeText(this,"Si coinciden",Toast.LENGTH_SHORT).show();
                tvScore.setText(Integer.toString(score));
                CoincidirImg1 = 0;
                CoincidirImg2 = 0;
                CoincidirImg3 = 0;
                CoincidirImg4 = 0;
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score >= 250){
                    score = 250;
                    tvScore.setText(Integer.toString(score));
                    Toast.makeText(this,"Gano el Segundo Nivel",Toast.LENGTH_SHORT).show();
                    Intent siguientee = new Intent(this, TuGanaste.class);
                    siguientee.putExtra("scorefinal", tvScore.getText().toString());
                    startActivity(siguientee);
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
                CoincidirImg5 = 0;
                CoincidirImg6 = 0;
                if (score <= 0){
                    score = 0;
                }
                tvScore.setText(Integer.toString(score));
            }
        }
        else
            imageButton6.setImageResource(R.mipmap.imagen4);
    }


    public void Anterior(View view){
        Intent anterior = new Intent(this, Nivel1.class);
        startActivity(anterior);
    }
    public void IrMenu(View view){
        Intent Salir = new Intent(this, MainActivity.class);
        startActivity(Salir);
    }
}