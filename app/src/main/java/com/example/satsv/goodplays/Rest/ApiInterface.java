package com.example.satsv.goodplays.Rest;

import com.example.satsv.goodplays.Artistmodel.ArtistSList;
import com.example.satsv.goodplays.Model.SongList;
import com.example.satsv.goodplays.lyricmodel.Lyrik;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    //To get popular tracks
    @GET("chart.tracks.get")
    Call<SongList> getTrackList(@Query("page_size") int size, @Query("apikey") String apiKey);

    //To get top artists
    @GET("chart.artists.get")
    Call<ArtistSList> getTopArtists(@Query("page_size") int size , @Query("apikey") String apiKey);

    @GET("track.search")
    Call<SongList> searchTrack(@Query("page_size") int size, @Query("s_track_rating") String sort , @Query("q_track") String id , @Query("apikey") String apiKey);

    @GET("track.lyrics.get")
    Call<Lyrik> getTrackLyrics(@Query("track_id") String id , @Query("apikey") String apiKey);

    @GET("artist.search")
    Call<ArtistSList> searchArtist(@Query("page_size") int size, @Query("s_artist_rating") String sort , @Query("q_artist") String trackname , @Query("apikey") String apiKey);

}