package com.example.starwars_movies.feature.domain.usecase

import com.example.starwars_movies.feature.domain.repository.MoviesRepository

internal class GetMoviesUseCase(private val repository: MoviesRepository) {
     suspend fun getMovies() {
        repository.getMovies()
    }
}