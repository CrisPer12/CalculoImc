package com.example.crist.calculoimc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class CalcularIMCActivity extends Activity {

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
        setContentView(R.layout.activity_calcular_imc);
    }

    public void calcularIMC2(View view){
        Intent it = new Intent(this, CalcularIMCActivity.class);
        this.altura = Double.parseDouble(txtAltura.getText().toString());
        this.peso = Double.parseDouble(txtPeso.getText().toString());
        if(rbMasculino.isChecked()){
            this.genero = 1;
        }else if(rbFeminino.isChecked()){
            this.genero = 2;
        }
        it.putExtra("genero",this.genero);
        it.putExtra("peso",this.peso);
        it.putExtra("altura",this.altura);
        startActivity(it);
    }

    protected void OnCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_calcular_imc);
        txtMensagem = (TextView)findViewById(R.id.txtMensagem);

        Intent it = this.getIntent();
        this.peso = it.getDoubleExtra("peso", 0.0);
        this.altura = it.getDoubleExtra("altura", 0.0);
        this.genero = it.getIntExtra("genero", 0);

       // calcularIMC();//
    }
}
