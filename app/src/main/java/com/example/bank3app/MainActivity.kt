package com.example.bank3app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.bank3app.databinding.ActivityMainBinding
import com.example.bank3app.navigationview.ChatFragment
import com.example.bank3app.navigationview.HomeFragment
import com.example.bank3app.navigationview.ProfieFragment
import com.example.bank3app.navigationview.TransactionFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.Home -> replaceFragment(HomeFragment())
                R.id.Transaction -> replaceFragment(TransactionFragment())
                R.id.Chat -> replaceFragment(ChatFragment())
                R.id.Profile -> replaceFragment(ProfieFragment())

                else -> {


                }

            }

            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()

    }

}