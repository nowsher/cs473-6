package com.example.cs473_6

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

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

        when(item.itemId){
            R.id.mail ->{

                //Email
                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    type = "*/*"    //"text/plain"
                    data = Uri.parse("mailto:mohammad.ali@miu.edu")
//                    putExtra(Intent.EXTRA_SUBJECT, "Well wishes")
//                    putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam,")
                }
                startActivity(intent)

                return true
            }
            R.id.linkedin ->{
                //Linkedin
//                val uri = Uri.parse("https://www.linkedin.com/feed/")
//                val it = Intent(Intent.ACTION_VIEW, uri)
//                startActivity(it)

                val sendIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    type = "text/plain"
                    setPackage("com.linkedin.android")
                }
                if (sendIntent != null) {
                    startActivity(sendIntent)
                }

                return true
            }
            R.id.whatsapp ->{
                //Whatsapp
                val sendIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    type = "text/plain"
                    setPackage("com.whatsapp")
                }
                if (sendIntent != null) {
                    startActivity(sendIntent)
                }
                else{
                    Toast.makeText(this, "Application not available",Toast.LENGTH_LONG)
                }

                return true
            }
            R.id.gmail ->{
                val intent = Intent().apply {
                    action = Intent.ACTION_SENDTO
                    type = "text/plain"
                    data = Uri.parse("mailto:mohammad.ali@miu.edu")
//                    setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail")
                    setPackage("com.google.android.gm")
                    putExtra(Intent.EXTRA_SUBJECT, "Well wishes")
                    putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam,")
                }
                if (intent != null) {
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this, "Application not available",Toast.LENGTH_LONG)
                }
                return true
            }
            else ->{
                return true
            }

        }

        return super.onOptionsItemSelected(item)
    }


}