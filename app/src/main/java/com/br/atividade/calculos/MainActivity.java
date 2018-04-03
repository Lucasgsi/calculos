package com.br.atividade.calculos;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        Intent intent = new Intent(this, CalculoFinanciamento.class);
        startActivity(intent);
    }

    public void sair(View view){
        onDestroy();
    }

    public void chamarSegundaTela(View view){
        Intent intent = new Intent(this, SegundaTela.class);
        intent.putExtra("timeCampeao","Palmeiras");
        intent.putExtra("titulosBrasileiros",10);
        startActivity(intent);
    }

    public void chamarListView(View view){
        Intent intent = new Intent(this, ListViewTimes.class);
        startActivity(intent);
    }

    public void gravarSP(View view){
        //Buscar as preferencias desta Activity (MainActivity)
        SharedPreferences sp = this.getPreferences(Context.MODE_PRIVATE);

        //Buscar as preferencias desta/outras Activity - Passar Nome
        //SharedPreferences sp = this.getSharedPreferences("MainActivity", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sp.edit();
        editor.putString("carro", "Fiesta");
        editor.commit();
    }

    public void recuperarSP(View view){
        SharedPreferences sp = this.getPreferences(Context.MODE_PRIVATE);
        String carro = sp.getString("carro", "não tem fiesta");
        Log.i("MainActivity", carro);
    }

}
