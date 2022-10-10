package com.example.simplegames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class UserActivity : AppCompatActivity() {
    private lateinit var user1: EditText
    private lateinit var user2: EditText
    private lateinit var textAccept: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        user1 = findViewById(R.id.user1)
        user2 = findViewById(R.id.user2)
        textAccept = findViewById(R.id.textAccept)

        textAccept.setOnClickListener {
            if (user1.text.isNotEmpty() && user2.text.isNotEmpty()) {
                val intent = Intent(this, MainActivity::class.java)
                val name1 = user1.text.toString().trim()
                val name2 = user2.text.toString().trim()

                intent.putExtra("name1", name1)
                intent.putExtra("name2", name2)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}