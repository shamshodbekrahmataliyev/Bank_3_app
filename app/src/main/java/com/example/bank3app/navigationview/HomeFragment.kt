package com.example.bank3app.navigationview

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.example.bank3app.FundTransferActivity
import com.example.bank3app.R

class HomeFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        val card1 : CardView = view.findViewById(R.id.card1)
        card1.setOnClickListener {
            val intent = Intent(activity,FundTransferActivity::class.java)
            startActivity(intent)
        }
        val card2 : CardView = view.findViewById(R.id.card2)
        card2.setOnClickListener {
            val intent = Intent(activity,FundTransferActivity::class.java)
            startActivity(intent)
        }
        val card3 : CardView = view.findViewById(R.id.card3)
        card3.setOnClickListener {
            val intent = Intent(activity,FundTransferActivity::class.java)
            startActivity(intent)
        }
        val card4 : CardView = view.findViewById(R.id.card4)
        card4.setOnClickListener {
            val intent = Intent(activity,FundTransferActivity::class.java)
            startActivity(intent)
        }
        val card5 : CardView = view.findViewById(R.id.card5)
        card5.setOnClickListener {
            val intent = Intent(activity,FundTransferActivity::class.java)
            startActivity(intent)
        }
        val card6 : CardView = view.findViewById(R.id.card6)
        card6.setOnClickListener {
            val intent = Intent(activity,FundTransferActivity::class.java)
            startActivity(intent)
        }
        val card7 : CardView = view.findViewById(R.id.card7)
        card7.setOnClickListener {
            val intent = Intent(activity,FundTransferActivity::class.java)
            startActivity(intent)
        }
        val card8 : CardView = view.findViewById(R.id.card8)
        card8.setOnClickListener {
            val intent = Intent(activity, FundTransferActivity::class.java)
            startActivity(intent)
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() =  HomeFragment()
    }
}