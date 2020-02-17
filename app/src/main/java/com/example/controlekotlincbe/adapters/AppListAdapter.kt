package com.example.controlekotlincbe.adapters

import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.controlekotlincbe.R
import com.example.controlekotlincbe.models.AppModel
import com.facebook.drawee.view.SimpleDraweeView
import kotlinx.android.synthetic.main.app_layout.view.*

class AppListAdapter(val listOfApp: List<AppModel>) : RecyclerView.Adapter<AppListAdapter.AppViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AppViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.app_layout,
            parent,false
        )
        return AppViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfApp.size;
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        holder.bind(listOfApp[position]);
    }

    inner class AppViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(app: AppModel) {
            view._appTitle.text = app.nom
            view._appGenre.text = app.genre
            view._appDate.text = app.anneeSortie.toString()
            val uri: Uri = Uri.parse(app.imageUrl)
            val draweeView = view.findViewById(R.id._appImage) as SimpleDraweeView
            draweeView.setImageURI(uri.toString())
            Log.d("Debug", view._appImage.toString())

        }
    }

}