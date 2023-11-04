package com.example.starwars_movies.feature.presentation.fragment

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.starwars_movies.databinding.ItemListBinding
import com.example.starwars_movies.feature.domain.model.Movies

internal class MoviesViewHolder(
    private val binding : ItemListBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(movies: Movies) {
        with(binding) {

            Glide.with(this.root.context)
                .load(movies.cover)
                .into(imageMovieCover)

            tvTitle.text = movies.title
            tvDirectorName.text = movies.director
            tvReleaseDate.text = movies.releaseDate
        }
    }
}