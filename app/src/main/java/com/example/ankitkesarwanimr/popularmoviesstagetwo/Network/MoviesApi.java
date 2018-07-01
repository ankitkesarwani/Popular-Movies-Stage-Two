package com.example.ankitkesarwanimr.popularmoviesstagetwo.Network;

import com.example.ankitkesarwanimr.popularmoviesstagetwo.Model.Credits;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.Model.Movie;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.Model.MovieImages;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.Model.MovieReviews;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.Model.MovieVideos;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.Model.MoviesList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class MoviesApi {
    public interface PopularMovies {
        @GET("movie/popular")
        Call<MoviesList> getPopularMovies(@Query("page") Integer page);
    }

    public interface TopRatedMovies {
        @GET("movie/top_rated")
        Call<MoviesList> getTopRatedMovies(@Query("page") Integer page);
    }

    public interface MovieDetails {
        @GET("movie/{id}")
        Call<Movie> getMovieDetails(@Path("id") Integer id);
    }

    public interface GenreMovies {
        @GET("genre/{id}/movies")
        Call<MoviesList> getGenreMovies(@Path("id") Integer id, @Query("page") Integer page);
    }

    public interface MovieDetailVideos {
        @GET("movie/{id}/videos")
        Call<MovieVideos> getMovieVideos(@Path("id") Integer id);
    }

    public interface SimilarMovies {
        @GET("movie/{id}/similar")
        Call<MoviesList> getSimilarMovies(@Path("id") Integer id, @Query("page") Integer page);
    }

    public interface MovieDetailReviews {
        @GET("movie/{id}/reviews")
        Call<MovieReviews> getMovieReviews(@Path("id") Integer id, @Query("page") Integer page);
    }

    public interface MovieBackdropImages {
        @GET("movie/{id}/images")
        Call<MovieImages> getMovieBackdropImages(@Path("id") Integer id);
    }

    public interface MovieCredits {
        @GET("movie/{id}/credits")
        Call<Credits> getMovieCredits(@Path("id") Integer id);
    }
}
