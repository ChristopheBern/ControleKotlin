package com.example.controlekotlincbe.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.controlekotlincbe.R
import com.example.controlekotlincbe.models.AppModel
import com.facebook.drawee.view.SimpleDraweeView
import kotlinx.android.synthetic.main.search_result_layout.view.*

class SearchAdapter(var listOfApp: MutableList<AppModel>) :
    RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {

    fun addItemsToList(newList: List<AppModel>) {
        val sizeBeforeChange: Int = listOfApp.size
        listOfApp.addAll(newList)
        notifyItemRangeInserted(sizeBeforeChange, newList.size)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SearchAdapter.SearchViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.search_result_layout,
            parent, false
        )
        return SearchViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfApp.size
    }

    override fun onBindViewHolder(holder: SearchAdapter.SearchViewHolder, position: Int) {
        holder.bind(listOfApp[position])
    }

    inner class SearchViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(app: AppModel) {
            view._listItemTextSearchView.text = app.nom
            val uri: Uri = Uri.parse(app.imageUrl)
            val draweeView = view.findViewById(R.id._appImage) as SimpleDraweeView
            draweeView.setImageURI(uri.toString())
        }
    }

}