package com.example.cs473_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.text.bold
import androidx.core.text.buildSpannedString
import androidx.core.text.italic
import androidx.core.text.underline
import kotlinx.android.synthetic.main.fragment_contact.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        var view:View? = inflater.inflate(R.layout.fragment_home, container, false)

        val newText = buildSpannedString {
            bold { append("Completed ") }
//            underline { append("World. ") }
//            italic { append("2021 ") }
            append("oncampus studies and currently taking distance education courses to complete a Master's degree" +
                    " in computer science (Available for full-time,")
            bold { append("W2 ") }
            append("employemnt).")
        }
        var career = view!!.findViewById<TextView>(R.id.textViewCareer)
        career.text = newText

        val newText1 = buildSpannedString {
            bold { append("Languages: ") }
            append("Java, Java Script, PL/SQL")
            bold { append("\nFrameworks/Web: ") }
            append("Spring(boot,MVC ,Security), Hybernate, JDBC")
            bold { append("\nMicroservices/Cloud: ") }
            append("AWS, Docker, Kubernetes, Kafka")
            bold { append("\nDatabases: ") }
            append("Oracle, MySQL, MongoDB")
            bold { append("\nTools: ") }
            append("IntelliJ IDEA, Github, UML")
        }
        var career1 = view!!.findViewById<TextView>(R.id.textViewExperience)
        career1.text = newText1


        return view
    }



}

