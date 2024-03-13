package com.example.tablayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.Adaptor.CallAdaptar
import com.example.tablayout.R

class CallFragment : Fragment() {

    lateinit var  v  : View

    var name : ArrayList<String> = ArrayList()

    var date : ArrayList<String> = ArrayList()

    var image : ArrayList<Int>  = ArrayList()

    lateinit var recycleview  :RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_call, container, false)
        initview()
        return v
    }

    private fun initview() {

        recycleview = v.findViewById(R.id.recycleview)

        name.add("sdfghjkldfghjk")
        name.add("sdfghjkldfghjk")
        name.add("sdfghjkldfghjk")
        name.add("sdfghjkldfghjk")
        name.add("sdfghjkldfghjk")
        name.add("sdfghjkldfghjk")
        name.add("sdfghjkldfghjk")
        name.add("sdfghjkldfghjk")

        date.add("8:12 AM")
        date.add("8:12 AM")
        date.add("8:12 AM")
        date.add("8:12 AM")
        date.add("8:12 AM")
        date.add("8:12 AM")
        date.add("8:12 AM")
        date.add("8:12 AM")

        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)
        image.add(R.drawable.story)

        var myadaptar = CallAdaptar(name,date,image)

        var manager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recycleview.layoutManager=manager

        recycleview.adapter=myadaptar

    }


}