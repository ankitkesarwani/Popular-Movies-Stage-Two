package com.example.ankitkesarwanimr.popularmoviesstagetwo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Ankit Kesarwani on 23/6/18.
 */
public class Credits {
    @Expose
    @SerializedName("id")
    private int id;

    @Expose
    @SerializedName("cast")
    private ArrayList<Cast> cast;

    @Expose
    @SerializedName("crew")
    private ArrayList<Crew> crew;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Cast> getCast() {
        return cast;
    }

    public void setCast(ArrayList<Cast> cast) {
        this.cast = cast;
    }

    public ArrayList<Crew> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<Crew> crew) {
        this.crew = crew;
    }
}
