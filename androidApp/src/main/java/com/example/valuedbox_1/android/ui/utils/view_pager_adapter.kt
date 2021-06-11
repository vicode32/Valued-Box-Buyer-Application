package com.example.valuedbox_1.android.ui.utils

import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.valuedbox_1.android.R
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator

class ViewPager(var view: View,
                private var list: MutableList<Int?>,
                private var fm: FragmentManager?, private var view_pager_id: Int, private var wormDotsIndicator_id: Int
) {
    private lateinit var viewPager1: ViewPager
    private lateinit var wormDotsIndicator1:WormDotsIndicator

    fun pager() {
        val list1: MutableList<Fragment> = mutableListOf()
        list1.add(ImageFragments1(R.layout.fragment_image_1, list[0], R.id.fm_1))
        list1.add(ImageFragments1(R.layout.fragment_image_2,list[1], R.id.fm_2))
        list1.add(ImageFragments1(R.layout.fragment_image_3,list[2], R.id.fm_3))
        list1.add(ImageFragments1(R.layout.fragment_image_4,list[3], R.id.fm_4))


        viewPager1=view.findViewById(view_pager_id)
        wormDotsIndicator1 = view.findViewById(wormDotsIndicator_id)


        val v1 : ViewPagerAdapter? = fm?.let { ViewPagerAdapter(it,list1) }
        viewPager1.adapter=v1
        wormDotsIndicator1.setViewPager(viewPager1)


    }
}

@Suppress("DEPRECATION")
class ViewPagerAdapter(fm: FragmentManager, fragment:List<Fragment>?) :androidx.fragment.app.FragmentPagerAdapter(fm){
    private var list:List<Fragment>? = fragment
    override fun getCount(): Int {
        return list!!.size

    }

    override fun getItem(position: Int): Fragment {
        return list!![position]
    }


}