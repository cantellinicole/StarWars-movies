package com.example.starwars_movies.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MoviesApi {

    init {
        val retrofit = Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(ApiService::class.java)
    }

    companion object {
        const val BASE_URL = "https://api.npoint.io/dc12046175d1c54574fb"
    }

}