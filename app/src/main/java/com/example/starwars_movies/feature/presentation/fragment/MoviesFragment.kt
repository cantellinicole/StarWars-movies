package com.example.starwars_movies.feature.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.starwars_movies.R
import com.example.starwars_movies.databinding.MoviesFragmentBinding
import com.example.starwars_movies.feature.domain.model.Movies
import com.example.starwars_movies.feature.presentation.adapter.MoviesAdapter
import com.example.starwars_movies.feature.presentation.viewmodel.MoviesViewModel
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

internal class MoviesFragment : Fragment(R.layout.movies_fragment){

    private var binding : MoviesFragmentBinding? = null
    private var adapter : MoviesAdapter? = null
    private val viewModel : MoviesViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MoviesFragmentBinding.inflate(layoutInflater)
        setupObserver()
    }

    private fun setupObserver() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.moviesViewState.collect{
                    if(it.movies.isNullOrEmpty()) {
                       setupView(it.movies)
                    }
                }
            }
        }
    }
    private fun setupView(movies: List<Movies>?) {
        movies?.let {
            adapter = MoviesAdapter(it)
        }
    }

    companion object {
        fun newInstance() : MoviesFragment {
            return MoviesFragment()
        }
    }
}