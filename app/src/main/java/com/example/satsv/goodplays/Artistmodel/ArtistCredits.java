
package com.example.satsv.goodplays.Artistmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArtistCredits {

    @SerializedName("artist_list")
    @Expose
    private List<Object> artistList = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ArtistCredits() {
    }

    /**
     * 
     * @param artistList
     */
    public ArtistCredits(List<Object> artistList) {
        super();
        this.artistList = artistList;
    }

    public List<Object> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Object> artistList) {
        this.artistList = artistList;
    }

}
