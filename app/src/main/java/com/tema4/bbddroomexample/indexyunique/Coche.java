package com.tema4.bbddroomexample.indexyunique;

import androidx.room.Entity;
import androidx.room.Index;

/**
 * Created by Sergio on 05/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

@Entity(indices = {@Index(value = {"matricula", "bastidor"}, unique = true)})
public class Coche {

    private String marca, modelo, matricula, bastidor;
}
