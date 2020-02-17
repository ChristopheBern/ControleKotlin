package com.example.controlekotlincbe.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.controlekotlincbe.R
import com.example.controlekotlincbe.adapters.AppListAdapter
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
    }
}
