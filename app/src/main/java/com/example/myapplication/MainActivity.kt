package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val per = findViewById<TextView>(R.id.hw)
        per.setOnClickListener {
            val perehod = Intent(this, MainActivity2::class.java)
            startActivity(perehod)
        }
    }
}