package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.example.myapplication.fragment.CreateGroupFragment
import kotlinx.android.synthetic.main.item_dashoard_adapter.view.*
import kotlinx.android.synthetic.main.item_grp_adapter.view.*


class DashBoardAdapter (val context: Context?, val dashlist: ArrayList<DashboardData>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewsHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
      var first: LinearLayout? = null;
        var second:LinearLayout?=null
        init {
           first = itemView?.findViewById(R.id.dashback)
           second=itemView?.findViewById(R.id.grpback)


        }
    }
    lateinit var recyclerView: RecyclerView


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_dashoard_adapter, parent, false)
        )


    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.dashback.setOnClickListener {
           Toast.makeText(context, "Geoup Data", Toast.LENGTH_SHORT).show()
           val intentone=Intent(context,DetailsActivity::class.java)
            context?.startActivity(intentone)
        }
        //holder.itemView.grpback.setOnClickListener {
           // val intent=Intent(context,GroupDetailsActivity::class.java)
            //context?.startActivity(intent)
        //}

        holder.itemView.findViewById<TextView>(R.id.txtDname).text=dashlist[position].name
          holder.itemView.findViewById<TextView>(R.id.txtDcity).text=dashlist[position].city
         holder.itemView.findViewById<TextView>(R.id.txtDage).text=dashlist[position].age
        if (context != null) {
            Glide.with(context).load(dashlist[position].image).into(holder.itemView.findViewById(R.id.dashimg))
            Glide.with(context).load(dashlist[position].Imagegender).into(holder.itemView.findViewById(R.id.genderimg))
        }
//val textView:TextView?=null
        // if (textView != null) {
        // textView.findViewById<TextView>(R.id.txtage)
        // }
        // textView!!.setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(context!!,R.drawable.ic_femenine),null,null,null);

        // textView.setCompoundDrawablePadding(20);
    }

    override fun getItemCount(): Int = dashlist.size

}



