package com.example.listview_second_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<ListViewModel>) : BaseAdapter() {

    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var p1 = p1

        if (p1 == null) {
            p1 = LayoutInflater.from(p2?.context).inflate(R.layout.listview_item, p2, false)
        }

        var text1 = p1!!.findViewById<TextView>(R.id.listviewItemText)
        text1.text = List[p0].text1

        var text2 = p1!!.findViewById<TextView>(R.id.listviewItemText2)
        text2.text = List[p0].text2


        return p1!!

    }
}