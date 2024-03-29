package com.example.bank3app.start_window

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bank3app.R
import com.google.android.material.button.MaterialButton

class Start1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start1)
        val nextbtn = findViewById<ImageView>(R.id.nextbtn1)

        nextbtn.setOnClickListener {
            val intent = Intent(this@Start1Activity,Start2Activity::class.java)
            startActivity(intent)
        }
    }
}