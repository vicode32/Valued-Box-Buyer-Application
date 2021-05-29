package com.example.valuedbox_1.android.ui

import android.app.Application
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import com.example.valuedbox_1.Greeting
import android.widget.TextView
import com.example.valuedbox_1.android.R

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<LinearLayout>(R.id.first);
        button.setOnClickListener {
            val intent = Intent(this, login_signup::class.java)
            startActivity(intent)
        }


    }
}
