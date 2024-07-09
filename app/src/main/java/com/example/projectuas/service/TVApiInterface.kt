package com.example.projectuas.service

import com.example.projectuas.model.TelevisionResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=bf34aa5e1b2c64c3ec9c7d3d728c815c")
    fun getTVList(): Call<TelevisionResponse>

}