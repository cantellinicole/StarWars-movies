package com.example.starwars_movies.feature.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.starwars_movies.R
import com.example.starwars_movies.databinding.MoviesFragmentBinding

internal class MoviesFragment : Fragment(R.layout.movies_fragment){

    private lateinit var binding : MoviesFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MoviesFragmentBinding.inflate(layoutInflater)
    }


}