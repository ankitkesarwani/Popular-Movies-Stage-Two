package com.example.ankitkesarwanimr.popularmoviesstagetwo.Fragment;

import android.support.v4.app.Fragment;

import com.example.ankitkesarwanimr.popularmoviesstagetwo.Helper.Constants;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.Model.MoviesList;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.Network.TmdbRestClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SimilarMoviesFragment extends MoviesListFragment {
    public static final String TAG = SimilarMoviesFragment.class.getName();
    private int id;

    public SimilarMoviesFragment() {}

    @Override
    protected void loadMovies() {
        super.loadMovies();
        Call<MoviesList> call = TmdbRestClient.getInstance()
                .getSimilarMoviesImpl()
                .getSimilarMovies(id, getPage());
        Callback<MoviesList> callback = new Callback<MoviesList>() {
            @Override
            public void onResponse(Call<MoviesList> call, Response<MoviesList> response) {
                if (!response.isSuccessful()) {
                    retrievalError(Constants.SERVER_ERROR);
                    return;
                }
                setTotalPages(response.body().getTotalPages());
                addMovies(response.body().getMovies());
            }

            @Override
            public void onFailure(Call<MoviesList> call, Throwable t) {
                retrievalError(Constants.NETWORK_ERROR);
            }
        };
        call.enqueue(callback);
    }

    public void setId(int id) {
        this.id = id;
    }
}
