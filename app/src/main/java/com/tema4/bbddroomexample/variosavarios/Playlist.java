package com.tema4.bbddroomexample.variosavarios;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Playlist {
    @PrimaryKey
    public int id;
    public String name;
    public String description;
}
