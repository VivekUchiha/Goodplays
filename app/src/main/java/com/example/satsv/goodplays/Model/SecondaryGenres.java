
package com.example.satsv.goodplays.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SecondaryGenres {

    @SerializedName("music_genre_list")
    @Expose
    private List<MusicGenreList_> musicGenreList = null;

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
    public SecondaryGenres(List<MusicGenreList_> musicGenreList) {
        super();
        this.musicGenreList = musicGenreList;
    }

    public List<MusicGenreList_> getMusicGenreList() {
        return musicGenreList;
    }

    public void setMusicGenreList(List<MusicGenreList_> musicGenreList) {
        this.musicGenreList = musicGenreList;
    }

}
