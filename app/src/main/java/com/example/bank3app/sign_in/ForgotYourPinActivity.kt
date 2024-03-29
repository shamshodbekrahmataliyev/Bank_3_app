package com.example.bank3app.sign_in

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bank3app.MainActivity
import com.example.bank3app.R

class ForgotYourPinActivity : AppCompatActivity() {

    private lateinit var imageView1 : ImageView
    private lateinit var imageView2 : ImageView
    private var isImage1Selected = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_your_pin)

        val next = findViewById<ImageView>(R.id.nextBtn)
        next.setOnClickListener {

            val intent = Intent(this@ForgotYourPinActivity,MainActivity::class.java)
                startActivity(intent)
        }
        imageView1= findViewById(R.id.check1)
        imageView2= findViewById(R.id.check2)


        imageView1.setOnClickListener {
            if (isImage1Selected) {
                imageView1.setImageResource(R.drawable.check)
                isImage1Selected = false
            } else {
                imageView1.setImageResource(R.drawable.check2)
                isImage1Selected = true
            }
        }
        imageView2.setOnClickListener {
            if (isImage1Selected) {
                imageView2.setImageResource(R.drawable.check)
                isImage1Selected = false
            } else {
                imageView2.setImageResource(R.drawable.check2)
                isImage1Selected = true
            }
        }

    }
}