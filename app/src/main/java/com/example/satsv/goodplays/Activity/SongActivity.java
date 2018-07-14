package com.example.satsv.goodplays.Activity;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.satsv.goodplays.R;
import com.example.satsv.goodplays.Rest.ApiClient;
import com.example.satsv.goodplays.Rest.ApiInterface;
import com.example.satsv.goodplays.db.Appdatabase;
import com.example.satsv.goodplays.db.songdb;
import com.example.satsv.goodplays.lyricmodel.Lyrik;
import com.squareup.picasso.Picasso;

import java.util.List;

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
        final String genreList = getIntent().getStringExtra("genreList")     ;
        final String yore = getIntent().getStringExtra("yore")     ;
        final String id = getIntent().getStringExtra("id")     ;
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        Call<Lyrik> call= apiService.getTrackLyrics(id,API_KEY);
        call.enqueue(new Callback<Lyrik>() {
            @Override
            public void onResponse(Call<Lyrik> call, Response<Lyrik> response) {
                Log.d(TAG, "onResponse: got lyrik");
                int statusCode = response.code();
                final String Lyricss=response.body().getMessage().getBody().getLyrics().getLyricsBody();
                setscreen(title,artist,poster,album,genreList,yore,Lyricss);
                ImageButton imageButton=(ImageButton)findViewById(R.id.imageButtonsong);
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Appdatabase db = Room.databaseBuilder(getApplicationContext(),
                                Appdatabase.class, "mydb").allowMainThreadQueries().build();
                        songdb Songdb = new songdb(id,title,artist,genreList,yore,album,Lyricss);
                        List<songdb> son = db.Songdbdao().getAll();
                        int f=0;
                        for (int i=0;i<son.size();i++)
                        {if(son.get(i).getSongid().equals(Songdb.getSongid()))
                            {Toast.makeText(getApplicationContext(), "Already stored",
                                        Toast.LENGTH_LONG).show();
                            f=1;
                            break;}
                            }
                            if(f==0)
                            { db.Songdbdao().insertsong(Songdb);
                                Toast.makeText(getApplicationContext(), "Added to Favourites",
                                        Toast.LENGTH_LONG).show();}

                    }
                });
                ImageButton imageButtondel=(ImageButton)findViewById(R.id.imageButtonsongdelete);
                imageButtondel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Appdatabase db = Room.databaseBuilder(getApplicationContext(),
                                Appdatabase.class, "mydb").allowMainThreadQueries().build();
                        songdb Songdb = new songdb(id,title,artist,genreList,yore,album,Lyricss);
                        List<songdb> son = db.Songdbdao().getAll();
                        int flag=0;
                        for (int i=0;i<son.size();i++) {
                            if (son.get(i).getSongid().equals( Songdb.getSongid())) {
                                flag = 1;
                                break;
                            }

                        }

                        if(flag==1){
                                db.Songdbdao().delete(Songdb);
                            Toast.makeText(getApplicationContext(), "Deleted",
                                    Toast.LENGTH_LONG).show();}


                        else Toast.makeText(getApplicationContext(), "Not in Favourites",
                                Toast.LENGTH_LONG).show();



                    }
                });

            }

            @Override
            public void onFailure(Call<Lyrik> call, Throwable t) {
                Log.d(TAG, "onFailure: failed lyrikc");
                setscreen(title,artist,poster,album,genreList,yore,"");
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
        t5.setText("Release :"+yore.substring(0,10));
        t6.setText(Lyricss);
        t6.setMovementMethod(new ScrollingMovementMethod());



    }
    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplicationContext().startActivity(intent);
    }


}
