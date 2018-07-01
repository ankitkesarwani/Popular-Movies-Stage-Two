package com.example.ankitkesarwanimr.popularmoviesstagetwo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ankitkesarwanimr.popularmoviesstagetwo.Fragment.AboutMovieFragment;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.Fragment.MovieDetailFragment;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.Fragment.MovieReviewsFragment;

import java.util.List;

public class MovieDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        Intent intent = getIntent();
        if (intent == null) {
            finish();
        }

        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (int i = 0, l = fragments.size(); i < l; i++) {
                Fragment fragment = fragments.get(i);
                if (fragment instanceof MovieDetailFragment
                        || fragment instanceof AboutMovieFragment
                        || fragment instanceof MovieReviewsFragment) {
                    return;
                }
            }
        }

        MovieDetailFragment movieDetailFragment = new MovieDetailFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_movie_detail, movieDetailFragment)
                .commit();
    }
}
