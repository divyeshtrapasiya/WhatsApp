package com.example.tablayout.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.Modal.UserModal
import com.example.tablayout.R

class ChatAdaptar(private val userlist: MutableList<UserModal>) : RecyclerView.Adapter<ChatAdaptar.Myviewholdar>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholdar {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.chat_item, parent, false)
        return Myviewholdar(v)
    }

    override fun getItemCount(): Int {
     return   userlist.size
    }

    override fun onBindViewHolder(holder: Myviewholdar, position: Int) {

        val user = userlist[position]

        holder.txtname.text = user.name
        holder.txtmessage.text = user.message
        holder.image.setImageResource(user.image)

    }

    class Myviewholdar(v: View) : RecyclerView.ViewHolder(v) {

        var txtname: TextView = v.findViewById(R.id.txtname)
        var txtmessage: TextView = v.findViewById(R.id.txtmessage)
        var image: ImageView = v.findViewById(R.id.image)

    }

}