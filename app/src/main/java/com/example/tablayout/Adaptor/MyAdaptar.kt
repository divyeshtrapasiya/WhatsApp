package com.example.tablayout.Adaptor

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tablayout.fragment.CallFragment
import com.example.tablayout.fragment.ChatFragment
import com.example.tablayout.fragment.StatusFragment

class MyAdaptar(v: FragmentManager) : FragmentPagerAdapter(v) {


    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {


        if (position == 0)
        {
            return ChatFragment()
        }
        else if (position == 1)
        {
            return StatusFragment()
        }
        else if (position == 2)
        {
            return CallFragment()
        }
        return null!!
    }
}