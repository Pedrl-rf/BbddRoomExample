package com.tema4.bbddroomexample.entidadsimple;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * Created by Sergio on 05/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

@Entity(tableName = "users")
public class Usuario {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private int edad;
    private String name, dni;
    @ColumnInfo(name = "fNac")
    private String fechaNacimiento;
    @Ignore
    private boolean mayorEdad;
}
