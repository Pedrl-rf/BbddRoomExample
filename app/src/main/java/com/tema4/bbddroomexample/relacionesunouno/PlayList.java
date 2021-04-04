package com.tema4.bbddroomexample.relacionesunouno;

import androidx.room.PrimaryKey;

/**
 * Created by Sergio on 04/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

public class PlayList {
    @PrimaryKey
    public long libraryId;
    public long userOwnerId;
    public String name;
}
