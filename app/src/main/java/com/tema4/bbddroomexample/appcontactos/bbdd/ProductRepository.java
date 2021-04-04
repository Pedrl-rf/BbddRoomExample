package com.tema4.bbddroomexample.appcontactos.bbdd;

import android.content.Context;

import androidx.lifecycle.LiveData;

import java.util.List;

/**
 * Created by Sergio on 04/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

public class ProductRepository {

    private final DaoProducto daoProducto;
    private final AppDataBase dataBase;

    public ProductRepository(Context context) {
        dataBase = AppDataBase.getDatabase(context);
        daoProducto = dataBase.daoProducto();
    }

    public void updateProduct(int id, int quant) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                daoProducto.updateQuantity(id, quant);
            }
        }).start();
    }


    public LiveData<Integer> getCount() {
        return daoProducto.countList();
    }

    public LiveData<List<Producto>> getImportants() {
        return daoProducto.loadImportantProducts();
    }
}
