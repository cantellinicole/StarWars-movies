package com.example.starwars_movies.feature.data.repository

import com.example.starwars_movies.feature.data.datasource.MoviesDataSource
import com.example.starwars_movies.feature.data.mapper.MoviesMapper
import com.example.starwars_movies.feature.domain.model.Movies

internal class MoviesRepositoryImpl(
    private val dataSource: MoviesDataSource,
    private val mapper: MoviesMapper
) {

    suspend fun getMovies() : Result<Movies> {
        return dataSource.getMovies().map { mapper.mapFromResponse(it) }
    }
}