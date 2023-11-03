package com.example.starwars_movies.feature.data.repository

import com.example.starwars_movies.feature.data.response.MoviesResponse
import com.example.starwars_movies.feature.domain.model.Movies

internal object MoviesFake {
    fun getMoviesResponse() = listOf(
        MoviesResponse(
            cover = "https://www.coverwhiz.com/uploads/movies/star-wars-episode-iv-a-new-hope.jpg",
            title = "A New Hope",
            director = 	"George Lucas",
            episodeId = "IV",
            releaseDate = "25-05-1977"
        ),
        MoviesResponse(
            cover = "https://www.coverwhiz.com/uploads/movies/star-wars-episode-v-the-empire-strikes-back.jpg",
            title = "The Empire Strikes Back",
            director = "Irvin Kershner",
            episodeId = "V",
            releaseDate = "17-05-1980"
        ),
        MoviesResponse(
            cover = "https://www.coverwhiz.com/uploads/movies/star-wars-episode-vi-return-of-the-jedi.jpg",
            title = "Return of the Jedi",
            director = "Richard Marquand",
            episodeId = "VI",
            releaseDate = "25-03-1983"
        )
    )

   fun getMovies() = listOf(
       Movies(
           cover = "https://www.coverwhiz.com/uploads/movies/star-wars-episode-iv-a-new-hope.jpg",
           title = "A New Hope",
           director = 	"George Lucas",
           episodeId = "IV",
           releaseDate = "25-05-1977"
       ),
       Movies(
           cover = "https://www.coverwhiz.com/uploads/movies/star-wars-episode-v-the-empire-strikes-back.jpg",
           title = "The Empire Strikes Back",
           director = "Irvin Kershner",
           episodeId = "V",
           releaseDate = "17-05-1980"
       ),
       Movies(
           cover = "https://www.coverwhiz.com/uploads/movies/star-wars-episode-vi-return-of-the-jedi.jpg",
           title = "Return of the Jedi",
           director = "Richard Marquand",
           episodeId = "VI",
           releaseDate = "25-03-1983"
       )
   )
}