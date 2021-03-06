package com.br.atividade.calculos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListViewTimes extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener{

    private android.widget.ListView listViewTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listViewTimes = (android.widget.ListView) findViewById(R.id.listTimes);

        String times[] = {"Flamengo", "ACP", "Internacional", "Avai"};

        ArrayAdapter<String> adapterTimes = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, times);

        List<Time> listaTimes = new ArrayList<>();
        listaTimes.add(new Time(1L, "Gremio", "Porto", R.drawable.gremio));

        AdapterTimes adapter = new AdapterTimes(this, listaTimes);

        listViewTimes.setAdapter(adapter);
//        listViewTimes.setAdapter(adapterTimes);
        listViewTimes.setOnItemClickListener(this);
        listViewTimes.setOnItemLongClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("MainActivity", parent.getItemAtPosition(position).toString());
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("MainActivity", parent.getItemAtPosition(position).toString());
        return true;
    }
}
