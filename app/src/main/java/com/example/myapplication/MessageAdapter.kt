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
import kotlinx.android.synthetic.main.item_dashoard_adapter.view.*
import kotlinx.android.synthetic.main.item_message_adapter.view.*

class MessageAdapter (val context: Context?, val msglist: ArrayList<MessageData>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewsHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var first: LinearLayout? = null;
       var second: LinearLayout?=null
        init {
           first = itemView?.findViewById(R.id.msgback)
          //  second=itemView?.findViewById(R.id.grpback)


        }
    }
    lateinit var recyclerView: RecyclerView


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_message_adapter, parent, false)
        )


    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.msgback.setOnClickListener {
            Toast.makeText(context, "Group Data", Toast.LENGTH_SHORT).show()
            val intentone= Intent(context,MessageActivity::class.java)
            context?.startActivity(intentone)
        }
        //holder.itemView.grpback.setOnClickListener {
        // val intent=Intent(context,GroupDetailsActivity::class.java)
        //context?.startActivity(intent)
        //}

        holder.itemView.findViewById<TextView>(R.id.txtmsgperson).text=msglist[position].msgperson
        holder.itemView.findViewById<TextView>(R.id.txtmsg).text=msglist[position].msg
        holder.itemView.findViewById<TextView>(R.id.txtmsgtime).text=msglist[position].msgtime
        holder.itemView.findViewById<TextView>(R.id.txtnumber).text=msglist[position].msgnumber.toString()
        if (context != null) {
            Glide.with(context).load(msglist[position].msgimg).into(holder.itemView.findViewById(R.id.msgimg))
          //  Glide.with(context).load(dashlist[position].Imagegender).into(holder.itemView.findViewById(R.id.genderimg))
        }
//val textView:TextView?=null
        // if (textView != null) {
        // textView.findViewById<TextView>(R.id.txtage)
        // }
        // textView!!.setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(context!!,R.drawable.ic_femenine),null,null,null);

        // textView.setCompoundDrawablePadding(20);
    }

    override fun getItemCount(): Int =msglist.size

}


