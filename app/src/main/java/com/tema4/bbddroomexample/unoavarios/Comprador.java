package com.tema4.bbddroomexample.unoavarios;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Sergio on 05/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

@Entity
public class Comprador {

    @PrimaryKey
    public int id;
    public String name;
    public String dni;
}

