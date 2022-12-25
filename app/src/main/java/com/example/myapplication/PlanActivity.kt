package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class PlanActivity : AppCompatActivity() {
    lateinit var details: Button
    lateinit var paiddetails: Button
    lateinit var premiumdetails: Button
    lateinit var buyheart:TextView
    lateinit var BuyHeart:TextView
    lateinit var back:ImageView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plan)
        back=findViewById(R.id.btnbackpl)
        details = findViewById(R.id.btndetails)
        paiddetails = findViewById(R.id.btnpaid)
        premiumdetails = findViewById(R.id.btnpre)
        buyheart=findViewById(R.id.txtbuyhearts)
        BuyHeart=findViewById(R.id.txtbuyheart)
        back.setOnClickListener {
            onBackPressed()
        }
        BuyHeart.setOnClickListener {
            val intent=Intent(this,BuyHeartsActivity::class.java)
            startActivity(intent)

        }
        buyheart.setOnClickListener {
            val intent=Intent(this,BuyHeartsActivity::class.java)
            startActivity(intent)

        }
        premiumdetails.setOnClickListener {
            val intent = Intent(this, PrimiumPlanDetaisActivity::class.java)
            startActivity(intent)

        }
        paiddetails.setOnClickListener {
            val intent = Intent(this, PaidPlanDetailsActivity::class.java)
            startActivity(intent)

        }
        details.setOnClickListener {
            val intent = Intent(this, FreePlanDetailsActivity::class.java)
            startActivity(intent)

        }
    }
}