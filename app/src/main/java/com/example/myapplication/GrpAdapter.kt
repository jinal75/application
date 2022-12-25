package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_grp_adapter.view.*


class GrpAdapter(val context: Context?, val grplist: ArrayList<GroupData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class ViewsHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var first: LinearLayout? = null;

        init {
            first = itemView?.findViewById(R.id.grpback)


        }
    }


    // lateinit var join:Button


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_grp_adapter, parent, false)
        )


    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.grpback.setOnClickListener {
            Toast.makeText(context, "Details Activity", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, GroupDetailsActivity::class.java)
            context?.startActivity(intent)
       }


      //  holder.itemView.findViewById<TextView>(R.id.txtgrpname).text=grplist[position].grpname
        // holder.itemView.findViewById<TextView>(R.id.txtname).text=grplist[position].name
      //  if (context != null) {
           // Glide.with(context).load(grplist[position].image).into(holder.itemView.findViewById(R.id.grpimage))
       // }

        // holder.itemView.findViewById<TextView>(R.id.txtcity).text=grplist[position].
         //holder.itemView.findViewById<TextView>(R.id.txtage).text=grplist[position].age
//val textView:TextView?=null
        // if (textView != null) {
        // textView.findViewById<TextView>(R.id.txtage)
        // }
        // textView!!.setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(context!!,R.drawable.ic_femenine),null,null,null);

        // textView.setCompoundDrawablePadding(20);
    }

    override fun getItemCount(): Int = 10

}


