package com.asadbek.less68

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.asadbek.less68.adapter.StudentAdapter
import com.asadbek.less68.model.Student
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var fab: FloatingActionButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler)
        fab = findViewById(R.id.fab)
        val list = arrayListOf<Student>()
        val adapter = StudentAdapter(list)
        recyclerView?.adapter = adapter
        fab?.setOnClickListener {

        }


    }
}