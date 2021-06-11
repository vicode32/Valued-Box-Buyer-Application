package com.example.valuedbox_1.android.ui.activity.base_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.valuedbox_1.android.R
import com.example.valuedbox_1.android.ui.fragments.EventFragment
import com.example.valuedbox_1.android.ui.fragments.HomeFragment
import com.example.valuedbox_1.android.ui.fragments.ProductFragment
import com.example.valuedbox_1.android.ui.fragments.ServicesFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


/**

 Activity for the fragment,
 this activity contains the four fragment
 the four fragments are present in the fragments package
 **/

class BaseActivity : AppCompatActivity() {
    private var buttonNavigation:BottomNavigationView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        buttonNavigation= findViewById(R.id.bottom_navigation)

        /**
         * onClick event listener is used to listen to the click in the navigation bottom
         * home for home fragment
         * product for product fragment
         * services for services fragment
         * event for event fragment
         * **/
        buttonNavigation!!.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    val fragment = HomeFragment()
                    fragmentTransaction(fragment)
                    true
                }
                R.id.product -> {
                    val fragment =ProductFragment()
                    fragmentTransaction(fragment)
                    true
                }
                R.id.services -> {
                    val fragment =ServicesFragment()
                    fragmentTransaction(fragment)
                    true
                }
                R.id.events -> {
                    val fragment =EventFragment()
                    fragmentTransaction(fragment)
                    true
                }
                else -> false

            }
        }
    }

    /**
     * function to change between fragments
     * **/

    private fun fragmentTransaction(fragment: Fragment) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.frame_layout,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}