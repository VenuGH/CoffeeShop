package com.venuri.coffeeshop

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val screen: Button = findViewById(R.id.screen3)

        screen.setOnClickListener {
            val onboardingIntent = Intent(
                this@,
                LoginActivity::class.java
            )
            startActivity(onboardingIntent)
        }
    }
}