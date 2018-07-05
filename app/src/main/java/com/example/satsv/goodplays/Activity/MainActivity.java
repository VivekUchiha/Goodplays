package com.example.satsv.goodplays.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.satsv.goodplays.Adapter.songAdapter;
import com.example.satsv.goodplays.Model.SongList;
import com.example.satsv.goodplays.Model.TrackList;
import com.example.satsv.goodplays.R;
import com.example.satsv.goodplays.Rest.ApiClient;
import com.example.satsv.goodplays.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private final static String API_KEY = "b06e563c28eb07c2415ab5c0c54d28a9";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY first", Toast.LENGTH_LONG).show();
            return;
        }
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.songs);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        Call<SongList> call= apiService.getTrackList(20,API_KEY);
        call.enqueue(new Callback<SongList>() {
            @Override
            public void onResponse(Call<SongList> call, Response<SongList> response) {
                int statusCode = response.code();
                List<TrackList> SONG = response.body().getMessage().getBody().getTrackList();
                recyclerView.setAdapter(new songAdapter(SONG, R.layout.song,getApplicationContext()));


            }

            @Override
            public void onFailure(Call<SongList> call, Throwable t) {
            }
        });


                                            }


}


