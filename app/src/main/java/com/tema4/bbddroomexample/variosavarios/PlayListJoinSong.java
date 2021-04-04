package com.tema4.bbddroomexample.variosavarios;

import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "playlist_join_song", primaryKeys = {"playlistId", "songId"},
        foreignKeys = {@ForeignKey(entity = Playlist.class, parentColumns = "id", childColumns = "playlistId"),
                @ForeignKey(entity = Song.class, parentColumns = "id", childColumns = "songId")})
public class PlayListJoinSong {
    public int playlistId;
    public int songId;
}
