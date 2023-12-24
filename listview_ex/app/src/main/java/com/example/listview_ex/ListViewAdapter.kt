package com.example.listview_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text

class ListViewAdapter(val List : MutableList<ListViewModel>) : BaseAdapter() { // 문자열 데이터를 받겠다.
    override fun getCount(): Int { // listView 개수
        return List.size // list의 크기만큼
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {
        var p1 = p1

        if (p1 == null) {
            p1 = LayoutInflater.from(p2?.context).inflate(R.layout.listview_item, p2, false) // listview_item.xml에 있는 view를 가져오는 코드
        }

        // List[0] -> ListViewModel("a", "b")
        // List[0] -> ListViewModel("c", "d")
        // List[0] -> ListViewModel("e", "f")
        val title = p1!!.findViewById<TextView>(R.id.listviewItem)
        title.text = List[p0].title

        val content = p1!!.findViewById<TextView>(R.id.listviewItem2)
        content.text = List[p0].content

        return p1!!
    }
}