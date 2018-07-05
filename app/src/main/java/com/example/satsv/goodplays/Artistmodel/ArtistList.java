
package com.example.satsv.goodplays.Artistmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArtistList {

    @SerializedName("artist")
    @Expose
    private Artist artist;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ArtistList() {
    }

    /**
     * 
     * @param artist
     */
    public ArtistList(Artist artist) {
        super();
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

}
