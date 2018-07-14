package com.example.satsv.goodplays.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.RoomDatabase;

@Database(entities= songdb.class,version = 1)
public abstract class Appdatabase extends RoomDatabase {
        public abstract songdbdao Songdbdao();
}
