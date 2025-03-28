package com.venuri.coffeeshop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        var loginbutton = findViewById<Button>(R.id.loginbutton)
        loginbutton.setOnClickListener {
            val intent1 = Intent (this, SignupActivity::class.java)
            startActivity(intent1)
        }
    }
}