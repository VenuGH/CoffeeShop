package com.venuri.coffeeshop

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboarding3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding3)

        val screen: View = findViewById(R.id.screen3)

        screen.setOnClickListener {
            val onboardingIntent = Intent(
                this@Onboarding3Activity,
                LoginActivity::class.java
            )
            startActivity(onboardingIntent)
        }
    }
}