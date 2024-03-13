package com.example.tablayout.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.R

class CallAdaptar(var name : ArrayList<String>,var date : ArrayList<String>,var image : ArrayList<Int>) : RecyclerView.Adapter<CallAdaptar.Myviewholdar>() {
    class Myviewholdar(var v : View) : RecyclerView.ViewHolder(v){

        var txtname : TextView = v.findViewById(R.id.txtname)
        var txtdate : TextView = v.findViewById(R.id.txtdate)
        var image : ImageView = v.findViewById(R.id.image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholdar {

        var v = LayoutInflater.from(parent.context).inflate(R.layout.call_item,parent,false)
        var holder= Myviewholdar(v)
        return holder

    }

    override fun getItemCount(): Int {
        return name.size
    }

    override fun onBindViewHolder(holder: Myviewholdar, position: Int) {

        holder.txtname.setText(name.get(position))
        holder.txtdate.setText(date.get(position))
        holder.image.setImageResource(image.get(position))
    }
}