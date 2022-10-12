package com.example.listview3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.listview3.databinding.MainListItemBinding

class MainListAdapter (private val context: Context, private val MainList: MutableList<MainListItem>) : BaseAdapter() {
    override fun getCount(): Int = MainList.size

    override fun getItem(position: Int): MainListItem = MainList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding = MainListItemBinding.inflate(LayoutInflater.from(context))

        val show = MainList[position]
        val resourceId = context.resources.getIdentifier(show.icon, "drawable", context.packageName)
        binding.mlImgTitle.setImageResource(resourceId)
        binding.mlTxtTitle.text = show.title
        binding.mlTxtSubtitle.text = show.subTitle

        return binding.root

    }

}