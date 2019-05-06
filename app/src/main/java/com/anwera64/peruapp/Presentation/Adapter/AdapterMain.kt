package com.anwera64.peruapp.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anwera64.peruapp.R
import com.anwera64.peruapp.data.model.Task
import kotlinx.android.synthetic.main.item_task.view.*

class AdapterMain: androidx.recyclerview.widget.RecyclerView.Adapter<AdapterMain.ViewHolder>() {

    var tasks: List<Task> = emptyList()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AdapterMain.ViewHolder {
        return ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_task, p0, false))
    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val task = tasks[p1]
        val view = p0.itemView

        view.tvTitle.text = task.title
        view.tvDescription.text = task.detail
        view.tvDate.text = DateFormat.format("dd/MM/yy", task.creationDate)
    }

    class ViewHolder(view: View): androidx.recyclerview.widget.RecyclerView.ViewHolder(view)
}