package com.example.valuedbox_1.android.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.valuedbox_1.android.R

class login_signup : AppCompatActivity() {
    var login:Button?=null
    var signup:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_signup)

        login=findViewById<Button>(R.id.login)
        signup=findViewById(R.id.sign_up)


        login?.setOnClickListener {
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)
        }
        signup?.setOnClickListener {
            val intent = Intent(this, signup_page::class.java)
            startActivity(intent)
        }
}
    }