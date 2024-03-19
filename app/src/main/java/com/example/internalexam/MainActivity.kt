package com.example.internalexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ex.adapter.StatusAdapter
import com.example.internalexam.adapter.ChannelAdapter
import com.example.internalexam.adapter.FindAdapter
import com.example.internalexam.model.SampleData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.rv1)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.HORIZONTAL, false)

        var recyclerView2 =findViewById<RecyclerView>(R.id.rv2)
        recyclerView2.layoutManager =LinearLayoutManager(applicationContext)

        var recyclerView3 =findViewById<RecyclerView>(R.id.rv3)
        recyclerView3.layoutManager =LinearLayoutManager(applicationContext,RecyclerView.HORIZONTAL,false)



        val data = SampleData.statusDemo
        val adapter = StatusAdapter(data)
        recyclerView.adapter = adapter

        val data2 = SampleData.findDemo
        val adapter2 = FindAdapter(data2)
        recyclerView2.adapter = adapter2



        val data3 = SampleData.channelDemo
        val adapter3 = ChannelAdapter(data3)
        recyclerView3.adapter = adapter3





    }
}