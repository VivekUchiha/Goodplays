
package com.example.satsv.goodplays.Artistmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArtistAliasList {

    @SerializedName("artist_alias")
    @Expose
    private String artistAlias;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ArtistAliasList() {
    }

    /**
     * 
     * @param artistAlias
     */
    public ArtistAliasList(String artistAlias) {
        super();
        this.artistAlias = artistAlias;
    }

    public String getArtistAlias() {
        return artistAlias;
    }

    public void setArtistAlias(String artistAlias) {
        this.artistAlias = artistAlias;
    }

}
