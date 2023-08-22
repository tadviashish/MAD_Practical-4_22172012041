package com.example.mad_practical_4_22172012041

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val button1: Button = findViewById(R.id.login)
        button1.setOnClickListener {
            Intent(this, LoginActivity::class.java).also { startActivity(it) }

        }
    }
}