package com.example.bank3app.start_window

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.bank3app.R
import com.example.bank3app.sign_in.SignInActivity

class Start4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start4)
        val nextbtn = findViewById<ImageView>(R.id.nextbtn4)

        nextbtn.setOnClickListener {
            val intent = Intent(this@Start4Activity,SignInActivity::class.java)
            startActivity(intent)
        }
    }
}