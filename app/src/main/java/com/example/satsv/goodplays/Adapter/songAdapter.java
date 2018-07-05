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
import com.squareup.picasso.Picasso;

import java.util.List;

public class songAdapter extends RecyclerView.Adapter<songAdapter.songViewHolder> {
    private final String TAG = songAdapter.class.getSimpleName();
    private List<TrackList> songs;
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

    public songAdapter(List<TrackList> songs, int rowLayout, Context context) {
        this.songs = songs;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public songAdapter.songViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new songViewHolder(view);
    }
    @Override
    public void onBindViewHolder(songViewHolder holder, final int position) {
        String pat=songs.get(position).getTrack().getAlbumCoverart100x100();

        holder.name.setText(songs.get(position).getTrack().getTrackName());
        Picasso.get().load(pat).into(holder.poster);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            // title, artist, poster, album, genresList,yore,id.
                                                     @Override
                                                     public void onClick(View v) {


                                                         Intent intent = new Intent(context, SongActivity.class);
                                                         String test = Integer.toString(songs.get(position).getTrack().getTrackId());
                                                         Log.d(TAG, test);
                                                         intent.putExtra("title",songs.get(position).getTrack().getTrackName());
                                                         intent.putExtra("artist",songs.get(position).getTrack().getArtistName());
                                                         intent.putExtra("poster",songs.get(position).getTrack().getAlbumCoverart100x100());
                                                         intent.putExtra("album",songs.get(position).getTrack().getAlbumName());
                                                         if (songs.get(position).getTrack().getPrimaryGenres().getMusicGenreList().size()!=0)
                                                         intent.putExtra("genreList",songs.get(position).getTrack().getPrimaryGenres().getMusicGenreList().get(0).getMusicGenre().getMusicGenreName());
                                                         else intent.putExtra("genreList","NA");
                                                         intent.putExtra("yore",songs.get(position).getTrack().getFirstReleaseDate());
                                                         intent.putExtra("id",Integer.toString(songs.get(position).getTrack().getTrackId()));
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
