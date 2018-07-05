package com.example.satsv.goodplays.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.satsv.goodplays.R;
import com.example.satsv.goodplays.Rest.ApiClient;
import com.example.satsv.goodplays.Rest.ApiInterface;
import com.example.satsv.goodplays.lyricmodel.Lyrik;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SongActivity extends AppCompatActivity {
    private final String TAG = SongActivity.class.getSimpleName();
    private final static String API_KEY = "b06e563c28eb07c2415ab5c0c54d28a9";

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songactivity);
        //title, artist, poster, album, genresList,yore,id.
        getIntentData();

    }

    private void getIntentData(){
        final String title = getIntent().getStringExtra("title")     ;
        final String artist = getIntent().getStringExtra("artist")     ;
        final String poster = getIntent().getStringExtra("poster")     ;
        final String album = getIntent().getStringExtra("album")     ;
        final String genreList = getIntent().getStringExtra("genresList")     ;
        final String yore = getIntent().getStringExtra("yore")     ;
        String id = getIntent().getStringExtra("id")     ;
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        Call<Lyrik> call= apiService.getTrackLyrics(id,API_KEY);
        call.enqueue(new Callback<Lyrik>() {
            @Override
            public void onResponse(Call<Lyrik> call, Response<Lyrik> response) {
                Log.d(TAG, "onResponse: got lyrik");
                int statusCode = response.code();
                String Lyricss=response.body().getMessage().getBody().getLyrics().getLyricsBody();
                setscreen(title,artist,poster,album,genreList,yore,Lyricss);
                }

            @Override
            public void onFailure(Call<Lyrik> call, Throwable t) {
                Log.d(TAG, "onFailure: failed lyrikc");

            }
        });

    }
    private void setscreen(String title,String artist,String poster,String album,String genreList,String yore,String Lyricss){
        TextView t1 = (TextView)findViewById(R.id.textView2);
        TextView t2 = (TextView)findViewById(R.id.textView3);
        TextView t3 = (TextView)findViewById(R.id.textView4);
        TextView t4 = (TextView)findViewById(R.id.textView5);
        TextView t5 = (TextView)findViewById(R.id.textView6);
        TextView t6 = (TextView)findViewById(R.id.textView7);
        ImageView imageView = (ImageView)findViewById(R.id.pik);


        Picasso.get().load(poster).into(imageView);

        t1.setText("Name : "+title);
        t2.setText("Artist : "+artist);
        t3.setText("Album : "+album);
        t4.setText("Genre : "+genreList);
        t5.setText("Release :"+yore);
        t6.setText(Lyricss);
        t6.setMovementMethod(new ScrollingMovementMethod());



    }


}
