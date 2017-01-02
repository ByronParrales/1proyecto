package com.facci.appturi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {
    Spinner SelecionarPais;
    Spinner SelecionarCiudad;
    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SelecionarPais = (Spinner)findViewById(R.id.spList);
        SelecionarCiudad = (Spinner)findViewById(R.id.spList2);


        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.SeleccionarPaís, android.R.layout.simple_spinner_item);

        SelecionarPais.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1= ArrayAdapter.createFromResource(this, R.array.SeleccionarCiudad, android.R.layout.simple_spinner_item);

        SelecionarCiudad.setAdapter(adapter1);

        btnRegresar = (Button)findViewById(R.id.btnRegresar);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volver = new Intent(Main2Activity.this, MainActivity.class);

            }
        });

    }

}
