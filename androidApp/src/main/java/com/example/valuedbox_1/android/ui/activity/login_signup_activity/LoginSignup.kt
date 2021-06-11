package com.example.valuedbox_1.android.ui.activity.login_signup_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.valuedbox_1.android.R

/**
 * Activity for login or signup page
 */

class LoginSignup : AppCompatActivity() {
    private var login:Button?=null
    private var signup:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_signup)

        login=findViewById(R.id.login)
        signup=findViewById(R.id.sign_up)

        /**
         * login button to chage to the login Activity
         * Sign Up button to change to the Sign Up Activity
         */

        login?.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }
        signup?.setOnClickListener {
            val intent = Intent(this, SignupPage::class.java)
            startActivity(intent)
        }
}
    }