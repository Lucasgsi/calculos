package com.br.atividade.calculos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class CalculoImc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void calcularImc(View view){
        EditText altura = (EditText) findViewById(R.id.editAltura);
        EditText peso = (EditText) findViewById(R.id.editPeso);

        Double calcAlt = Double.parseDouble(altura.getText().toString()) * Double.parseDouble(altura.getText().toString());
        Double calcImc = Double.parseDouble(peso.getText().toString()) / calcAlt;
        DecimalFormat df = new DecimalFormat("#.00");

        Toast.makeText(this, "Resultado: " + df.format(calcImc), Toast.LENGTH_SHORT).show();
    }

}
