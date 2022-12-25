package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class PaidPlanDetailsActivity : AppCompatActivity() {
    lateinit var BuyHearts: Button
    lateinit var PlanUpgrade: Button
    lateinit var back:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paid_plan_details)
        back=findViewById(R.id.btnfree)
        back.setOnClickListener {
            onBackPressed()
        }
        BuyHearts=findViewById(R.id.btnByHearts)
        BuyHearts.setOnClickListener {
            val intent= Intent(this,BuyHeartsActivity::class.java)
            startActivity(intent)

        }
        PlanUpgrade=findViewById(R.id.btnUpgradePlan)
        PlanUpgrade.setOnClickListener {
            val intent= Intent(this,BuyHeartsActivity::class.java)
            startActivity(intent)

        }
    }
}