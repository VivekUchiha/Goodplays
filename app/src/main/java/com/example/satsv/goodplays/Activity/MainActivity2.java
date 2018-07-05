package com.example.satsv.goodplays.Activity;

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

import com.example.satsv.goodplays.Adapter.artistAdapter;
import com.example.satsv.goodplays.Artistmodel.ArtistList;
import com.example.satsv.goodplays.Artistmodel.ArtistSList;
import com.example.satsv.goodplays.R;
import com.example.satsv.goodplays.Rest.ApiClient;
import com.example.satsv.goodplays.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity2 extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();


    private final static String API_KEY = "b06e563c28eb07c2415ab5c0c54d28a9";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY first", Toast.LENGTH_LONG).show();
            return;
        }
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.artists);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        Call<ArtistSList> call= apiService.getTopArtists(20,API_KEY);
        call.enqueue(new Callback<ArtistSList>() {
            @Override
            public void onResponse(Call<ArtistSList> call, Response<ArtistSList> response) {
                int statusCode = response.code();
                List<ArtistList> ARTIST = response.body().getMessage().getBody().getArtistList();
                recyclerView.setAdapter(new artistAdapter(ARTIST, R.layout.artist,getApplicationContext()));


            }

            @Override
            public void onFailure(Call<ArtistSList> call, Throwable t) {
                Log.d(TAG, "onFailure: failzactivityartist");
            }
        });

        FloatingActionButton fab1= (FloatingActionButton)findViewById(R.id.floatingActionButton1);
        FloatingActionButton fab2= (FloatingActionButton)findViewById(R.id.floatingActionButton3);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText taskEditText = new EditText(MainActivity2.this);
                AlertDialog dialog = new AlertDialog.Builder(MainActivity2.this)
                        .setTitle("Search for a Artist")
                        .setView(taskEditText)
                        .setPositiveButton("Search", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String task = String.valueOf(taskEditText.getText());
                                Call<ArtistSList> call = apiService.searchArtist(20, "DESC", task, API_KEY);
                                call.enqueue(new Callback<ArtistSList>() {
                                    @Override
                                    public void onResponse(Call<ArtistSList> call, Response<ArtistSList> response) {
                                        List<ArtistList> ARTISTS = response.body().getMessage().getBody().getArtistList();
                                        recyclerView.setAdapter(new artistAdapter(ARTISTS, R.layout.artist, getApplicationContext()));

                                    }

                                    @Override
                                    public void onFailure(Call<ArtistSList> call, Throwable t) {
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

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(intent);
            }
        });


    }


}
