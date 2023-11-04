package com.example.starwars_movies.feature.data.repository

import com.example.starwars_movies.feature.data.datasource.MoviesDataSource
import com.example.starwars_movies.feature.data.mapper.MoviesMapper
import com.example.starwars_movies.feature.domain.model.Movies
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals

@ExperimentalCoroutinesApi
class MoviesRepositoryImplTest {



    private val dataSource = mockk<MoviesDataSource>()
    private val mapper = mockk<MoviesMapper>()
    private val repository = MoviesRepositoryImpl(dataSource, mapper)

    @Test
    fun shouldTestIfMoviesReturnSuccess() = runTest {
        coEvery {
            dataSource.getMovies()
        } returns Result.success(MoviesFake.getMoviesResponse())

       // val result : List<Movies> = repository.getMovies()

        val expect : List<Movies> = MoviesFake.getMovies()

       // assertEquals(expected = expect, actual = result)
    }



}