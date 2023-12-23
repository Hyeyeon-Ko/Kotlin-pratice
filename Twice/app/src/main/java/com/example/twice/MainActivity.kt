package com.example.twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val twice1 = findViewById<ImageView>(R.id.member1)
        val twice2 = findViewById<ImageView>(R.id.member2)
        val twice3 = findViewById<ImageView>(R.id.member3)
        val twice4 = findViewById<ImageView>(R.id.member4)
        val twice5 = findViewById<ImageView>(R.id.member5)
        val twice6 = findViewById<ImageView>(R.id.member6)
        val twice7 = findViewById<ImageView>(R.id.member7)
        val twice8 = findViewById<ImageView>(R.id.member8)
        val twice9 = findViewById<ImageView>(R.id.member9)


        // == 사진 클릭했을 경우 data 값 같이 넘기기 == //

        twice1.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)
        }

        twice2.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }

        twice3.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)
        }

        twice4.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)
        }

        twice5.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)
        }

        twice6.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "6")
            startActivity(intent)
        }

        twice7.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "7")
            startActivity(intent)
        }

        twice8.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "8")
            startActivity(intent)
        }

        twice9.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "9")
            startActivity(intent)
        }

    }
}