package com.venuri.coffeeshop

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.SignupActivity)

        var button2 = finfViewById<Button>(R.id.button1)
        button2.setOnClickListner {
        val intent2 = Intent (this,HomeActivity::class.java)
        startActivity(intent2)
}
}
}