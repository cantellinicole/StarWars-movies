package com.example.starwars_movies.feature.presentation

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.starwars_movies.databinding.ItemListBinding
import com.example.starwars_movies.feature.domain.model.Movies
import com.example.starwars_movies.feature.presentation.fragment.MoviesViewHolder

internal class MoviesAdapter() : ListAdapter<Movies, MoviesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = ItemListBinding.inflate(parent.rootView)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind()
    }

    private class MoviesDiffCallBack : DiffUtil.ItemCallback<Movies>() {
        override fun areItemsTheSame(oldItem: Movies, newItem: Movies): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: Movies, newItem: Movies): Boolean =
            oldItem == newItem
    }
}