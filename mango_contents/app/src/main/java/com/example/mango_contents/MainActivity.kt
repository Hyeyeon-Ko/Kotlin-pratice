package com.example.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() { // item들 나열 되어있는 MainActivity

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // bookmarkBtn 누르면, BookmarkActivity로
        val bookmarkBtn = findViewById<TextView>(R.id.bookmarkBtn)
        bookmarkBtn.setOnClickListener {

            val intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)

        }

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/445004",
                "https://img.siksinhot.com/place/1676000887417333.jpg?w=307&h=300&c=Y",
                "세야스시"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/349263",
                "https://img.siksinhot.com/place/1462946564336361.png?w=307&h=300&c=Y",
                "미 피아체"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/10695",
                "https://img.siksinhot.com/place/1492161933106685.jpg?w=307&h=300&c=Y",
                "페어링룸"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/350600",
                "https://img.siksinhot.com/place/1460622895364757.png?w=307&h=300&c=Y",
                "밍글스"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/315233",
                "https://img.siksinhot.com/place/1453173971950464.jpg?w=307&h=300&c=Y",
                "톡톡"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/366545",
                "https://img.siksinhot.com/place/1455126246233468.jpg?w=307&h=300&c=Y",
                "보트르메종"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/445004",
                "https://img.siksinhot.com/place/1676000887417333.jpg?w=307&h=300&c=Y",
                "세야스시"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/349263",
                "https://img.siksinhot.com/place/1462946564336361.png?w=307&h=300&c=Y",
                "미 피아체"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/10695",
                "https://img.siksinhot.com/place/1492161933106685.jpg?w=307&h=300&c=Y",
                "페어링룸"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/350600",
                "https://img.siksinhot.com/place/1460622895364757.png?w=307&h=300&c=Y",
                "밍글스"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/315233",
                "https://img.siksinhot.com/place/1453173971950464.jpg?w=307&h=300&c=Y",
                "톡톡"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/366545",
                "https://img.siksinhot.com/place/1455126246233468.jpg?w=307&h=300&c=Y",
                "보트르메종"
            )
        )

        // recyclerview와 Adapter 연결
        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)

        recyclerview.adapter = rvAdapter

        // item 클릭시
        // 1) ViewActivity로(해당 url)
        // 2) putExtra로 세가지 값 집어넣기
        rvAdapter.itemClick = object : RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {

                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url", items[position].url)
                intent.putExtra("imageUrl", items[position].imageUrl)
                intent.putExtra("title", items[position].titleText)
                startActivity(intent)

            }
        }

        // 두줄씩 띄우기
        recyclerview.layoutManager = GridLayoutManager(this, 2)

    }
}