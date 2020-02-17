package com.example.controlekotlincbe.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.controlekotlincbe.R
import com.example.controlekotlincbe.adapters.AppListAdapter
import com.example.controlekotlincbe.models.AppModel
import com.example.gameapplication.utils.LIST_OF_APPLICATIONS
import com.facebook.drawee.backends.pipeline.Fresco
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialisation de la librairie Fresco
        Fresco.initialize(this);
        setContentView(R.layout.activity_main)

        // Initialisation de la recycler view
        _recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AppListAdapter(LIST_OF_APPLICATIONS)
        }

        // Evenement au clic sur bouton par genre
        _byGenre.setOnClickListener() {
            val appByGenre : List<AppModel> = LIST_OF_APPLICATIONS.sortedBy { it.genre }
            _recyclerView.apply {
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = AppListAdapter(appByGenre)
            }
            Log.d("Debug", appByGenre.toString())
        }

        // Evenement au clic sur bouton par date
        _byDate.setOnClickListener() {
            val appByDate : List<AppModel> = LIST_OF_APPLICATIONS.sortedBy { it.anneeSortie }
            _recyclerView.apply {
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = AppListAdapter(appByDate)
            }
            Log.d("Debug", appByDate.toString())
        }
    }
}
