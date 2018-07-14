package com.example.satsv.goodplays.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.satsv.goodplays.Activity.SongActivity;
import com.example.satsv.goodplays.Model.TrackList;
import com.example.satsv.goodplays.R;
import com.example.satsv.goodplays.db.songdb;
import com.squareup.picasso.Picasso;

import java.util.List;

public class songFavAdapter extends RecyclerView.Adapter<songFavAdapter.songViewHolder> {
    private final String TAG = songFavAdapter.class.getSimpleName();
    private List<songdb> songs;
    private int rowLayout;
    private Context context;

    public static class songViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout relativeLayout;
        TextView name;
        ImageView poster;


        public songViewHolder(View v) {
            super(v);
            relativeLayout = (RelativeLayout) v.findViewById(R.id.rel);
            name = (TextView) v.findViewById(R.id.Na);
            poster=(ImageView) v.findViewById(R.id.imas);

        }
    }

    public songFavAdapter(List<songdb> songs, int rowLayout, Context context) {
        this.songs = songs;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public songFavAdapter.songViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new songViewHolder(view);
    }
    @Override
    public void onBindViewHolder(songViewHolder holder, final int position) {

        holder.name.setText(songs.get(position).getName());
        holder.poster.setImageResource(R.drawable.album);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
                                                     // title, artist, poster, album, genresList,yore,id.
                                                     @Override
                                                     public void onClick(View v) {


                                                         Intent intent = new Intent(context, SongActivity.class);
                                                         String test = (songs.get(position).getSongid());
                                                         Log.d(TAG, test);
                                                         intent.putExtra("title",songs.get(position).getName());
                                                         intent.putExtra("artist",songs.get(position).getArtist());
                                                         intent.putExtra("poster",R.drawable.album);
                                                         intent.putExtra("album",songs.get(position).getAlbum());
                                                         intent.putExtra("genreList",songs.get(position).getGenre());
                                                         intent.putExtra("yore",songs.get(position).getRelease());
                                                         intent.putExtra("id",songs.get(position).getSongid());
                                                         intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                                         context.startActivity(intent);


                                                     }
                                                 }
        );
    }
    @Override
    public int getItemCount() {
        return songs.size();
    }

}