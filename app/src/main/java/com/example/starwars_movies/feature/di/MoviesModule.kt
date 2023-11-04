package com.example.starwars_movies.feature.di

import com.example.starwars_movies.feature.data.datasource.MoviesDataSource
import com.example.starwars_movies.feature.data.datasource.MoviesDataSourceImpl
import com.example.starwars_movies.feature.data.mapper.MoviesMapper
import com.example.starwars_movies.feature.data.repository.MoviesRepositoryImpl
import com.example.starwars_movies.feature.domain.repository.MoviesRepository
import com.example.starwars_movies.feature.domain.usecase.GetMoviesUseCase
import com.example.starwars_movies.feature.presentation.viewmodel.MoviesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

class MoviesModule {

    val dataModule = module(){
        factory<MoviesDataSource>{ MoviesDataSourceImpl(get()) }
        factory<MoviesRepository>{
            MoviesRepositoryImpl(
                dataSource = get(),
                mapper = MoviesMapper()
            )
        }
    }

    val domainModule = module(){
        factory { GetMoviesUseCase(get()) }
    }

    val presentationModule = module(){
        viewModel { MoviesViewModel(get()) }
    }

    fun loadModules() {
        loadKoinModules(
            listOf(
                dataModule,
                domainModule,
                presentationModule
            )
        )
    }

}