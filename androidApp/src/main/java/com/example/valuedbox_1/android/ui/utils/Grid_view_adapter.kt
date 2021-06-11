package com.example.valuedbox_1.android.ui.utils

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.valuedbox_1.android.R
import com.example.valuedbox_1.android.ui.model_class.Data
import de.hdodenhof.circleimageview.CircleImageView

class GridViewAdapter(private val list: MutableList<Data>, private val layout_id: Int): BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
       return list[position]
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val inflater = parent?.context?.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(layout_id,null)
        val sellerName:TextView=view.findViewById(R.id.seller_name)
        val shortDesc:TextView=view.findViewById(R.id.short_desc)
        val info:TextView=view.findViewById(R.id.text_info)
        val circularImage:CircleImageView=view.findViewById(R.id.circular_image)
        val imageTop:ImageView=view.findViewById(R.id.image_top)

            sellerName.text= list[position].seller_name
            shortDesc.text=list[position].short_desc
            info.text=list[position].info
            circularImage.setImageResource(list[position].circular_image)
            imageTop.setImageResource(list[position].image_top)

        return view
    }
}