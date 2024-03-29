package com.example.bank3app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bank3app.start_window.Start1Activity
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val nextbtn = findViewById<MaterialButton>(R.id.nextbtn)

        nextbtn.setOnClickListener {
            val intent = Intent(this@HomeActivity,Start1Activity::class.java)
            startActivity(intent)
        }
    }
}