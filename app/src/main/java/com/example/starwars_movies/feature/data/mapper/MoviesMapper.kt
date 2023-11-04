package com.example.starwars_movies.feature.data.mapper

import com.example.starwars_movies.feature.data.response.MoviesResponse
import com.example.starwars_movies.feature.domain.model.Movies

internal class MoviesMapper {

    fun mapFromResponse(response: List<MoviesResponse>) : List<Movies> {
        return  response.map {
            Movies(
                cover = it.cover,
                title = it.title,
                director = it.director,
                episodeId = it.episodeId,
                releaseDate = it.releaseDate
            )
        }
    }
}