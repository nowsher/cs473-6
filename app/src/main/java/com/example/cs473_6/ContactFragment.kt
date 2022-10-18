package com.example.cs473_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ContactFragment : Fragment() {
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        var view: View? = inflater.inflate(R.layout.fragment_contact, container, false)

        return view
    }

}