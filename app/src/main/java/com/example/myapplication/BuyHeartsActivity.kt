package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class BuyHeartsActivity : AppCompatActivity() {
    lateinit var back:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_hearts)
        back=findViewById(R.id.btnfree)
        back.setOnClickListener {
            onBackPressed()
        }
    }
}