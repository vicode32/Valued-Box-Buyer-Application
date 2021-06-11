package com.example.valuedbox_1.android.ui.activity.login_signup_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.valuedbox_1.android.R
import com.example.valuedbox_1.android.ui.activity.base_activity.BaseActivity


/**
 * Activity for Sign Up
 * not completed
 */
class SignupPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)

        val intent = Intent(this, BaseActivity::class.java)
        startActivity(intent)

    //TODO: logic for sign Up with backend
        //TODO : have to improve the icon and its sorroundings in the rescetative layout file
    }
}