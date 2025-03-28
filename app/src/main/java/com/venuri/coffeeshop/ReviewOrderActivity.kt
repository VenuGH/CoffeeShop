package com.venuri.coffeeshop

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReviewOrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ReviewOrderActivity)

        var button5 =findViewById<Button>(R.id.button5)
        button5.setOnClickListner {
            val intent4 = Intent (this, PaymentActivity::class.java)
            startActivity(intent4)
        }

        var button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent4 = Intent (this, orderActivity::class.java)
            startActivity(intent4)
        }
    }
}