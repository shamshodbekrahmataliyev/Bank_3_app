package com.example.bank3app.start_window

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bank3app.R

class Start3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start3)
        val nextbtn = findViewById<ImageView>(R.id.nextbtn3)

        nextbtn.setOnClickListener {
            val intent = Intent(this@Start3Activity,Start4Activity::class.java)
            startActivity(intent)
        }
    }
}