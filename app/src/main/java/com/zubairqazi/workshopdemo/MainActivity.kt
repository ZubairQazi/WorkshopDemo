package com.zubairqazi.workshopdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

const val EXTRA_MESSAGE = "com.zubairqazi.workshopdemo.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Creates a toast with a short duration
    fun sayHello(view: View) {
        Toast.makeText(this, "Cutie Hack is Awesome!!!", Toast.LENGTH_SHORT).show()
    }

    // 1 - Create intent with message data added
    // 2 - Start display message activity
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.enterMessageField)
        val message = if (editText.text.toString().isEmpty()) {
            "No Input..."
        } else {
            editText.text.toString()
        }
        Intent(this, DisplayActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }.also {
            startActivity(it)
        }
    }
}