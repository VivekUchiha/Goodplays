
package com.example.satsv.goodplays.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Track {

    @SerializedName("track_id")
    @Expose
    private int trackId;
    @SerializedName("track_mbid")
    @Expose
    private String trackMbid;
    @SerializedName("track_isrc")
    @Expose
    private String trackIsrc;
    @SerializedName("track_spotify_id")
    @Expose
    private String trackSpotifyId;
    @SerializedName("track_soundcloud_id")
    @Expose
    private String trackSoundcloudId;
    @SerializedName("track_xboxmusic_id")
    @Expose
    private String trackXboxmusicId;
    @SerializedName("track_name")
    @Expose
    private String trackName;
    @SerializedName("track_name_translation_list")
    @Expose
    private List<Object> trackNameTranslationList = null;
    @SerializedName("track_rating")
    @Expose
    private int trackRating;
    @SerializedName("track_length")
    @Expose
    private int trackLength;
    @SerializedName("commontrack_id")
    @Expose
    private int commontrackId;
    @SerializedName("instrumental")
    @Expose
    private int instrumental;
    @SerializedName("explicit")
    @Expose
    private int explicit;
    @SerializedName("has_lyrics")
    @Expose
    private int hasLyrics;
    @SerializedName("has_lyrics_crowd")
    @Expose
    private int hasLyricsCrowd;
    @SerializedName("has_subtitles")
    @Expose
    private int hasSubtitles;
    @SerializedName("has_richsync")
    @Expose
    private int hasRichsync;
    @SerializedName("num_favourite")
    @Expose
    private int numFavourite;
    @SerializedName("lyrics_id")
    @Expose
    private int lyricsId;
    @SerializedName("subtitle_id")
    @Expose
    private int subtitleId;
    @SerializedName("album_id")
    @Expose
    private int albumId;
    @SerializedName("album_name")
    @Expose
    private String albumName;
    @SerializedName("artist_id")
    @Expose
    private int artistId;
    @SerializedName("artist_mbid")
    @Expose
    private String artistMbid;
    @SerializedName("artist_name")
    @Expose
    private String artistName;
    @SerializedName("album_coverart_100x100")
    @Expose
    private String albumCoverart100x100;
    @SerializedName("album_coverart_350x350")
    @Expose
    private String albumCoverart350x350;
    @SerializedName("album_coverart_500x500")
    @Expose
    private String albumCoverart500x500;
    @SerializedName("album_coverart_800x800")
    @Expose
    private String albumCoverart800x800;
    @SerializedName("track_share_url")
    @Expose
    private String trackShareUrl;
    @SerializedName("track_edit_url")
    @Expose
    private String trackEditUrl;
    @SerializedName("commontrack_vanity_id")
    @Expose
    private String commontrackVanityId;
    @SerializedName("restricted")
    @Expose
    private int restricted;
    @SerializedName("first_release_date")
    @Expose
    private String firstReleaseDate;
    @SerializedName("updated_time")
    @Expose
    private String updatedTime;
    @SerializedName("primary_genres")
    @Expose
    private PrimaryGenres primaryGenres;
    @SerializedName("secondary_genres")
    @Expose
    private SecondaryGenres secondaryGenres;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Track() {
    }

    /**
     * 
     * @param firstReleaseDate
     * @param hasLyrics
     * @param trackXboxmusicId
     * @param albumCoverart500x500
     * @param artistMbid
     * @param trackName
     * @param secondaryGenres
     * @param lyricsId
     * @param artistId
     * @param trackSpotifyId
     * @param trackEditUrl
     * @param albumCoverart800x800
     * @param updatedTime
     * @param albumCoverart350x350
     * @param trackNameTranslationList
     * @param albumCoverart100x100
     * @param trackId
     * @param albumName
     * @param albumId
     * @param restricted
     * @param trackMbid
     * @param trackSoundcloudId
     * @param hasRichsync
     * @param trackRating
     * @param hasLyricsCrowd
     * @param subtitleId
     * @param trackIsrc
     * @param hasSubtitles
     * @param explicit
     * @param instrumental
     * @param primaryGenres
     * @param commontrackVanityId
     * @param artistName
     * @param numFavourite
     * @param trackShareUrl
     * @param commontrackId
     * @param trackLength
     */
    public Track(int trackId, String trackMbid, String trackIsrc, String trackSpotifyId, String trackSoundcloudId, String trackXboxmusicId, String trackName, List<Object> trackNameTranslationList, int trackRating, int trackLength, int commontrackId, int instrumental, int explicit, int hasLyrics, int hasLyricsCrowd, int hasSubtitles, int hasRichsync, int numFavourite, int lyricsId, int subtitleId, int albumId, String albumName, int artistId, String artistMbid, String artistName, String albumCoverart100x100, String albumCoverart350x350, String albumCoverart500x500, String albumCoverart800x800, String trackShareUrl, String trackEditUrl, String commontrackVanityId, int restricted, String firstReleaseDate, String updatedTime, PrimaryGenres primaryGenres, SecondaryGenres secondaryGenres) {
        super();
        this.trackId = trackId;
        this.trackMbid = trackMbid;
        this.trackIsrc = trackIsrc;
        this.trackSpotifyId = trackSpotifyId;
        this.trackSoundcloudId = trackSoundcloudId;
        this.trackXboxmusicId = trackXboxmusicId;
        this.trackName = trackName;
        this.trackNameTranslationList = trackNameTranslationList;
        this.trackRating = trackRating;
        this.trackLength = trackLength;
        this.commontrackId = commontrackId;
        this.instrumental = instrumental;
        this.explicit = explicit;
        this.hasLyrics = hasLyrics;
        this.hasLyricsCrowd = hasLyricsCrowd;
        this.hasSubtitles = hasSubtitles;
        this.hasRichsync = hasRichsync;
        this.numFavourite = numFavourite;
        this.lyricsId = lyricsId;
        this.subtitleId = subtitleId;
        this.albumId = albumId;
        this.albumName = albumName;
        this.artistId = artistId;
        this.artistMbid = artistMbid;
        this.artistName = artistName;
        this.albumCoverart100x100 = albumCoverart100x100;
        this.albumCoverart350x350 = albumCoverart350x350;
        this.albumCoverart500x500 = albumCoverart500x500;
        this.albumCoverart800x800 = albumCoverart800x800;
        this.trackShareUrl = trackShareUrl;
        this.trackEditUrl = trackEditUrl;
        this.commontrackVanityId = commontrackVanityId;
        this.restricted = restricted;
        this.firstReleaseDate = firstReleaseDate;
        this.updatedTime = updatedTime;
        this.primaryGenres = primaryGenres;
        this.secondaryGenres = secondaryGenres;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackMbid() {
        return trackMbid;
    }

    public void setTrackMbid(String trackMbid) {
        this.trackMbid = trackMbid;
    }

    public String getTrackIsrc() {
        return trackIsrc;
    }

    public void setTrackIsrc(String trackIsrc) {
        this.trackIsrc = trackIsrc;
    }

    public String getTrackSpotifyId() {
        return trackSpotifyId;
    }

    public void setTrackSpotifyId(String trackSpotifyId) {
        this.trackSpotifyId = trackSpotifyId;
    }

    public String getTrackSoundcloudId() {
        return trackSoundcloudId;
    }

    public void setTrackSoundcloudId(String trackSoundcloudId) {
        this.trackSoundcloudId = trackSoundcloudId;
    }

    public String getTrackXboxmusicId() {
        return trackXboxmusicId;
    }

    public void setTrackXboxmusicId(String trackXboxmusicId) {
        this.trackXboxmusicId = trackXboxmusicId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public List<Object> getTrackNameTranslationList() {
        return trackNameTranslationList;
    }

    public void setTrackNameTranslationList(List<Object> trackNameTranslationList) {
        this.trackNameTranslationList = trackNameTranslationList;
    }

    public int getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(int trackRating) {
        this.trackRating = trackRating;
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public int getCommontrackId() {
        return commontrackId;
    }

    public void setCommontrackId(int commontrackId) {
        this.commontrackId = commontrackId;
    }

    public int getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(int instrumental) {
        this.instrumental = instrumental;
    }

    public int getExplicit() {
        return explicit;
    }

    public void setExplicit(int explicit) {
        this.explicit = explicit;
    }

    public int getHasLyrics() {
        return hasLyrics;
    }

    public void setHasLyrics(int hasLyrics) {
        this.hasLyrics = hasLyrics;
    }

    public int getHasLyricsCrowd() {
        return hasLyricsCrowd;
    }

    public void setHasLyricsCrowd(int hasLyricsCrowd) {
        this.hasLyricsCrowd = hasLyricsCrowd;
    }

    public int getHasSubtitles() {
        return hasSubtitles;
    }

    public void setHasSubtitles(int hasSubtitles) {
        this.hasSubtitles = hasSubtitles;
    }

    public int getHasRichsync() {
        return hasRichsync;
    }

    public void setHasRichsync(int hasRichsync) {
        this.hasRichsync = hasRichsync;
    }

    public int getNumFavourite() {
        return numFavourite;
    }

    public void setNumFavourite(int numFavourite) {
        this.numFavourite = numFavourite;
    }

    public int getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(int lyricsId) {
        this.lyricsId = lyricsId;
    }

    public int getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(int subtitleId) {
        this.subtitleId = subtitleId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getArtistMbid() {
        return artistMbid;
    }

    public void setArtistMbid(String artistMbid) {
        this.artistMbid = artistMbid;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumCoverart100x100() {
        return albumCoverart100x100;
    }

    public void setAlbumCoverart100x100(String albumCoverart100x100) {
        this.albumCoverart100x100 = albumCoverart100x100;
    }

    public String getAlbumCoverart350x350() {
        return albumCoverart350x350;
    }

    public void setAlbumCoverart350x350(String albumCoverart350x350) {
        this.albumCoverart350x350 = albumCoverart350x350;
    }

    public String getAlbumCoverart500x500() {
        return albumCoverart500x500;
    }

    public void setAlbumCoverart500x500(String albumCoverart500x500) {
        this.albumCoverart500x500 = albumCoverart500x500;
    }

    public String getAlbumCoverart800x800() {
        return albumCoverart800x800;
    }

    public void setAlbumCoverart800x800(String albumCoverart800x800) {
        this.albumCoverart800x800 = albumCoverart800x800;
    }

    public String getTrackShareUrl() {
        return trackShareUrl;
    }

    public void setTrackShareUrl(String trackShareUrl) {
        this.trackShareUrl = trackShareUrl;
    }

    public String getTrackEditUrl() {
        return trackEditUrl;
    }

    public void setTrackEditUrl(String trackEditUrl) {
        this.trackEditUrl = trackEditUrl;
    }

    public String getCommontrackVanityId() {
        return commontrackVanityId;
    }

    public void setCommontrackVanityId(String commontrackVanityId) {
        this.commontrackVanityId = commontrackVanityId;
    }

    public int getRestricted() {
        return restricted;
    }

    public void setRestricted(int restricted) {
        this.restricted = restricted;
    }

    public String getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(String firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public PrimaryGenres getPrimaryGenres() {
        return primaryGenres;
    }

    public void setPrimaryGenres(PrimaryGenres primaryGenres) {
        this.primaryGenres = primaryGenres;
    }

    public SecondaryGenres getSecondaryGenres() {
        return secondaryGenres;
    }

    public void setSecondaryGenres(SecondaryGenres secondaryGenres) {
        this.secondaryGenres = secondaryGenres;
    }

}
