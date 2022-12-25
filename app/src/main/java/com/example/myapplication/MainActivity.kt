package com.example.myapplication

import android.content.Intent
import android.icu.util.UniversalTimeScale.toLong
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    internal val SPALSH_TIME_OUT = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this, SingUpActivity::class.java)
            startActivity(intent)
            finish()
        }, SPALSH_TIME_OUT)
    }
}