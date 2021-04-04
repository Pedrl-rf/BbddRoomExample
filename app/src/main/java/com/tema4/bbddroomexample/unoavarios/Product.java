package com.tema4.bbddroomexample.unoavarios;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/**
 * Created by Sergio on 05/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

@Entity(foreignKeys = @ForeignKey(entity = Comprador.class, parentColumns = "id", childColumns = "buyer_id"))
public class Product {

    @PrimaryKey
    public int id;
    public String productName;
    public String productBrand;

    @ColumnInfo(name = "buyer_id")
    public int buyerId;
}
