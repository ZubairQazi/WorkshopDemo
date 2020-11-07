package com.zubairqazi.workshopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Retrieve message data
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Set upper textview to received text
        findViewById<TextView>(R.id.receiveTextField).apply {
            text = message
        }

        // Initialiaze count and set textview
        var count = 0
        val countText = findViewById<TextView>(R.id.countText)

        countText.text = count.toString()

        // Increment count on click, and update textview
        val addButton = findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener {
            count += 1
            countText.text = count.toString()
        }

        // Decrement count on click, and update textview
        val subButton = findViewById<Button>(R.id.subButton)
        subButton.setOnClickListener {
            count -= 1
            countText.text = count.toString()
        }
    }
}