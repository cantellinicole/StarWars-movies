package com.example.starwars_movies.feature.data.datasource

import com.example.starwars_movies.feature.data.response.MoviesResponse

internal interface MoviesDataSource {
    suspend fun getMovies() : MoviesResponse
}