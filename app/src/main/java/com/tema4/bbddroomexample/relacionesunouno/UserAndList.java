package com.tema4.bbddroomexample.relacionesunouno;

import androidx.room.Embedded;
import androidx.room.Relation;

/**
 * Created by Sergio on 04/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

public class UserAndList {

    @Embedded
    public User user;
    @Relation(
            parentColumn = "userId", //nombre de la columna de la clave primaria de la entidad principal
            entityColumn = "userOwnerId" //nombre de la columna que hace referencia a la clave primaria
    )
    public PlayList playlist;
}
