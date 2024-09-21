package com.example.explicitintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btnIntent = findViewById<Button>(R.id.button)
        btnIntent.setOnClickListener {
            // open a new activity
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
            
        }
    }
}
