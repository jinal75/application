package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    lateinit var profile: Button
    lateinit var language: EditText
    lateinit var location: EditText
    lateinit var hobby: EditText
    lateinit var back:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.hide()
        back=findViewById(R.id.btnbackp)
        back.setOnClickListener {
            onBackPressed()
        }
        profile = findViewById(R.id.uploadprofile)
        profile.setOnClickListener {
            val intent = Intent(this, NavigationDrawerActivity::class.java)
            startActivity(intent)
            finish()

        }
        language = findViewById(R.id.edtlanguage)
        language.setOnClickListener {
            val intent = Intent(this, LanguageActivity::class.java)
            startActivity(intent)
            onBackPressed()

        }
        location = findViewById(R.id.edtlocation)
        location.setOnClickListener {
            val intent = Intent(this, LocationActivity::class.java)
            startActivity(intent)
            onBackPressed()


        }
        hobby = findViewById(R.id.edthobby)
        hobby.setOnClickListener {
            val intent = Intent(this, HobbyActivity::class.java)
            startActivity(intent)
            onBackPressed()


        }
    }
}
