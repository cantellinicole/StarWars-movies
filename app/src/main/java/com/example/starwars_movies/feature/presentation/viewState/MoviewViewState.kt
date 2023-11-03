package com.example.starwars_movies.feature.presentation.viewState

import com.example.starwars_movies.feature.domain.model.Movies

internal data class MoviesViewState(
    var isLoading : Boolean = false,
    val movies : List<Movies>? = listOf(),
    val isFailure : Boolean = false
)
