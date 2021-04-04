package com.tema4.bbddroomexample.appcontactos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.tema4.bbddroomexample.R;
import com.tema4.bbddroomexample.appcontactos.bbdd.AppDataBase;
import com.tema4.bbddroomexample.appcontactos.bbdd.ProductRepository;
import com.tema4.bbddroomexample.appcontactos.bbdd.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergio on 04/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

public class AdapterProductos extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Producto> listaProductos;
    private final Context context;
    private final ProductRepository repositorio;

    public AdapterProductos(Context context) {
        listaProductos = new ArrayList<>();
        this.context = context;
        repositorio = new ProductRepository(context);
    }

    static class ProductHolder extends RecyclerView.ViewHolder {

        private final TextView nombre;
        private final TextView cantidad;
        private final Button sum;
        private final Button rest;
        private final ConstraintLayout layout;
        private final ImageView borrar;
        private final ImageView star;

        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            borrar = itemView.findViewById(R.id.item_remove);
            layout = itemView.findViewById(R.id.item_layout);
            nombre = itemView.findViewById(R.id.item_name);
            sum = itemView.findViewById(R.id.item_add);
            rest = itemView.findViewById(R.id.item_sustract);
            cantidad = itemView.findViewById(R.id.item_quantity);
            star = itemView.findViewById(R.id.item_star);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_item, parent, false);
        return new ProductHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final Producto producto = listaProductos.get(position);

        ProductHolder pHolder = (ProductHolder) holder;
        pHolder.nombre.setText();
        pHolder.cantidad.setText();
        pHolder.sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        pHolder.rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        pHolder.borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        pHolder.layout.setBackgroundColor());


    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
    }

    public void updateList(List<Producto> lista) {
        listaProductos = lista;
        notifyDataSetChanged();
    }
}
