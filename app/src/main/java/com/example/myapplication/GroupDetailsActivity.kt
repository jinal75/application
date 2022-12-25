package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class GroupDetailsActivity : AppCompatActivity() {
    lateinit var back:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_details)
        back=findViewById(R.id.backg)
        back.setOnClickListener {
            onBackPressed()
        }
    }
}