package com.tema4.bbddroomexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tema4.bbddroomexample.appcontactos.AdapterProductos;
import com.tema4.bbddroomexample.appcontactos.AddProducto;
import com.tema4.bbddroomexample.appcontactos.bbdd.ProductRepository;
import com.tema4.bbddroomexample.appcontactos.bbdd.Producto;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final int RESULT_ACTIVITY = 5;

    private AdapterProductos adapter;
    private ProductRepository noteRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noteRepository = new ProductRepository(getApplicationContext());

        FloatingActionButton btAddProduct = findViewById(R.id.main_add_contact);
        btAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AddProducto.class);
                startActivityForResult(i, 5);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.main_recyclerview);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        adapter = new AdapterProductos(this);
        recyclerView.setAdapter(adapter);

        final TextView tvCantidad = findViewById(R.id.main_amount);
        LiveData<Integer> liveCantidad = noteRepository.getCount();
        liveCantidad.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                tvCantidad.setText(String.valueOf(integer));
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_ACTIVITY) {
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    Producto producto = data.getParcelableExtra("producto");
                }
            } else {
                Toast.makeText(this, "Error al insertar el producto", Toast.LENGTH_SHORT).show();
            }
        }
    }
}