package com.br.atividade.calculos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SegundaTela extends AppCompatActivity {

    private final String TAG="SegundaTela";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        Bundle bundle = getIntent().getExtras();
        String time = bundle.getString("timeCampeao");
        Integer titulos = bundle.getInt("titulosBrasileiros");

        Log.i(TAG, "Time: " + time);
        Log.i(TAG, "Títulos: " + titulos);
    }
}
