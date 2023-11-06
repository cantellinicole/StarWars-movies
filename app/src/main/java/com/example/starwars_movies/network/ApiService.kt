package com.example.starwars_movies.network

import com.example.starwars_movies.feature.data.response.MoviesResponse
import retrofit2.http.GET

internal interface ApiService {

    @GET("/dc12046175d1c54574fb")
    suspend fun getMovies() : Result<List<MoviesResponse>>

}