package com.example.valuedbox_1.android.ui.activity.login_signup_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.example.valuedbox_1.android.R

/**
 * Splash screen Activity with the logo
 * splash screen still not implemented
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<LinearLayout>(R.id.first)
        button.setOnClickListener {
            val intent = Intent(this, LoginSignup::class.java)
            startActivity(intent)
        }

        //TODO : the logig of splash screen (to load the app and all the necessary resources before the app is opened)
    }
}
