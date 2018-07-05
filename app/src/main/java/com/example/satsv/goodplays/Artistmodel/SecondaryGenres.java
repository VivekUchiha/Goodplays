
package com.example.satsv.goodplays.Artistmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SecondaryGenres {

    @SerializedName("music_genre_list")
    @Expose
    private List<Object> musicGenreList = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecondaryGenres() {
    }

    /**
     * 
     * @param musicGenreList
     */
    public SecondaryGenres(List<Object> musicGenreList) {
        super();
        this.musicGenreList = musicGenreList;
    }

    public List<Object> getMusicGenreList() {
        return musicGenreList;
    }

    public void setMusicGenreList(List<Object> musicGenreList) {
        this.musicGenreList = musicGenreList;
    }

}
