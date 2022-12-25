package com.example.myapplication

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.myapplication.fragment.*

class BottomActivity : AppCompatActivity() ,
    BottomNavigationView.OnNavigationItemSelectedListener {
        lateinit var navview: BottomNavigationView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom)

        replacefragment(DashBoarFragment())
        navview = findViewById<BottomNavigationView>(R.id.nav_view)
        navview.setOnNavigationItemSelectedListener(this)
        navview.setItemIconTintList(ColorStateList.valueOf(Color.parseColor("#80555C63")))
        supportActionBar?.hide()

    }


    private fun replacefragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment_activity_main, fragment)
            .commit()

    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navigation_dashboard -> {
                replacefragment(DashBoarFragment())
                //  Toast.makeText(this, "Home Fragment", Toast.LENGTH_SHORT).show()
            }

            R.id.navigation_whishlist -> {
                replacefragment(WishFragment())
                // Toast.makeText(this, "wish fragment", Toast.LENGTH_SHORT).show()

            }
            R.id.navigation_group -> {
                replacefragment(GroupFragment())
                // Toast.makeText(this, "Settings Fragment", Toast.LENGTH_SHORT).show()

            }
            R.id.navigation_message -> {
                replacefragment(MessageFragment())
                Toast.makeText(this, "Message Fragment", Toast.LENGTH_SHORT).show()
            }
            R.id.navigation_profile -> {
                replacefragment(ProfileFragment())
                //val intent=Intent(this,NavigationDrawerActivity::class.java)
                //  startActivity(intent)
                Toast.makeText(this, "Profile Fragment", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}

