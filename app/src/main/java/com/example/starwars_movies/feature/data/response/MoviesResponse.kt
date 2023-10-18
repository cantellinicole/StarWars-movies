package com.example.starwars_movies.feature.data.response

import kotlinx.serialization.Serializable

@Serializable
internal data class MoviesResponse(
    val cover : String,
    val title : String,
    val director : String,
    val episodeId : String,
    val releaseDate : String
)