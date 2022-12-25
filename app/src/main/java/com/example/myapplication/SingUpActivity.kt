package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SingUpActivity : AppCompatActivity() {
    lateinit var singin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)
        supportActionBar?.hide()
        singin = findViewById(R.id.txtsingin)
        singin.setOnClickListener {
            val intent = Intent(this, SingUpNameActivity::class.java)
            startActivity(intent)
            finish()


        }
    }
}