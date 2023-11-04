package com.example.starwars_movies

import com.example.starwars_movies.feature.di.MoviesModule
import org.koin.core.component.KoinComponent
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class KoinSetup : KoinComponent {

    fun loadModules() {
        MoviesModule().loadModules()
    }
}