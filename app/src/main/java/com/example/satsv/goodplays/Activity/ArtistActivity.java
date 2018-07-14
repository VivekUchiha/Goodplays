package com.example.satsv.goodplays.Activity;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.satsv.goodplays.R;
import com.example.satsv.goodplays.db.Appdatabase;
import com.example.satsv.goodplays.db.Appdatabaseartist;
import com.example.satsv.goodplays.db.artistdb;
import com.example.satsv.goodplays.db.songdb;

import java.util.List;

public class ArtistActivity extends AppCompatActivity {
    private final String TAG = ArtistActivity.class.getSimpleName();
    private final static String API_KEY = "b06e563c28eb07c2415ab5c0c54d28a9";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artistactivity);
        getIntentData();


    }


    private void getIntentData() {
        final String name = getIntent().getStringExtra("name");
        final String twitter = getIntent().getStringExtra("twitter");
        final String genres = getIntent().getStringExtra("genres");
        final String rating = getIntent().getStringExtra("rating");
        final String alias = getIntent().getStringExtra("alias");
        final String id = getIntent().getStringExtra("id");


        TextView t1 = (TextView) findViewById(R.id.name);
        TextView t2 = (TextView) findViewById(R.id.twitter);
        TextView t3 = (TextView) findViewById(R.id.genres);
        TextView t4 = (TextView) findViewById(R.id.rating);
        TextView t5 = (TextView) findViewById(R.id.alias);


        t1.setText("Name : " + name);
        t2.setText("Twitter : " + twitter);      //String id, String twitter, String genres, String name, String rating, String alias
        t3.setText("Genres : " + genres);
        t4.setText("Rating : " + rating);
        t5.setText("alias :" + alias);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButtonartist);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Appdatabaseartist db1 = Room.databaseBuilder(getApplicationContext(),
                        Appdatabaseartist.class, "mydb1").allowMainThreadQueries().build();
                artistdb Artistdb = new artistdb(id, twitter, genres, name, rating, alias);
                List<artistdb> art = db1.Artistdbdao().getAll();
                int f = 0;
                for (int i = 0; i < art.size(); i++) {
                    if (art.get(i).getId().equals(Artistdb.getId())) {
                        Toast.makeText(getApplicationContext(), "Already stored",
                                Toast.LENGTH_LONG).show();
                        f = 1;
                        break;
                    }
                }
                if (f == 0) {
                    db1.Artistdbdao().insertsong(Artistdb);
                    Toast.makeText(getApplicationContext(), "Added to Favourites",
                            Toast.LENGTH_LONG).show();
                }


            }


        });
        ImageButton imageButtondel1=(ImageButton)findViewById(R.id.imageButtondelart);
        imageButtondel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Appdatabaseartist db1 = Room.databaseBuilder(getApplicationContext(),
                        Appdatabaseartist.class, "mydb1").allowMainThreadQueries().build();
                artistdb Artistdb = new artistdb(id, twitter, genres, name, rating, alias);
                List<artistdb> art = db1.Artistdbdao().getAll();
                int flag=0;
                for (int i=0;i<art.size();i++) {
                    if (art.get(i).getId().equals( Artistdb.getId())) {
                        flag = 1;
                        break;
                    }

                }

                if(flag==1){
                    db1.Artistdbdao().delete(Artistdb);
                    Toast.makeText(getApplicationContext(), "Deleted",
                            Toast.LENGTH_LONG).show();}


                else Toast.makeText(getApplicationContext(), "Not in Favourites",
                        Toast.LENGTH_LONG).show();



            }
        });
    }
    public void onBackPressed()
    {
        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplicationContext().startActivity(intent);
    }
}