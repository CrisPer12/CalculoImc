package com.example.crist.calculoimc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    private RadioButton rbMasculino;
    private RadioButton rbFeminino;
    private EditText txtPeso, txtAltura;
    private TextView txtMensagem;
    private double imc = 0.0;
    private double peso = 0.0;
    private double altura = 0.0;
    private int genero = 0;
    private String mensagem = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPeso = (EditText)findViewById(R.id.txtPeso);
        txtAltura = (EditText)findViewById(R.id.txtAltura);
        rbMasculino = (RadioButton)findViewById(R.id.rbMasculino);
        rbFeminino = (RadioButton)findViewById(R.id.rbFeminino);
        txtMensagem = (TextView)findViewById(R.id.txtMensagem);

    }

    public void calcularIMC(View view){
        this.genero = 0;
        this.altura = Double.parseDouble(txtAltura.getText().toString());
        this.peso = Double.parseDouble(txtPeso.getText().toString());
        this.imc = this.peso/(this.altura*this.altura);
        if(rbMasculino.isChecked()){
            this.genero = 1;
        } else if (rbFeminino.isChecked()){
            this.genero = 2;
        }
        switch (this.genero){
            case 1:
                if(this.imc<20){
                    this.mensagem = "Você está abaixo do peso ideal";
                }else if(this.imc<25){
                    this.mensagem = "Você está no peso ideal";
                }else if(this.imc <30){
                    this.mensagem = "Você está com obesidade leve";
                }else if(this.imc <40){
                    this.mensagem = "Você está com obesidade moderada";
                }else{
                    this.mensagem = "Você está com obesidade mórbida";
                }
                break;
            case 2:
                if(this.imc<19){
                    this.mensagem = "Você está abaixo do peso ideal";
                }else if(this.imc<24){
                    this.mensagem = "Você está no peso ideal";
                }else if(this.imc<29){
                    this.mensagem = "Você está com obesidade leve";
                }else if(this.imc<39){
                    this.mensagem = "Você está com obesidade moderada";
                }else {
                    this.mensagem = "Você está com obesidade mórbida";
                }
                break;
        }

        txtMensagem.setText(this.mensagem);

    }

}
