package com.example.starwars_movies.feature.presentation.viewmodel

import com.example.starwars_movies.feature.data.repository.MoviesFake
import com.example.starwars_movies.feature.domain.usecase.GetMoviesUseCase
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals

@ExperimentalCoroutinesApi
internal class MoviesViewModelTest {

    private val useCase : GetMoviesUseCase = mockk()
    private val viewModel = MoviesViewModel(useCase)

    @Test
    fun whenApiReturnsSucessShouldGetMoviesList() = runTest {
        coEvery {
            useCase.getMovies()
        } returns Result.success(MoviesFake.getMovies())

        viewModel.getMovies()

        assertEquals(
            expected = MoviesFake.getMovies(),
            actual = viewModel.moviesViewState.value.movies
        )
    }
}