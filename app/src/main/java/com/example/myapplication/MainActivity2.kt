package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val per = findViewById<TextView>(R.id.exitfromactivity)
        per.setOnClickListener {
            val perehod = Intent(this, MainActivity::class.java)
            startActivity(perehod)
        }
    }
}