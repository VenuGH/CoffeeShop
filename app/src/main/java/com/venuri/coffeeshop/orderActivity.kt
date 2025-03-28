package com.venuri.coffeeshop

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class orderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.orderActivity)

        var button3 =findViewById<Button>(R.id.button6)
        button3.setOnClickListner {
            val intent3 = Intent (this, reviewOrderActivity::class.java)
        startActivity(intent3)
        }

        var button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent4 = Intent (this, homeActivity::class.java)
            startActivity(intent4)
        }
    }
}

