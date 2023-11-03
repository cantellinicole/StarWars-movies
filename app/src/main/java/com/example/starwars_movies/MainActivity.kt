package com.example.starwars_movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.starwars_movies.databinding.ActivityMainBinding
import com.example.starwars_movies.feature.presentation.fragment.MoviesFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainer, MoviesFragment.newInstance())
            .commit()

    }
}