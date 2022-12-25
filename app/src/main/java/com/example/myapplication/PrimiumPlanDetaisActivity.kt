package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class PrimiumPlanDetaisActivity : AppCompatActivity() {
    lateinit var BuyHearts:Button
    lateinit var PlanUpgrade:Button
    lateinit var back:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primium_plan_detais)
        back=findViewById(R.id.btnfree)
        PlanUpgrade=findViewById(R.id.btnupgrade)
        BuyHearts=findViewById(R.id.btnbyhearts)
        BuyHearts.setOnClickListener {
            val intent= Intent(this,BuyHeartsActivity::class.java)
            startActivity(intent)

        }

        PlanUpgrade.setOnClickListener {
            val intent= Intent(this,BuyHeartsActivity::class.java)
            startActivity(intent)

        }
        back.setOnClickListener {
            onBackPressed()
        }
    }
}