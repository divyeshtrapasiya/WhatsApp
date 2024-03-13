package com.example.tablayout.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.R

class StatusAdaptar(var name : ArrayList<String>,var time : ArrayList<String>,var image : ArrayList<Int>) :RecyclerView.Adapter<StatusAdaptar.Myviewholdar>() {
    class Myviewholdar(var v : View) : RecyclerView.ViewHolder(v) {

        var txtstatus : TextView = v.findViewById(R.id.txtstatus)
        var txttime : TextView = v.findViewById(R.id.txttime)
        var image : ImageView = v.findViewById(R.id.image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholdar {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.status_item,parent,false)
        var holder=Myviewholdar(v)
        return holder
    }

    override fun getItemCount(): Int {
        return  name.size
    }

    override fun onBindViewHolder(holder: Myviewholdar, position: Int) {
        holder.txtstatus.setText(name.get(position))
        holder.txttime.setText(time.get(position))
        holder.image.setImageResource(image.get(position))

    }
}