package com.tema4.bbddroomexample.claveprimariacompuesta;

import androidx.room.Entity;

/**
 * Created by Sergio on 05/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

@Entity(primaryKeys = {"matricula", "bastidor"})
public class Coche {

    private String marca, modelo, matricula, bastidor;
}
