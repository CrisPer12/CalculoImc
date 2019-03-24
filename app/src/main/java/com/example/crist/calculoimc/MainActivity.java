package com.example.crist.calculoimc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    private RadioButton rbMasculino;
    private RadioButton rbFeminino;
    private EditText txtPeso, txtAltura;
    private TextView txtMensagem;


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
}
