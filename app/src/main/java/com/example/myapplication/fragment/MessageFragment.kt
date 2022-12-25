package com.example.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import android.widget.TextView

import android.widget.ImageView
import androidx.core.view.GravityCompat
import com.example.myapplication.*


class MessageFragment : Fragment() {
    lateinit var menu: ImageView
    val msglist = ArrayList<MessageData>()
    lateinit var RecyclerView: RecyclerView
    lateinit var textView: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(
            com.example.myapplication.R.layout.fragment_message, container, false
        )
        menu=view.findViewById<ImageView>(com.example.myapplication.R.id.img)
        menu.setOnClickListener {
            NavigationDrawerActivity.drawerLayout.openDrawer(GravityCompat.START)
        }
        adddata()
        RecyclerView =
            view.findViewById<RecyclerView>(com.example.myapplication.R.id.messagerecyclerview)
        RecyclerView.layoutManager = LinearLayoutManager(context)
        RecyclerView.adapter = MessageAdapter(context, msglist)



        return view


    }


    private fun adddata() {
        //  val textView = view?.findViewById(com.example.myapplication.R.id.txtage) as TextView
        // textView.setCompoundDrawablesWithIntrinsicBounds(com.example.myapplication.R.drawable.ic_icon, 0, 0, 0)


        msglist.add(MessageData("Ashleigh Rodriguz","Great! Then we'll meet with them...","2 hours ago",10,R.drawable.msgprofile))
        msglist.add(MessageData("Pricilla Gilligan","Great! Then we'll meet with them...","9:12 am",3,R.drawable.msgprofile_2))
        msglist.add(MessageData("Gladys Haskell","Great! Then we'll meet with them...","Yesterday",2,R.drawable.msgprofile_3))
        msglist.add(MessageData("Lissette Porta","Great! Then we'll meet with them...","10/12/20",5,R.drawable.msgprofile_4))
        msglist.add(MessageData("Suzann Meares","Great! Then we'll meet with them...","09/12/20",4,R.drawable.msgprofile_5))
        msglist.add(MessageData("Trudi Beardsley","Great! Then we'll meet with them...","05/12/20",1,R.drawable.msgprofile_6))
        msglist.add(MessageData("Dana Brookes","Great! Then we'll meet with them...","05/12/20",3,R.drawable.msgprofile_7))
        msglist.add(MessageData("Dustin Weatherby","Great! Then we'll meet with them...","02/12/20",0,R.drawable.msgprofile_8))
        msglist.add(MessageData("Tenisha Milo","Great! Then we'll meet with them...","29/11/20",9,R.drawable.msgprofile_9))
        msglist.add(MessageData("Tawny Jordan","Great! Then we'll meet with them...","24/11/20",4,R.drawable.msgprofile_1))

    }

}






