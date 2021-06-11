package com.example.valuedbox_1.android.ui.utils

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

/**
 * this class is used by the ViewPagerAdapter
 * class to create different objects of fragment and to use it in the fragment
 * nothing is to be done here
 */

class ImageFragments1 (private var ID: Int, private var image_id: Int?, private var layout_id: Int): Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        return inflater.inflate(ID, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val linearLayout:LinearLayout =view.findViewById(layout_id)
        if (image_id!=null)
            linearLayout.setBackgroundResource(image_id!!)
    }
}