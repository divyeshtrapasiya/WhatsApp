package com.example.tablayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.Adaptor.StatusAdaptar
import com.example.tablayout.R

class StatusFragment : Fragment() {

    lateinit var v : View

    var name : ArrayList<String> = ArrayList()
    var time : ArrayList<String> = ArrayList()
    var image : ArrayList<Int> = ArrayList()

    lateinit var recycleview : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        v = inflater.inflate(R.layout.fragment_status, container, false)
        initview()
        return v
    }

    private fun initview() {

        recycleview = v.findViewById(R.id.recycleview)

        name.add("dfghjkldfghj")
        name.add("dfghjkldfghj")
        name.add("dfghjkldfghj")
        name.add("dfghjkldfghj")
        name.add("dfghjkldfghj")
        name.add("dfghjkldfghj")
        name.add("dfghjkldfghj")
        name.add("dfghjkldfghj")
        name.add("dfghjkldfghj")

        time.add("8:45 PM ")
        time.add("8:45 PM ")
        time.add("8:45 PM ")
        time.add("8:45 PM ")
        time.add("8:45 PM ")
        time.add("8:45 PM ")
        time.add("8:45 PM ")
        time.add("8:45 PM ")
        time.add("8:45 PM ")

        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)

        var myadaptor = StatusAdaptar(name,time,image)

        var manager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recycleview.layoutManager=manager

        recycleview.adapter=myadaptor



    }


}