package com.example.starwars_movies.feature.data.mapper

import com.example.starwars_movies.feature.data.response.MoviesResponse
import com.example.starwars_movies.feature.domain.model.Movies

internal class MoviesMapper {

    fun mapFromResponse(response: MoviesResponse) : Movies {
        return Movies (
            cover = response.cover,
            title = response.title,
            director = response.director,
            episodeId = response.episodeId,
            releaseDate = response.releaseDate
        )
    }
}