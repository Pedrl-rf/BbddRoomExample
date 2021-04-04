package com.tema4.bbddroomexample.contactoembedded;

import androidx.room.ColumnInfo;

/**
 * Created by Sergio on 04/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

public class Direccion {

    public String calle, ciudad, comunidad, pais;
    public int numero, piso;
    @ColumnInfo(name = "cp")
    public int codigopostal;
}
