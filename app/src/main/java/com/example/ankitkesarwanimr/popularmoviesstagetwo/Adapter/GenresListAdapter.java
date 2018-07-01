package com.example.ankitkesarwanimr.popularmoviesstagetwo.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ankitkesarwanimr.popularmoviesstagetwo.Fragment.MovieDetailFragment;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.Model.Genre;

import java.util.ArrayList;

public class GenresListAdapter extends RecyclerView.Adapter<GenresListAdapter.ViewHolder> {
    private ArrayList<Genre> genres;
    private OnGenreClickListener listener;

    public GenresListAdapter(MovieDetailFragment fragment) {
        this.listener = (OnGenreClickListener) fragment;
        this.genres = new ArrayList<>();
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres.addAll(genres);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView textView = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item_genre, parent, false);
        final ViewHolder viewHolder = new ViewHolder(textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onGenreClick(genres.get(viewHolder.getAdapterPosition()));
                }
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(genres.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return genres.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ViewHolder(TextView textView) {
            super(textView);
            this.textView = textView;
        }
    }

    public interface OnGenreClickListener {
        void onGenreClick(Genre genre);
    }
}
