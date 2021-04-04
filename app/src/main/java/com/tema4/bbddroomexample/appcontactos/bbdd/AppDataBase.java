package com.tema4.bbddroomexample.appcontactos.bbdd;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Sergio on 04/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

@Database(entities = Producto.class, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public static final String DB_NAME = "db_producto";

    public abstract DaoProducto daoProducto();

    private static AppDataBase database; //variable para crear una instancia de la base de datos y poder acceder a ella

    public static AppDataBase getDatabase(final Context context) {
        if (database == null) {
            synchronized (AppDataBase.class) {
                if (database == null) {
                    database = Room.databaseBuilder(context.getApplicationContext(),
                            AppDataBase.class, DB_NAME)
                            .build();
                }
            }
        }
        return database;
    }

    static final ExecutorService dbWriterExecutor = Executors.newFixedThreadPool(1);
}
