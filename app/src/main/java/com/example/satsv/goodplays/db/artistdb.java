package com.example.satsv.goodplays.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class artistdb {
    @PrimaryKey
    @NonNull
    @ColumnInfo
            (name="id") String id;
    @ColumnInfo (name = "twitter") String twitter;
    @ColumnInfo (name = "genres") String genres;
    @ColumnInfo (name = "name") String name;
    @ColumnInfo (name = "rating") String rating;
    @ColumnInfo (name = "alias") String alias;

    public artistdb(String id, String twitter, String genres, String name, String rating, String alias) {
        this.id = id;
        this.twitter = twitter;
        this.genres = genres;
        this.name = name;
        this.rating = rating;
        this.alias = alias;
    }


    public String getId() {
        return id;
    }

    public void setId( String id) {
        this.id = id;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }



}
