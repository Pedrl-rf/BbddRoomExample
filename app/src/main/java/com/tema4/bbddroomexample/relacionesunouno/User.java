package com.tema4.bbddroomexample.relacionesunouno;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Sergio on 04/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

@Entity
public class User {
    @PrimaryKey
    public long userId;
    public String name;
    public int age;
}
