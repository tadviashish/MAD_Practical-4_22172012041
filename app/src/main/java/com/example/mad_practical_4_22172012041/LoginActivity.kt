package com.example.mad_practical_4_22172012041

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button:Button = findViewById(R.id.signup)
        button.setOnClickListener{
            Intent(this,RegistrationActivity::class.java).also { startActivity(it) }

        }
    }
}