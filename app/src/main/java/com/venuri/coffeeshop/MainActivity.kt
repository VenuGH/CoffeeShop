package com.venuri.coffeeshop

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)

        Handler().postDelayed({
            val onboardingIntent = Intent(
                this@MainActivity,
                Onboarding1Activity::class.java
            )
            startActivity(onboardingIntent)
            finish()
        }, 3000)


    }
}