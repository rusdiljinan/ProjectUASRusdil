package com.example.projectuas.service

import com.example.projectuas.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=bf34aa5e1b2c64c3ec9c7d3d728c815c")
    fun getMovieList(): Call<MovieResponse>

}