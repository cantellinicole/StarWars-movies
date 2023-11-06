package com.example.starwars_movies.feature.domain.usecase

import com.example.starwars_movies.feature.domain.model.Movies
import com.example.starwars_movies.feature.domain.repository.MoviesRepository

internal class GetMoviesUseCase(private val repository: MoviesRepository) {
     suspend fun getMovies() : Result<List<Movies>>{
        return repository.getMovies()
    }
}