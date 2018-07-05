
package com.example.satsv.goodplays.Artistmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Body {

    @SerializedName("artist_list")
    @Expose
    private List<ArtistList> artistList = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Body() {
    }

    /**
     * 
     * @param artistList
     */
    public Body(List<ArtistList> artistList) {
        super();
        this.artistList = artistList;
    }

    public List<ArtistList> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<ArtistList> artistList) {
        this.artistList = artistList;
    }

}
