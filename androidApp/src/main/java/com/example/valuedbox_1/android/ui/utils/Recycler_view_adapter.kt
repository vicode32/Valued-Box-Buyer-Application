package com.example.valuedbox_1.android.ui.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.valuedbox_1.android.R
import com.example.valuedbox_1.android.ui.utils.RecyclerViewAdapter.ViewHolder
import de.hdodenhof.circleimageview.CircleImageView

class RecyclerViewAdapter(private var list: MutableList<Int>, private var layout_id:Int): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(layout_id, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image?.setImageResource(list[position])
        val name="seller name"
        holder.textView?.text=name
    }
    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(
        itemView!!){
        var image:CircleImageView?=itemView?.findViewById(R.id.seller_story)
        var textView: TextView?=itemView?.findViewById(R.id.seller_name)
    }
}