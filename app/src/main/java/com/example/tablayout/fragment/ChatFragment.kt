package com.example.tablayout.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.Adaptor.ChatAdaptar
import com.example.tablayout.Modal.UserModal
import com.example.tablayout.R

class ChatFragment : Fragment() {

    private lateinit var v: View

    private lateinit var userlist: MutableList<UserModal>
    lateinit var recycleview: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        v = inflater.inflate(R.layout.fragment_chat, container, false)

        initview()

        return v
    }

    private fun initview() {

        recycleview = v.findViewById(R.id.recycleview)

        userlist = mutableListOf()

        val manager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recycleview.layoutManager = manager

        userlist.add(UserModal("divyesh",R.drawable.story,"Busy"))
        userlist.add(UserModal("divyesh",R.drawable.story,"Busy"))
        userlist.add(UserModal("divyesh",R.drawable.story,"Busy"))
        userlist.add(UserModal("divyesh",R.drawable.story,"Busy"))
        userlist.add(UserModal("divyesh",R.drawable.story,"Busy"))
        userlist.add(UserModal("divyesh",R.drawable.story,"Busy"))
        userlist.add(UserModal("divyesh",R.drawable.story,"Busy"))

        val adaptar = ChatAdaptar(userlist)
        recycleview.adapter = adaptar


    }


}