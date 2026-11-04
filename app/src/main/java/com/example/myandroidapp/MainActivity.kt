package com.example.myandroidapp

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(245, 247, 250))
        }

        val title = TextView(this).apply {
            text = "My Android App"
            textSize = 30f
            setTextColor(Color.rgb(25, 35, 55))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Built using Kotlin and GitHub"
            textSize = 16f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 16, 0, 32)
        }

        val button = Button(this).apply {
            text = "Get Started"
            setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Your app is working!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(button)

        setContentView(layout)
    }
}