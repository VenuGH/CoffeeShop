package com.venuri.coffeeshop

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Onboarding1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding1)

        val screen: View = findViewById(R.id.screen)

        screen.setOnClickListener {
            val onboardingIntent = Intent(
                this@Onboarding1Activity,
                Onboarding2Activity::class.java
            )
            startActivity(onboardingIntent)
        }
    }
}