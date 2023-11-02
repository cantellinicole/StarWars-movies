package com.example.starwars_movies.feature.data.datasource

import com.example.starwars_movies.feature.data.response.MoviesResponse
import com.example.starwars_movies.network.ApiService

internal class MoviesDataSourceImpl(
    private val apiService: ApiService
) : MoviesDataSource {
    override suspend fun getMovies() : Result<MoviesResponse> {
        return apiService.getMovies()
    }

}