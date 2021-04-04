package com.tema4.bbddroomexample.entidadhereda;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Sergio on 05/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

@Entity(ignoredColumns = {"photo", "quantity"})
public class Carne extends Producto {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public double kg;

}
