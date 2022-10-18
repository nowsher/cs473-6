package com.example.cs473_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Html
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.core.text.bold
import androidx.core.text.buildSpannedString
import androidx.core.text.italic
import androidx.core.text.underline
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private lateinit var fragManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /////////////////////////////
        val adapter = MyViewAdapter(supportFragmentManager, lifecycle)
        // Set the Adapter to your Viewpager UI
        viewpager.adapter = adapter

        TabLayoutMediator(tablayout, viewpager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "HOME"
//                    tab.setIcon(R.drawable.home)
                }
                1 -> {
                    tab.text = "ABOUT ME"
                }
                2 -> {
                    tab.text = "WORK"
                }
                3 -> {
                    tab.text = "CONTACT"
                }
            }
        }.attach()




    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(
            applicationContext,
            item.title.toString(),
            Toast.LENGTH_LONG
        ).show()

        return super.onOptionsItemSelected(item)
    }


}