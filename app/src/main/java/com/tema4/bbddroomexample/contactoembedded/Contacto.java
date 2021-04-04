package com.tema4.bbddroomexample.contactoembedded;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Sergio on 04/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

@Entity
public class Contacto {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nombre, apellidos, email;
    @ColumnInfo(name= "fecha_nacimiento")
    public String fechaNacim;
    public int tlfnoCasa, tlfnoMovil;
    public boolean favorito, tieneWhatsapp;
    @Embedded public Direccion direccion;
}
