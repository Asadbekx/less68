package com.asadbek.less68.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asadbek.less68.R
import com.asadbek.less68.model.Student

class StudentAdapter(val list: ArrayList<Student>) :
    RecyclerView.Adapter<StudentAdapter.StudentVH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentVH {
        val vh = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return StudentVH(vh)
    }

    override fun onBindViewHolder(holder: StudentVH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class StudentVH(private val view: View) : RecyclerView.ViewHolder(view) {

        fun onBind(student: Student) {

        }

    }
}