package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HobbyActivity : AppCompatActivity() {
    lateinit var update: Button
    lateinit var back:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)
        supportActionBar?.hide()
        back=findViewById(R.id.btnbackl)
        back.setOnClickListener {
            onBackPressed()
        }
        update = findViewById(R.id.updatehobby)
        update.setOnClickListener {
            val intent = Intent(this, LocationActivity::class.java)
            startActivity(intent)
        }


    }
}