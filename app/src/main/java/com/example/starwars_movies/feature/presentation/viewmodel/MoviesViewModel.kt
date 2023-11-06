package com.example.starwars_movies.feature.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.starwars_movies.feature.domain.model.Movies
import com.example.starwars_movies.feature.domain.usecase.GetMoviesUseCase
import com.example.starwars_movies.feature.presentation.viewState.MoviesViewState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

internal class MoviesViewModel(
    private val getMoviesUseCase: GetMoviesUseCase
) : ViewModel() {

    private val _moviesViewState = MutableStateFlow(MoviesViewState(isLoading = true))
    val moviesViewState = _moviesViewState.asStateFlow()

    init {
        getMovies()
    }

    private fun getMovies() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = getMoviesUseCase.getMovies()
            result
                .onSuccess {data->  updateSuccess(data) }
                .onFailure { showError() }
        }
    }

    private fun updateSuccess(movies: List<Movies>) {
        _moviesViewState.update{
            it.copy(
                isLoading = false,
                movies = movies
            )
        }
    }

    private fun showError() {
        _moviesViewState.update {
            it.copy(
                isFailure = true,
                isLoading = false
            )
        }
    }

}