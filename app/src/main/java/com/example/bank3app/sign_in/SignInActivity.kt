package com.example.bank3app.sign_in

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bank3app.MainActivity
import com.example.bank3app.R
import com.example.bank3app.start_window.Start4Activity

class SignInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        var nexttxt = findViewById<TextView>(R.id.SignUptxt)
        var backimg = findViewById<ImageView>(R.id.backimgIn)
        var nextimg = findViewById<ImageView>(R.id.nextUp)
        nexttxt.setOnClickListener {
            val intent = Intent(this@SignInActivity,SignUpActivity::class.java)
            startActivity(intent)
        }
        backimg.setOnClickListener {
            val intent = Intent(this@SignInActivity,Start4Activity::class.java)
            startActivity(intent)
        }
        nextimg.setOnClickListener {
            val intent = Intent(this@SignInActivity,MainActivity::class.java)
            startActivity(intent)
        }
            val forget = findViewById<TextView>(R.id.forgottxt)
            forget.setOnClickListener {
                val intent = Intent(this@SignInActivity,ForgotYourPinActivity::class.java)
                    startActivity(intent)
            }
    }
}