package com.example.myapplication

import android.R.drawable
import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.myapplication.drawerfragment.LogoutFragment
import com.example.myapplication.fragment.DashBoarFragment
import com.example.myapplication.fragment.GroupFragment
import com.example.myapplication.fragment.MessageFragment
import com.example.myapplication.fragment.WishFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.security.AccessController.getContext


class NavigationDrawerActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener  {
    //lateinit var drawerLayout: DrawerLayout
    lateinit var navview: BottomNavigationView

    // lateinit var layout: LinearLayout
    //lateinit var toolbar: Toolbar

    lateinit var Dashboard: TextView
    lateinit var Wishlist: TextView
    lateinit var Group:TextView
    lateinit var Message:TextView
    lateinit var Profile:TextView
    lateinit var Plan:TextView
    lateinit var Logout:Button
   // lateinit var setting:TextView
    companion object{
        lateinit var drawerLayout: DrawerLayout

    }

    @SuppressLint("UseCompatTextViewDrawableApis")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
        supportActionBar?.hide()
        navview = findViewById<BottomNavigationView>(R.id.navb_view)
        navview.setOnNavigationItemSelectedListener(this)
        //  navview.setItemIconTintList(ColorStateList.valueOf(Color.parseColor("#80555C63")));

        //  toolbar = findViewById(R.id.toolbar)
        // setSupportActionBar(toolbar)
        drawerLayout = findViewById(R.id.drawer_layout)
        Dashboard = findViewById(R.id.txtdashboard)
        Wishlist = findViewById(R.id.txtwishlist)
        Message = findViewById(R.id.txtmessage)
        Profile = findViewById(R.id.txtprofile)
        Plan = findViewById(R.id.txtplan)
        Logout = findViewById<Button>(R.id.btnlogout)
        Logout.setOnClickListener {
           // replacefragment(LogoutFragment())
            val alertDialogBuilder=AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("Are You Sure!!!")
            alertDialogBuilder.setIcon(R.drawable.voice)
        alertDialogBuilder.setMessage("Are You sure Do You Want To exit?")
            alertDialogBuilder.setCancelable(false)
            alertDialogBuilder.setPositiveButton("Yes"){dialogInterface, which ->
                finish()
            }

            alertDialogBuilder.setNegativeButton("No"){_,_->
                Toast.makeText(this, "Continue using this application", Toast.LENGTH_SHORT).show()
            }
            alertDialogBuilder.setNeutralButton("Cancel"){_,_->
                Toast.makeText(this, "Click Cancel Button", Toast.LENGTH_SHORT).show()
            }
            val aletdialog=alertDialogBuilder.create()

            aletdialog.show()
        }



        Plan.setOnClickListener {
            val intent=Intent(this,PlanActivity::class.java)
            startActivity(intent)
        }
       // setting=findViewById(R.id.txtsetting)
       // setting.setOnClickListener {
           // val intent= Intent(this,PlanActivity::class.java)
           // startActivity(intent)
      //  }
        Profile.setOnClickListener {
            Profile.setBackgroundDrawable(ContextCompat.getDrawable(this,R.drawable.item_buttondrawer_background))
            Wishlist.background=null
            Dashboard.background=null
            Message.background=null
            val intent= Intent(this,ProfileActivity::class.java)
            startActivity(intent)
            finish()
            drawerLayout.closeDrawer(GravityCompat.START)
            Profile.setTextColor(ContextCompat.getColor(this,R.color.white))
            Dashboard.setTextColor(ContextCompat.getColor(this,R.color.black))
            Message.setTextColor(ContextCompat.getColor(this,R.color.black))
           Wishlist.setTextColor(ContextCompat.getColor(this,R.color.black))
            Profile.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.white))
            Wishlist.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))
            Message.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))
            Dashboard.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))




        }
        Message.setOnClickListener {
            Message.setBackgroundDrawable(ContextCompat.getDrawable(this,R.drawable.item_buttondrawer_background))
            Wishlist.background=null
            Dashboard.background=null
            Profile.background=null
            replacefragment(MessageFragment())
            drawerLayout.closeDrawer(GravityCompat.START)
            Message.setTextColor(ContextCompat.getColor(this,R.color.white))
            Dashboard.setTextColor(ContextCompat.getColor(this,R.color.black))
            Wishlist.setTextColor(ContextCompat.getColor(this,R.color.black))
            Profile.setTextColor(ContextCompat.getColor(this,R.color.black))
            Message.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.white))
            Wishlist.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))
            Profile.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))
            Dashboard.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))

        }
        Dashboard.setOnClickListener {
            Dashboard.setBackgroundDrawable(ContextCompat.getDrawable(this,R.drawable.item_buttondrawer_background))
            //Dashboard.setBackgroundColor(ContextCompat.getColor(this, R.color.purple))
            Wishlist.background = null
            Profile.background=null
            Message.background=null
            replacefragment(DashBoarFragment())
            drawerLayout.closeDrawer(GravityCompat.START)
            Dashboard.setTextColor(ContextCompat.getColor(this,R.color.white))
           Wishlist.setTextColor(ContextCompat.getColor(this,R.color.black))
            Message.setTextColor(ContextCompat.getColor(this,R.color.black))
            Profile.setTextColor(ContextCompat.getColor(this,R.color.black))
            Dashboard.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.white))
            Wishlist.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))
            Message.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))
            Profile.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))
        }

        Wishlist.setOnClickListener {
            Wishlist.setBackgroundDrawable(ContextCompat.getDrawable(this,R.drawable.item_buttondrawer_background))
           // Wishlist.setBackgroundColor(applicationContext.getColor(R.color.purple))
            Dashboard.background = null
            Message.background=null
            Profile.background=null
            replacefragment(WishFragment())
            drawerLayout.closeDrawer(GravityCompat.START)
            Wishlist.setTextColor(ContextCompat.getColor(this,R.color.white))
            Dashboard.setTextColor(ContextCompat.getColor(this,R.color.black))
            Message.setTextColor(ContextCompat.getColor(this,R.color.black))
            Profile.setTextColor(ContextCompat.getColor(this,R.color.black))
            Wishlist.compoundDrawableTintList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.white))
            Dashboard.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))
           Message.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))
           Profile.compoundDrawableTintList=ColorStateList.valueOf(ContextCompat.getColor(this,R.color.black))
        }


        val fragment = DashBoarFragment()
        replacefragment(fragment)
    }

    private fun replacefragment(fragment: androidx.fragment.app.Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment)
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
               // Toast.makeText(this, "Message Fragment", Toast.LENGTH_SHORT).show()
            }
            R.id.navigation_profile -> {
                //replacefragment(ProfileFragment())
                val intent=Intent(this,ProfileActivity::class.java)
                  startActivity(intent)
                finish()
               // Toast.makeText(this, "Profile Fragment", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}









