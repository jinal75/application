package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.myapplication.SingUpEmailActivity

class SingUpBirthDayActivity : AppCompatActivity() {
    lateinit var con: Button
    lateinit var back:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up_birth_day)
        supportActionBar?.hide()
        back=findViewById(R.id.btnback)
        back.setOnClickListener {
            onBackPressed()

        }
        con = findViewById(R.id.btncon1)
        con.setOnClickListener {
            val intent = Intent(this, SingUpEmailActivity::class.java)
            startActivity(intent)
            finish()


        }
    }
}