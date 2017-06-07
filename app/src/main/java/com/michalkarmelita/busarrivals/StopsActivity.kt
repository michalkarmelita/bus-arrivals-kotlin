package com.example.michalkarmelita.bustimeskotlin

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.michalkarmelita.busarrivals.App
import com.michalkarmelita.busarrivals.R
import javax.inject.Inject

class StopsActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: StopsViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectComponent()
        setContentView(R.layout.activity_stops)

        ViewModelProviders.of(this, viewModelFactory)
    }

    private fun injectComponent() {
        App.component
                .plus()
                .inject(this)
    }
}
