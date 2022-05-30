package com.cursoandroid.alcool_ou_gasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool, getEditPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool         = findViewById(R.id.editPrecoAlcool);
        getEditPrecoGasolina    = findViewById(R.id.editPrecoGasolina);
        textResultado           = findViewById(R.id.textResultado);

    }

    public void calcularPreco (View viwe){
        //recuperar  valores digitados
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = getEditPrecoGasolina.getText().toString();

        //validar campos digitados
        Boolean camposValidados = validarCampos(precoAlcool, precoGasolina);
        if (camposValidados){


        // Convertendo String para numeros
        Double valorAlcool = Double.parseDouble( precoAlcool );
        Double valorGasolina = Double.parseDouble( precoGasolina );

        /*Fazer calculo de menor preco
        *se (valorAlcool / valorGasolina) >= 0.7 e melhor utilizar gasolina
        * se nao e melhor utilizar alcool
         */
         Double resultado = valorAlcool / valorGasolina;
         if( resultado >= 0.7){
             textResultado.setText("Melhor utilizar Gasolina");
         }else{
             textResultado.setText("Melhor utilizar Alcool");
         }

        }else{
            textResultado.setText("Preencha os preços primeiro!");
        }

    }

    public Boolean validarCampos( String pAlcool, String pGasolina ){

        Boolean camposValidados = true;

        if (pAlcool == null || pAlcool.equals("") ) {
            camposValidados = false;
        }else if(pGasolina == null || pGasolina.equals("")) {
            camposValidados = false;

        }

    return camposValidados;


    }

}