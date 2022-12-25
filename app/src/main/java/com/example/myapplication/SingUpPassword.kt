package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SingUpPassword : AppCompatActivity() {
    lateinit var letgo: Button
    lateinit var back:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up_password)
        supportActionBar?.hide()
        back=findViewById(R.id.btnback)
        back.setOnClickListener {
            onBackPressed()
        }
        letgo = findViewById(R.id.btngo)
        letgo.setOnClickListener {
            val intent = Intent(this, SinginActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}