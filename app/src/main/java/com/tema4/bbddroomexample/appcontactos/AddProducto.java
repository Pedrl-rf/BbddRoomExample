package com.tema4.bbddroomexample.appcontactos;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.tema4.bbddroomexample.R;
import com.tema4.bbddroomexample.appcontactos.bbdd.Producto;

import java.util.Random;

/**
 * Created by Sergio on 05/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

public class AddProducto extends AppCompatActivity {

    private TextInputEditText etNombre, etCantidad;
    private Button btSumar, btRestar, btAceptar;
    private SwitchCompat swImportante;

    private final int[] listaColores = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DKGRAY, Color.MAGENTA,
            Color.YELLOW, Color.GREEN, Color.RED};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_producto);

        btSumar = findViewById(R.id.addSuma);
        btRestar = findViewById(R.id.addResta);
        btAceptar = findViewById(R.id.addAceptar);
        etNombre = findViewById(R.id.addNombre);
        etCantidad = findViewById(R.id.addCantidad);
        swImportante = findViewById(R.id.addImportante);

        btSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumaUno();
            }
        });

        btRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restaUno();
            }
        });

        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarUsuario();
            }
        });

    }

    private void sumaUno() {
        String numero = etCantidad.getText().toString();
        int cantidad = Integer.parseInt(numero);
        cantidad++;
        etCantidad.setText(String.valueOf(cantidad));
    }

    private void restaUno() {
        String numero = etCantidad.getText().toString();
        int cantidad = Integer.parseInt(numero);
        if (cantidad > 1) {
            cantidad--;
            etCantidad.setText(String.valueOf(cantidad));

        }
    }

    private void guardarUsuario() {
        String nombre = etNombre.getText().toString();
        if (!nombre.isEmpty()) {
            String numero = etCantidad.getText().toString();
            int cantidad = Integer.parseInt(numero);
            boolean importante = swImportante.isChecked();

            Random random = new Random();
            int num = random.nextInt(7);
            int color = listaColores[num];

            Producto producto = new Producto(nombre, importante, cantidad, color);


            Intent intent = new Intent();
            intent.putExtra("producto", producto);
            setResult(RESULT_OK, intent);
            finish();
        } else {
            Toast.makeText(this, "No has añadido un producto", Toast.LENGTH_SHORT).show();
        }
    }
}
