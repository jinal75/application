package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LanguageActivity : AppCompatActivity() {
    lateinit var update: Button
    lateinit var back:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        supportActionBar?.hide()
        back=findViewById(R.id.btnbackl)
        back.setOnClickListener {
            onBackPressed()
        }
        update = findViewById(R.id.btnupdatelanguage)
        update.setOnClickListener {
            val intent = Intent(this, BottomNavigationActivity::class.java)
            startActivity(intent)
        }
    }
}