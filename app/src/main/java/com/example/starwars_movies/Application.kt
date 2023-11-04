package com.example.starwars_movies

import android.app.Application
import com.example.starwars_movies.feature.di.MoviesModule
import org.koin.core.context.startKoin

class MoviesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            val koin = KoinSetup()
            koin.loadModules()
        }
    }
}