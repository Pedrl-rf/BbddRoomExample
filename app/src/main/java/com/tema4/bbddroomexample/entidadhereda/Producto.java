package com.tema4.bbddroomexample.entidadhereda;

import android.graphics.Bitmap;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * Created by Sergio on 05/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

@Entity
public class Producto {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public String productName;
    public String comments;
    public int quantity;

    @Ignore
    Bitmap photo;
}
