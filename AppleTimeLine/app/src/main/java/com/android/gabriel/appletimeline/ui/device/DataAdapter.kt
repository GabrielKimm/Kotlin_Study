package com.android.gabriel.appletimeline.ui.device

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.gabriel.appletimeline.R
import com.android.gabriel.appletimeline.databinding.DataListItemBinding

class DataAdapter(
    val items : ArrayList<String>,
    val context : Context,
    val binding : DataListItemBinding
) : RecyclerView.Adapter<ViewHolder>(){

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(
            R.layout.data_list_item,
            parent,
            false
        ),binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvDataType.text = items[position]
    }
}

class ViewHolder (view: View, binding: DataListItemBinding) : RecyclerView.ViewHolder(view) {
    val tvDataType = binding.tvDataType!!
}