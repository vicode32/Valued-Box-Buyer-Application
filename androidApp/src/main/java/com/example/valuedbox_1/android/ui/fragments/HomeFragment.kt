package com.example.valuedbox_1.android.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.valuedbox_1.android.R
import com.example.valuedbox_1.android.ui.utils.ViewPager
import com.example.valuedbox_1.android.ui.utils.RecyclerViewAdapter
import com.example.valuedbox_1.android.ui.utils.GridViewAdapter
import com.example.valuedbox_1.android.ui.model_class.Data

/**
 * Home fragment which will replace the frame layout present on the Activity_base.xml file
 * not yet done
 */


//TODO : replace the demo data (demo model class) with the original data from the backend


//TODO : to make the corresponding xml file responsive

@Suppress("DEPRECATION", "SpellCheckingInspection")
class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        return inflater.inflate(R.layout.fragment_home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        /**
         * using the common view pager from the utils package
         */
        val gridView:GridView=view.findViewById(R.id.grid_view)
        val viewMoreButton:AppCompatButton=view.findViewById(R.id.view_more_button)

        val listOfVp1:MutableList<Int?> = mutableListOf(R.drawable.vp_1,null,null,null)
        val vp1 = ViewPager(view,listOfVp1,fragmentManager,R.id.view_pager_1,R.id.worm_dots_indicator_1)
        vp1.pager()

        val listOfVp2:MutableList<Int?> = mutableListOf(R.drawable.vp_2,null,null,null)
        val vp2 =ViewPager(view,listOfVp2,fragmentManager,R.id.view_pager_2,R.id.worm_dots_indicator_2)
        vp2.pager()

        val listOfVp3:MutableList<Int?> = mutableListOf(R.drawable.vp_3,null,null,null)
        val vp3 =ViewPager(view,listOfVp3,fragmentManager,R.id.view_pager_3,R.id.worm_dots_indicator_3)
        vp3.pager()

        val listOfVp4:MutableList<Int?> = mutableListOf(R.drawable.vp_4,null,null,null)
        val vp4 =ViewPager(view,listOfVp4,fragmentManager,R.id.view_pager_4,R.id.worm_dots_indicator_4)
        vp4.pager()


        val recyclerView =view.findViewById<RecyclerView>(R.id.recyclerView)


        val list:MutableList<Int> = mutableListOf()
        list.add(R.drawable.story_1)
        list.add(R.drawable.story_2)
        list.add(R.drawable.story_3)
        list.add(R.drawable.story_4)
        list.add(R.drawable.story_5)


        /**
         * using the common recycler from the util package
         */

        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation= RecyclerView.HORIZONTAL
        val adapter = RecyclerViewAdapter(list,R.layout.recycler_container)
        recyclerView.layoutManager=linearLayoutManager
        recyclerView.adapter=adapter


        /**
         * using demo data just to show the basic working
         * viewMoreButton is use to load the rest of the data from the model class to the grid view
         */

        viewMoreButton.setOnClickListener {
            val dataList1 = Data("pritam",
                "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et",
                "Lorem ipsum dolor sit amet, consetetur",
                R.drawable.image_top_1,
                R.drawable.circular_image_1)
            val dataList2 = Data("pritam",
                "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et",
                "Lorem ipsum dolor sit amet, consetetur",
                R.drawable.image_top_2,
                R.drawable.circular_image_2)
            val dataList3 = Data("pritam",
                "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et",
                "Lorem ipsum dolor sit amet, consetetur",
                R.drawable.image_top_3,
                R.drawable.circular_image_3)
            val dataList4 = Data("pritam",
                "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et",
                "Lorem ipsum dolor sit amet, consetetur",
                R.drawable.image_top_4,
                R.drawable.circular_image_4)
            val listForGridAdapter: MutableList<Data> = mutableListOf()
            listForGridAdapter.add(dataList1)
            listForGridAdapter.add(dataList2)
            listForGridAdapter.add(dataList3)
            listForGridAdapter.add(dataList4)
            val gridViewAdapter =
                GridViewAdapter(listForGridAdapter, R.layout.container_of_grid_view)
            gridView.adapter = gridViewAdapter
        }


    }
}









