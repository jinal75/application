package com.example.myapplication.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.*


class GroupFragment : Fragment() {
    val grplist = ArrayList<GroupData>()
    lateinit var RecyclerView: RecyclerView
    lateinit var textView: TextView
    lateinit var join: Button
    lateinit var menu: ImageView
    //lateinit var toolbartext:TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_group, container, false)
       // join =view.findViewById(R.id.btnjoin)
      //  toolbartext=view.findViewById(R.id.texttoolbar)
       // toolbartext.setText("Group")
        menu = view.findViewById(R.id.img)
       menu.setOnClickListener {
            NavigationDrawerActivity.drawerLayout.openDrawer(GravityCompat.START)
       }

        adddata()
        RecyclerView =
            view.findViewById<RecyclerView>(com.example.myapplication.R.id.grprecyclerview)
        RecyclerView.layoutManager = LinearLayoutManager(context)
        RecyclerView.adapter = GroupAdapter(context, grplist)


        // join.setOnClickListener {
         //val intent=Intent(context,DetailsActivity::class.java)
         // startActivity(intent)
       // }
       // RecyclerView.setOnClickListener {
         //   val intent = Intent(context, DetailsActivity::class.java)
           // startActivity(intent)

        //}


        //  androidx.recyclerview.widget.RecyclerView.layoutManager = LinearLayoutManager(context)
        //   androidx.recyclerview.widget.RecyclerView.adapter = WishListAdapter(context, wishlist)


        return view


    }


    private fun adddata() {
        //  val textView = view?.findViewById(com.example.myapplication.R.id.txtage) as TextView
        // textView.setCompoundDrawablesWithIntrinsicBounds(com.example.myapplication.R.drawable.ic_icon, 0, 0, 0)


        grplist.add(
            GroupData("Group Name", "Lindsey Pelas", R.drawable.couple)


        )


    }

}


