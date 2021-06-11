package com.example.valuedbox_1.android.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.valuedbox_1.android.R

/**
 * Product fragment which will replace the frame layout present on the Activity_base.xml file
 * not yet done
 */
class ProductFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        return inflater.inflate(R.layout.fragment_product, container, false)
    }
    //TODO : nothing is done
}