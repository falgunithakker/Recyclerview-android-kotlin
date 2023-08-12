package com.example.recy_example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val itmlist:List<ItemsViewModel>): RecyclerView.Adapter<CustomAdapter.viewholder>() {
    class viewholder(Itemview : View) : RecyclerView.ViewHolder(Itemview)
    {
        val imageview:ImageView=Itemview.findViewById(R.id.imageview)
        val textview1:TextView=Itemview.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val view=LayoutInflater.from(parent.context)
            .inflate(R.layout.listitem, parent, false)

        return viewholder(view)
    }

    override fun getItemCount(): Int {
       return itmlist.count()
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val ItemsViewModel = itmlist[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageview.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.textview1.text = ItemsViewModel.text
    }

}