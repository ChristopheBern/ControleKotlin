package com.example.controlekotlincbe.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.controlekotlincbe.R
import com.example.controlekotlincbe.models.AppModel
import com.facebook.drawee.view.SimpleDraweeView
import kotlinx.android.synthetic.main.app_layout.view.*

typealias itemLongCliked = (AppModel) -> Unit

class AppListAdapter(val listOfApp: MutableList<AppModel>) : RecyclerView.Adapter<AppListAdapter.AppViewHolder>() {
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
        holder.bind(listOfApp[position], longClickCallBack = {
            val index: Int = listOfApp.indexOf(it)
            listOfApp.removeAt(index)
            notifyItemRemoved(index)
        });
    }

    inner class AppViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(app: AppModel, longClickCallBack: itemLongCliked) {
            view._appTitle.text = app.nom
            view._appGenre.text = app.genre
            view._appDate.text = app.anneeSortie.toString()
            val uri: Uri = Uri.parse(app.imageUrl)
            val draweeView = view.findViewById(R.id._appImage) as SimpleDraweeView
            draweeView.setImageURI(uri.toString())
            view.setOnClickListener() {
                longClickCallBack.invoke(app)
                true
            }

        }
    }

}