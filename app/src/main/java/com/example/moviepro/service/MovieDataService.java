package com.example.moviepro.service;

import com.example.moviepro.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {


    //https://api.themoviedb.org/3/
    //
    //End Point
    // movie/popular?api_key=c95c099fec95a7c15b7decb85c65d6b4
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apikey);

}
