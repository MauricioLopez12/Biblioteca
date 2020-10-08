package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Valor;

public class github_act extends AppCompatActivity {

    private Spinner spinner;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spinner = (Spinner)findViewById(R.id.spinner);
        tv = (TextView)findViewById(R.id.textView);

        String [] libros = {"Farenheint", "Revival", "El Alquimista", "El Poder", "Despertar"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, libros);
        spinner.setAdapter(adapter);
    }

    public void Mostrar(View view){
        String seleccionLibro = spinner.getSelectedItem().toString();
        Valor valor = new Valor();

        if (seleccionLibro.equals("Farenheint")) {
            tv.setText("El valor de " + seleccionLibro + " es: " + valor.getFarenheith());
        }
        if (seleccionLibro.equals("Revival")){
            tv.setText("El valor de " + seleccionLibro + " es: " + valor.getRevival());
        }
        if(seleccionLibro.equals("El Alquimista")){
            tv.setText("El valor de " + seleccionLibro + " es: " + valor.getElAlquimista());
        }
        if(seleccionLibro.equals("El Poder")){
            tv.setText("El valor de " + seleccionLibro + " es: " + valor.getElPoder());
        }
        if(seleccionLibro.equals("Despertar")){
            tv.setText("El valor de " + seleccionLibro + " es: " + valor.getDespertar());
        }
    }
}