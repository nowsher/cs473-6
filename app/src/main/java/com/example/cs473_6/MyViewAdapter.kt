package com.example.cs473_6

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyViewAdapter(fm: FragmentManager, lc: Lifecycle) : FragmentStateAdapter(fm, lc) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> AboutFragment()
            2 -> WorkFragment()
            3 -> ContactFragment()
            else -> Fragment()
        }
    }
}