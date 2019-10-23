package com.example.kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_recycler.view.*

class RecyclerViewAdapter(val recyclerViewModelList: ArrayList<RecyclerViewModel>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.adapter_recycler, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        holder.bindItems(recyclerViewModelList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return recyclerViewModelList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(recyclerViewModel: RecyclerViewModel) {
            itemView.name.text = recyclerViewModel.name
            itemView.country.text = recyclerViewModel.country
        }
    }
}