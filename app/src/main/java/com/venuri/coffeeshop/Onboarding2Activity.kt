package com.venuri.coffeeshop

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Onboarding2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oboarding2)

        val screen: View = findViewById(R.id.screen)

        screen.setOnClickListener {
            val onboardingIntent = Intent(
                this@Onboarding2Activity,
                Onboarding3Activity::class.java
            )
            startActivity(onboardingIntent)
        }
    }
}