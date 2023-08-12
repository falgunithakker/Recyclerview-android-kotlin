package com.example.recy_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView =findViewById(R.id.recy1) as RecyclerView
        recyclerView.layoutManager=LinearLayoutManager(this)
        val data=ArrayList<ItemsViewModel>()
        for(i in 1..20)
        {
            data.add(ItemsViewModel(R.drawable.ic_launcher_background, "Item " + i))
        }
        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
    }
}