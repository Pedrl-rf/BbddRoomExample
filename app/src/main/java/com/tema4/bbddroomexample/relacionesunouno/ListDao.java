package com.tema4.bbddroomexample.relacionesunouno;

/**
 * Created by Sergio on 04/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

/**
 * Tenemos una app de música, donde cada usuario tiene una lista de canciones. Cada usuario tiene
 * una única lista de canciones y cada lista únicamente pertenece a un usuario. Por tanto, debe haber
 * una relaci´no uno a uno
 */

@Dao
public interface ListDao {
    @Transaction //permite ejecutar dos o más consultas automáticamente
    @Query("SELECT * FROM User")
    List<UserAndList> getUsersAndList();
}
