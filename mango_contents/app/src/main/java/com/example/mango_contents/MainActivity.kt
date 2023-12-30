package com.example.mango_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)

        recyclerview.adapter = rvAdapter

        recyclerview.layoutManager = GridLayoutManager(this, 2)

    }
}