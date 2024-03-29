package com.example.bank3app

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FundTransferActivity : AppCompatActivity() {

    private lateinit var Button1 : Button
    private lateinit var Button2 : Button
    private lateinit var Button3 : Button
    private var isButton1Selected = true
    private var isButton2Selected = true
    private var isButton3Selected = true

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fund_transfer)
        Button1= findViewById(R.id.AppcompatButton1)
        Button2 = findViewById(R.id.AppcompatButton2)
        Button3 = findViewById(R.id.AppcompatButton3)


        Button1.setOnClickListener {
            if (isButton1Selected) {
                Button1.setBackgroundColor(R.color.red_light)
                isButton1Selected = false
            } else {
                Button1.setBackgroundColor(R.color.green)
                isButton1Selected = true
            }
        }
        Button2.setOnClickListener {
            if (isButton2Selected) {
                Button2.setBackgroundColor(R.color.red_light)
                isButton2Selected = false
            } else {
                Button2.setBackgroundColor(R.color.green)
                isButton2Selected = true
            }
        }
        Button3.setOnClickListener {
            if (isButton3Selected) {
                Button3.setBackgroundColor(R.color.red_light)
                isButton3Selected = false
            } else {
                Button3.setBackgroundColor(R.color.green)
                isButton3Selected = true
            }
        }

    }
}