package com.example.satsv.goodplays.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.satsv.goodplays.R;

public class artistAdapter extends RecyclerView.Adapter<artistAdapter.artistViewHolder> {


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

    @Override
    public artistAdapter.artistViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new artistViewHolder(view);
    }
    @Override
    public void onBindViewHolder(artistViewHolder holder, final int position) {


    }
    @Override
    public int getItemCount() {
        return 0;
    }

}
