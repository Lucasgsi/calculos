package com.br.atividade.calculos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCalcImc(View view){
        Intent intent = new Intent(this, CalculoImc.class);
        startActivity(intent);
    }

    public void openCalcFinanc(View view){
        Intent intent = new Intent(this, CalculoImc.class);
        startActivity(intent);
    }

    public void sair(View view){
        onDestroy();
    }
}
