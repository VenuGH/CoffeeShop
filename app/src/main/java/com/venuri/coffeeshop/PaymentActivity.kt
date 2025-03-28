package com.venuri.coffeeshop

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.PaymentActivity)

        var button6 =findViewById<Button>(R.id.button6)
        button6.setOnClickListner {
            val intent5 = Intent (this, FinalpageActivity::class.java)
            startActivity(intent5)
        }

        var button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent5 = Intent (this, ReviewOrderActivity::class.java)
            startActivity(intent4)
        }
    }
}