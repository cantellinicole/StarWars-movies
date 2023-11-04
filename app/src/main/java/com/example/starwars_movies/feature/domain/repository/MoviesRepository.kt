package com.example.starwars_movies.feature.domain.repository

import com.example.starwars_movies.feature.domain.model.Movies

interface MoviesRepository {
    suspend fun getMovies() : Result<List<Movies>>
}