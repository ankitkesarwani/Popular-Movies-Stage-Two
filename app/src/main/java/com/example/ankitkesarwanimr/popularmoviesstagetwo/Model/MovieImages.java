package com.example.ankitkesarwanimr.popularmoviesstagetwo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
/**
 * Created by Ankit Kesarwani on 23/6/18.
 */
public class MovieImages {
    @Expose
    @SerializedName("id")
    private int id;

    @Expose
    @SerializedName("backdrops")
    private ArrayList<MovieImage> movieImages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<MovieImage> getMovieImages() {
        return movieImages;
    }

    public void setMovieImages(ArrayList<MovieImage> movieImages) {
        this.movieImages = movieImages;
    }
}
