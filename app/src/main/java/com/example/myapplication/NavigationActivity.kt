package com.example.myapplication

import android.content.Intent
import android.graphics.PorterDuff
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.MenuItem
import android.view.MotionEvent
import android.view.View.OnTouchListener
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.myapplication.drawerfragment.*
import com.example.myapplication.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.item_dashoard_adapter.*
import kotlinx.android.synthetic.main.item_header_drawer.*


class NavigationActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var logout: Button
    lateinit var navview: NavigationView
    lateinit var toolbartitle:Toolbar
    lateinit var Dashboard:TextView


    companion object{
        lateinit var drawerLayout: DrawerLayout

    }

    //lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
        // toolbar = findViewById(R.id.toolbar)
        NavigationDrawerActivity.drawerLayout = findViewById(R.id.drawer_layout)
        navview = findViewById(R.id.navi_view)
        navview.setNavigationItemSelectedListener(this)
        setSupportActionBar(androidx.appcompat.widget.Toolbar(this))
        supportActionBar?.hide()
//        drawerLayout.openDrawer(GravityCompat.START)
        // toolbar.hideOverflowMenu()

       //drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.navi_view)
        val nav_view: BottomNavigationView = findViewById(R.id.navb_view)
      // toolbartitle=findViewById(R.id.texttoolbar)
       // Dashboard=findViewById(R.id.txtdashboard)



       // val toggle = ActionBarDrawerToggle(
           // this,
            //drawerLayout,
           // androidx.appcompat.widget.Toolbar(this),
            //R.string.navigation_drawer_open,
           // R.string.navigation_drawer_close
       // )

        //drawerLayout.addDrawerListener(toggle)

        navView.setNavigationItemSelectedListener(this)
        nav_view.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        val fragment = DashBoarFragment()
        replaceFragment(fragment)

    }




     override fun onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment).commit()

    }



    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.txtdashboard -> {
                Dashboard.setOnClickListener {
                    replaceFragment(DashBoarFragment())
                    drawerLayout.closeDrawers()
                }
               // replaceFragment(DashBoarFragment())
               // drawerLayout.closeDrawers()
               // setTitle("Dashboard")

            }
            R.id.navi_wishlist -> {
                replaceFragment(WishFragment())
               drawerLayout.closeDrawers()
                setTitle("WishList")
            }
            R.id.navi_group -> {
                replaceFragment(CreateGroupFragment())
                //drawerLayout.closeDrawers()
                setTitle("Group")

            }
            R.id.navi_message -> {
                replaceFragment(MessageFragment())
               //drawerLayout.closeDrawers()
                setTitle("Message")

            }
            R.id.navi_profile -> {
                replaceFragment(ProfileFragment())
                //drawerLayout.closeDrawers()
                setTitle("Profile")



                val builder = AlertDialog.Builder(this)
                //set title for alert dialog
                builder.setTitle("Are You sure Logout!!")
                //set message for alert dialog
                builder.setMessage("Are you sure to exit this App?")
                builder.setIcon(android.R.drawable.ic_dialog_alert)

                //performing positive action
                builder.setPositiveButton("Yes") { dialogInterface, which ->
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    //Toast.makeText(applicationContext, "clicked yes", Toast.LENGTH_LONG).show()
                }
                //performing cancel action
                builder.setNeutralButton("Cancel") { dialogInterface, which ->
                    Toast.makeText(
                        applicationContext,
                        "clicked cancel\n operation cancel",
                        Toast.LENGTH_LONG
                    ).show()
                }
                //performing negative action
                builder.setNegativeButton("No") { dialogInterface, which ->
                    Toast.makeText(applicationContext, "clicked No", Toast.LENGTH_LONG).show()
                }
                // Create the AlertDialog
                val alertDialog: AlertDialog = builder.create()
                // Set other dialog properties
                alertDialog.setCancelable(false)
                alertDialog.show()
            }
        }

        //replaceFragment(LogoutFragment())
        // Toast.makeText(this, "Log out", Toast.LENGTH_SHORT).show()


        val drawerLayout
                : DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_dashboard -> {
                    val fragment = DashBoarFragment()
                    setTitle("Dashboard")
                    replaceFragment(fragment)
                    return@OnNavigationItemSelectedListener true

                }
                R.id.navigation_whishlist -> {
                    val fragment = WishFragment()
                    setTitle("Wishlist")
                    replaceFragment(WishFragment())
                    return@OnNavigationItemSelectedListener true

                }
                R.id.navigation_group -> {
                    val fragment = GroupFragment()
                    replaceFragment(fragment)
                    return@OnNavigationItemSelectedListener true

                }
                R.id.navigation_profile -> {
                    val fragment = ProfileFragment()
                    setTitle("Profile")
                    replaceFragment(fragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_message -> {
                    val fragment = MessageFragment()
                    setTitle("Message")
                    replaceFragment(fragment)
                    return@OnNavigationItemSelectedListener true

                }
            }
            false
        }
}
