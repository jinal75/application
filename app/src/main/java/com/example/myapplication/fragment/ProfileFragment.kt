package com.example.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.GravityCompat
import com.example.myapplication.NavigationActivity
import com.example.myapplication.NavigationDrawerActivity
import com.example.myapplication.R


class ProfileFragment : Fragment() {
    lateinit var menu: ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        menu = view.findViewById<ImageView>(com.example.myapplication.R.id.img)
        menu.setOnClickListener {
            NavigationDrawerActivity.drawerLayout.openDrawer(GravityCompat.START)
        }
        return view
    }

}


