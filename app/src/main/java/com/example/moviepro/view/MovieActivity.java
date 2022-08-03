package com.example.moviepro.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import com.example.moviepro.R;
import com.example.moviepro.databinding.ActivityMovieBinding;
import com.example.moviepro.model.Movie;

public class MovieActivity extends AppCompatActivity {
    private Movie movie;
private ActivityMovieBinding activityMovieBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        activityMovieBinding = DataBindingUtil.setContentView(this, R.layout.activity_movie);

        Intent i = getIntent();

        if(i.hasExtra("movie")){
             movie = getIntent().getParcelableExtra("movie");
             activityMovieBinding.setMovie(movie);
             getSupportActionBar().setTitle(movie.getTitle());
        }

    }
}