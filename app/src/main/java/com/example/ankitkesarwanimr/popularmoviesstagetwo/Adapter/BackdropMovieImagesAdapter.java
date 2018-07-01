package com.example.ankitkesarwanimr.popularmoviesstagetwo.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import com.example.ankitkesarwanimr.popularmoviesstagetwo.Fragment.BackdropMovieImageFragment;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.Model.MovieImage;

import java.util.ArrayList;

public class BackdropMovieImagesAdapter extends FragmentStatePagerAdapter {
    private ArrayList<MovieImage> movieImages = new ArrayList<>();

    public BackdropMovieImagesAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public void addMovieImages(ArrayList<MovieImage> movieImages) {
        this.movieImages.clear();
        this.movieImages.addAll(movieImages);
    }

    @Override
    public Fragment getItem(int position) {
        return BackdropMovieImageFragment.getInstance(movieImages.get(position).getFilePath());
    }

    @Override
    public int getCount() {
        return movieImages.size();
    }

    @Override
    public int getItemPosition(Object object) {
        /*
        Dynamically update fragments in ViewPager.
         */
        return POSITION_NONE;
    }
}
