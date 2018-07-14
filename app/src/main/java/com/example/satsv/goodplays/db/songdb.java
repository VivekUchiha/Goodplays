package com.example.satsv.goodplays.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class songdb{
    @PrimaryKey
    @NonNull
    @ColumnInfo
            (name="songid") String songid;
    @ColumnInfo (name = "name") String name;
    @ColumnInfo (name = "artist") String artist;
    @ColumnInfo (name = "genre") String genre;
    @ColumnInfo (name = "release") String release;
    @ColumnInfo (name = "album") String album;
    @ColumnInfo (name = "lyrics") String lyrics;

    public songdb(String songid, String name, String artist, String genre, String release, String album, String lyrics) {
        this.songid = songid;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.release = release;
        this.album = album;
        this.lyrics = lyrics;
    }

    public String getSongid() {
        return songid;
    }

    public void setSongid(String songid) {
        this.songid = songid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}

