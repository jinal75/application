package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EditTextDifferentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text_different)
        supportActionBar?.hide()
    }
}