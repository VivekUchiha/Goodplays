package com.example.satsv.goodplays.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.satsv.goodplays.R;

public class ArtistActivity extends AppCompatActivity {
    private final String TAG = ArtistActivity.class.getSimpleName();
    private final static String API_KEY = "b06e563c28eb07c2415ab5c0c54d28a9";

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artistactivity);
        getIntentData();

    }

    private void getIntentData(){
        final String name = getIntent().getStringExtra("name")     ;
        final String twitter = getIntent().getStringExtra("twitter")     ;
        final String genres = getIntent().getStringExtra("genres")     ;
        final String rating = getIntent().getStringExtra("rating")     ;
        final String alias = getIntent().getStringExtra("alias")     ;


        TextView t1 = (TextView)findViewById(R.id.name);
        TextView t2 = (TextView)findViewById(R.id.twitter);
        TextView t3 = (TextView)findViewById(R.id.genres);
        TextView t4 = (TextView)findViewById(R.id.rating);
        TextView t5 = (TextView)findViewById(R.id.alias);




        t1.setText("Name : "+name);
        t2.setText("Twitter : "+twitter);
        t3.setText("Genres : "+genres);
        t4.setText("Rating : "+rating);
        t5.setText("alias :"+alias);


        }


}