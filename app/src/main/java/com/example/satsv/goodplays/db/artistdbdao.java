package com.example.satsv.goodplays.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;
@Dao
public interface artistdbdao {

    @Query("SELECT * FROM artistdb")
    List<artistdb> getAll();


    @Insert
    void insertsong(artistdb artistdb);

    @Delete
    void delete(artistdb artistdb);
}
