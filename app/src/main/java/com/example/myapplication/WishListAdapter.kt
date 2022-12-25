package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_grp_adapter.view.*
import kotlinx.android.synthetic.main.item_wishlist_adapter.view.*

class WishListAdapter(val context: Context?, val wishlist: ArrayList<wishlistdata>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class ViewsHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var first: LinearLayout? = null

        init {
            first = itemView?.findViewById(R.id.wishback)


        }
    }

    lateinit var recyclerView: RecyclerView


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_wishlist_adapter, parent, false)
        )

    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.wishback.setOnClickListener {
            Toast.makeText(context, "Details Activity", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, DetailsActivity::class.java)
            context?.startActivity(intent)
        }
        // holder.itemView.findViewById<TextView>(R.id.txtname).text=wishlist[position].name
        //   holder.itemView.findViewById<TextView>(R.id.txtcity).text=wishlist[position].city
        // holder.itemView.findViewById<TextView>(R.id.txtage).text=wishlist[position].age
//val textView:TextView?=null
        // if (textView != null) {
        // textView.findViewById<TextView>(R.id.txtage)
        // }
        // textView!!.setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(context!!,R.drawable.ic_femenine),null,null,null);

        // textView.setCompoundDrawablePadding(20);
    }

    override fun getItemCount(): Int = 10

}


