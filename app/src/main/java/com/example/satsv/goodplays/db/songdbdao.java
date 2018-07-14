package com.example.satsv.goodplays.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface songdbdao {


    @Query("SELECT * FROM songdb")
    List<songdb> getAll();


    @Insert
    void insertsong(songdb song);

    @Delete
    void delete(songdb song);


}
