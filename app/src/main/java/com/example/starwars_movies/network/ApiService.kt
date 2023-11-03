package com.example.starwars_movies.network

import com.example.starwars_movies.feature.data.response.MoviesResponse
import retrofit2.http.GET

internal interface ApiService {

    @GET("movies")
    suspend fun getMovies() : Result<List<MoviesResponse>>


}