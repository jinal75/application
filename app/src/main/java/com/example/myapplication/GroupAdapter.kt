package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_group_adapter.view.*


class GroupAdapter(val context: Context?, val grplist: ArrayList<GroupData>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class ViewsHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var first: LinearLayout? = null;
        init {
            first = itemView?.findViewById(R.id.grpback)


        }
    }
    // lateinit var join:Button


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_group_adapter, parent, false)
        )


    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
      holder.itemView.grpback.setOnClickListener {
          Toast.makeText(context, "Details Activity", Toast.LENGTH_SHORT).show()
        val intent=Intent(context,DetailsActivity::class.java)
         context?.startActivity(intent)
      }



        //holder.itemView.findViewById<TextView>(R.id.txtgrpname).text=grplist[position].grpname
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
