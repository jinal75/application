package com.example.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.view.Gravity

import androidx.core.view.GravityCompat


import android.annotation.SuppressLint
import android.view.Gravity.*
import android.widget.TextView

import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.*


class DashBoarFragment : Fragment() {
    lateinit var menu: ImageView
    val dashlist = ArrayList<DashboardData>()
    val grplist = ArrayList<GroupData>()
    lateinit var RecyclerView: RecyclerView
    lateinit var textView: TextView
    val dashgrplist = ArrayList<GroupData>()
    lateinit var RecyclerViewDas: RecyclerView
    lateinit var textViewDash: TextView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dash_boar, container, false)
        menu = view.findViewById<ImageView>(R.id.img)
        menu.setOnClickListener {

            NavigationDrawerActivity.drawerLayout.openDrawer(GravityCompat.START)

        }

        adddata()
        RecyclerViewDas = view.findViewById<RecyclerView>(R.id.dashboardgrprecyclerview)
        RecyclerViewDas.layoutManager = LinearLayoutManager(context)
        RecyclerViewDas.adapter = GrpAdapter(context, dashgrplist)
        adddatagrp()
        RecyclerView =
            view.findViewById<RecyclerView>(com.example.myapplication.R.id.dashboardrecycler)
        RecyclerView.layoutManager = LinearLayoutManager(context)
        RecyclerView.adapter = DashBoardAdapter(context, dashlist)


        //  androidx.recyclerview.widget.RecyclerView.layoutManager = LinearLayoutManager(context)
        //   androidx.recyclerview.widget.RecyclerView.adapter = WishListAdapter(context, wishlist)


        return view


    }

    private fun adddatagrp() {
        //grplist.add(GroupData("Group Name","Lindsey Pelas",R.drawable.couple))
    }


    private fun adddata() {
        //  val textView = view?.findViewById(com.example.myapplication.R.id.txtage) as TextView
        // textView.setCompoundDrawablesWithIntrinsicBounds(com.example.myapplication.R.drawable.ic_icon, 0, 0, 0)


        dashlist.add(
            DashboardData(
                "Jenifer Jane",
                "Santa Maria USA",
                "Female,27",
                R.drawable.dashone,
                R.drawable.ic_femenine
            )
        )
        dashlist.add(
            DashboardData(
                "Lindsey Pelas",
                "Allentown USA",
                "Female, 24",
                R.drawable.dash,
                R.drawable.ic_femenine
            )
        )
        dashlist.add(
            DashboardData(
                "Tyler Kenyon",
                "Santa Maria USA",
                "Male, 28",
                R.drawable.maledash,
                R.drawable.ic_male
            )
        )
        dashlist.add(
            DashboardData(
                "Jenifer Jane",
                "Santa Maria USA",
                "Female,27",
                R.drawable.dashone,
                R.drawable.ic_femenine
            )
        )
        dashlist.add(
            DashboardData(
                "Lindsey Pelas",
                "Allentown USA",
                "Female, 24",
                R.drawable.dash,
                R.drawable.ic_femenine
            )
        )
        dashlist.add(
            DashboardData(
                "Tyler Kenyon",
                "Santa Maria USA",
                "Male, 28",
                R.drawable.maledash,
                R.drawable.ic_male
            )
        )


    }

}





