package com.example.bank3app.sign_in

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bank3app.R
import com.example.bank3app.start_window.Start4Activity

class SignUpActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        var nexttxt = findViewById<TextView>(R.id.SignIntxt)
        var backimgUp = findViewById<ImageView>(R.id.backimgUp)
        nexttxt.setOnClickListener {
            val intent = Intent(this@SignUpActivity, SignInActivity::class.java)
            startActivity(intent)
        }
        backimgUp.setOnClickListener {
            val intent = Intent(this@SignUpActivity, Start4Activity::class.java)
            startActivity(intent)
        }
    }
}