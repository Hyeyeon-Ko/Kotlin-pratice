package com.example.listview_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("a", "b"))
        list_item.add(ListViewModel("c", "d"))
        list_item.add(ListViewModel("e", "f"))

        val listview = findViewById<ListView>(R.id.mainListview)
        val listAdapter = ListViewAdapter(list_item)

        listview.adapter = listAdapter // 리스트뷰 어댑터에 우리가 만든 어댑터 연결
                                       // listview_item.xml <-> activity_main.xml 연결

    }
}