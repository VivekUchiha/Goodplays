package com.example.satsv.goodplays.Activity;

import android.arch.persistence.room.Room;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.satsv.goodplays.Adapter.songAdapter;
import com.example.satsv.goodplays.Adapter.songFavAdapter;
import com.example.satsv.goodplays.Model.SongList;
import com.example.satsv.goodplays.Model.TrackList;
import com.example.satsv.goodplays.R;
import com.example.satsv.goodplays.Rest.ApiClient;
import com.example.satsv.goodplays.Rest.ApiInterface;
import com.example.satsv.goodplays.db.Appdatabase;
import com.example.satsv.goodplays.db.songdb;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();


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

        final ApiInterface apiService =
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

        FloatingActionButton fab1= (FloatingActionButton)findViewById(R.id.floatingActionButton2);
        FloatingActionButton fab2= (FloatingActionButton)findViewById(R.id.floatingActionButton4);
        FloatingActionButton fab3= (FloatingActionButton)findViewById(R.id.floatingActionButton5);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText taskEditText = new EditText(MainActivity.this);
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Search for a Track")
                        .setView(taskEditText)
                        .setPositiveButton("Search", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String task = String.valueOf(taskEditText.getText());
                                Call<SongList> call = apiService.searchTrack(20, "DESC", task, API_KEY);
                                call.enqueue(new Callback<SongList>() {
                                    @Override
                                    public void onResponse(Call<SongList> call, Response<SongList> response) {
                                        List<TrackList> SONG = response.body().getMessage().getBody().getTrackList();
                                        recyclerView.setAdapter(new songAdapter(SONG, R.layout.song, getApplicationContext()));

                                    }

                                    @Override
                                    public void onFailure(Call<SongList> call, Throwable t) {
                                        Log.d(TAG, "onFailure: failz");

                                    }
                                });
                            }

                        }).setNegativeButton("Cancel", null)
                        .create();
                dialog.show();
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(intent);
            }
        });

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Appdatabase db = Room.databaseBuilder(getApplicationContext(),
                        Appdatabase.class, "mydb").allowMainThreadQueries().build();
                List<songdb> SONG = db.Songdbdao().getAll();
                recyclerView.setAdapter(new songFavAdapter(SONG, R.layout.song,getApplicationContext()));

            }
        });




                                            }


}


