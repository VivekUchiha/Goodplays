package com.example.satsv.goodplays.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.satsv.goodplays.Activity.ArtistActivity;
import com.example.satsv.goodplays.Artistmodel.ArtistList;
import com.example.satsv.goodplays.R;

import java.util.List;

public class artistAdapter extends RecyclerView.Adapter<artistAdapter.artistViewHolder> {
    private final String TAG = songAdapter.class.getSimpleName();
    private List<ArtistList> artists;
    private int rowLayout;
    private Context context;

    public static class artistViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout relativeLayout;
        TextView name;


        public artistViewHolder(View v) {
            super(v);
            relativeLayout = (RelativeLayout) v.findViewById(R.id.he);
            name = (TextView) v.findViewById(R.id.artz);

        }
    }

    public artistAdapter(List<ArtistList> artists, int rowLayout, Context context) {
        this.artists = artists;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public artistAdapter.artistViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new artistViewHolder(view);
    }
    @Override
    public void onBindViewHolder(artistViewHolder holder, final int position) {


        holder.name.setText(artists.get(position).getArtist().getArtistName());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
                                                     // title, artist, poster, album, genresList,yore,id.
                                                     @Override
                                                     public void onClick(View v) {
//name, age, genres, and rating.

                                                         Intent intent = new Intent(context, ArtistActivity.class);
                                                         String test = (artists.get(position).getArtist().getArtistName());
                                                         Log.d(TAG, test);
                                                         intent.putExtra("name",artists.get(position).getArtist().getArtistName());
                                                         intent.putExtra("twitter",artists.get(position).getArtist().getArtistTwitterUrl());
                                                         if(artists.get(position).getArtist().getPrimaryGenres().getMusicGenreList().size()!=0)
                                                         intent.putExtra("genres",artists.get(position).getArtist().getPrimaryGenres().getMusicGenreList().get(0).getMusicGenre().getMusicGenreName());
                                                         else intent.putExtra("genres","NA");
                                                         intent.putExtra("rating",Integer.toString(artists.get(position).getArtist().getArtistRating()));
                                                         if(artists.get(position).getArtist().getArtistAliasList().size()!=0)
                                                         intent.putExtra("alias",artists.get(position).getArtist().getArtistAliasList().get(0).getArtistAlias());
                                                         else intent.putExtra("alias","NA");
                                                         intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                                         context.startActivity(intent);


                                                     }
                                                 }
        );
    }
    @Override
    public int getItemCount() {
        return artists.size();
    }

}
