package com.tema4.bbddroomexample.variosavarios;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Song {
    @PrimaryKey
    public int id;
    public String songName;
    public String artistName;
}
