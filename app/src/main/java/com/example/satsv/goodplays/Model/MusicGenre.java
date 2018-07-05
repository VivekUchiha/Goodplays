
package com.example.satsv.goodplays.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MusicGenre {

    @SerializedName("music_genre_id")
    @Expose
    private int musicGenreId;
    @SerializedName("music_genre_parent_id")
    @Expose
    private int musicGenreParentId;
    @SerializedName("music_genre_name")
    @Expose
    private String musicGenreName;
    @SerializedName("music_genre_name_extended")
    @Expose
    private String musicGenreNameExtended;
    @SerializedName("music_genre_vanity")
    @Expose
    private String musicGenreVanity;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MusicGenre() {
    }

    /**
     * 
     * @param musicGenreName
     * @param musicGenreId
     * @param musicGenreNameExtended
     * @param musicGenreVanity
     * @param musicGenreParentId
     */
    public MusicGenre(int musicGenreId, int musicGenreParentId, String musicGenreName, String musicGenreNameExtended, String musicGenreVanity) {
        super();
        this.musicGenreId = musicGenreId;
        this.musicGenreParentId = musicGenreParentId;
        this.musicGenreName = musicGenreName;
        this.musicGenreNameExtended = musicGenreNameExtended;
        this.musicGenreVanity = musicGenreVanity;
    }

    public int getMusicGenreId() {
        return musicGenreId;
    }

    public void setMusicGenreId(int musicGenreId) {
        this.musicGenreId = musicGenreId;
    }

    public int getMusicGenreParentId() {
        return musicGenreParentId;
    }

    public void setMusicGenreParentId(int musicGenreParentId) {
        this.musicGenreParentId = musicGenreParentId;
    }

    public String getMusicGenreName() {
        return musicGenreName;
    }

    public void setMusicGenreName(String musicGenreName) {
        this.musicGenreName = musicGenreName;
    }

    public String getMusicGenreNameExtended() {
        return musicGenreNameExtended;
    }

    public void setMusicGenreNameExtended(String musicGenreNameExtended) {
        this.musicGenreNameExtended = musicGenreNameExtended;
    }

    public String getMusicGenreVanity() {
        return musicGenreVanity;
    }

    public void setMusicGenreVanity(String musicGenreVanity) {
        this.musicGenreVanity = musicGenreVanity;
    }

}
