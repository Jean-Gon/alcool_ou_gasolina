package com.cursoandroid.alcool_ou_gasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class tela_Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Classe que vai iniciar/classe que ir depois
                startActivity(new Intent(tela_Splash.this,MainActivity.class));
                finish();
            }
        },3000); // 4000 4s

    }

}