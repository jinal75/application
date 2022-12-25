package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MessageActivity : AppCompatActivity() {
    lateinit var back:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
    back=findViewById(R.id.img)
        back.setOnClickListener {
            onBackPressed()
        }
    }
}