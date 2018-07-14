package com.example.satsv.goodplays.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities= artistdb.class,version = 1)
public abstract class Appdatabaseartist extends RoomDatabase {
    public abstract artistdbdao Artistdbdao();
}
