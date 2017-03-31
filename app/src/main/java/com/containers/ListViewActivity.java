package com.containers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // A. Creamos el arreglo de Strings para llenar la lista
        String[] cosasPorHacer = new String[] { "Aprender a programar en Android",
                "Hacer una aplicación famosa","Vender la aplicación","Esperar a que llegue el dinero"};


        //Se crea el array adapter
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, cosasPorHacer);

        //Elemento listview de la interfaz
        ListView lista = (ListView)findViewById(R.id.listView);

        //Se ingresan los datos en la interfaz
        lista.setAdapter(arrayAdapter);


    }
}
