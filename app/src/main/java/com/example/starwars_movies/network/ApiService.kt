package com.example.starwars_movies.network

import com.example.starwars_movies.feature.data.response.MoviesResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ApiService {

    val client = HttpClient()

    internal suspend fun makeRequest(): MoviesResponse {
        return client.get("https://api.npoint.io/dc12046175d1c54574fb").body()
    }

}