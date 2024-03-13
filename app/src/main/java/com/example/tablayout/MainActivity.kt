package com.example.tablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.tablayout.Adaptor.MyAdaptar
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var tablayoute:TabLayout
    lateinit var viewpager:ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initview()
    }

    private fun initview() {

        tablayoute = findViewById(R.id.tablayoute)
        viewpager = findViewById(R.id.viewpager)

        tablayoute.addTab(tablayoute.newTab().setText("Chat"))
        tablayoute.addTab(tablayoute.newTab().setText("Upadates"))
        tablayoute.addTab(tablayoute.newTab().setText("Call"))






        val myadaptar = MyAdaptar(supportFragmentManager)
        viewpager.adapter=myadaptar


        viewpager.addOnPageChangeListener(object : TabLayout.TabLayoutOnPageChangeListener(tablayoute) {})

        tablayoute.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {

                if (tab != null) {
                    viewpager.currentItem=tab.position
                }

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })




    }
}