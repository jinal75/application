package com.example.myapplication.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.*


class WishFragment : Fragment() {
    lateinit var menu: ImageView
    val wishlist = ArrayList<wishlistdata>()
    lateinit var RecyclerView: RecyclerView
    lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_wish, container, false)
        menu=view.findViewById<ImageView>(R.id.img)
        menu.setOnClickListener {
            NavigationDrawerActivity.drawerLayout.openDrawer(GravityCompat.START)
        }
        adddata()
        RecyclerView =
            view.findViewById<RecyclerView>(com.example.myapplication.R.id.messagerecyclerview)
        RecyclerView.layoutManager = LinearLayoutManager(context)
        RecyclerView.adapter = WishListAdapter(context, wishlist)


        //  androidx.recyclerview.widget.RecyclerView.layoutManager = LinearLayoutManager(context)
        //   androidx.recyclerview.widget.RecyclerView.adapter = WishListAdapter(context, wishlist)


        return view


    }


    private fun adddata() {
        //  val textView = view?.findViewById(com.example.myapplication.R.id.txtage) as TextView
        // textView.setCompoundDrawablesWithIntrinsicBounds(com.example.myapplication.R.drawable.ic_icon, 0, 0, 0)


        wishlist.add(
            wishlistdata(
                "jinal",
                "Ahmedabad",
                "Female,27",
                com.example.myapplication.R.drawable.dashone,
                com.example.myapplication.R.drawable.ic_femenine

            )
        )


    }

}








