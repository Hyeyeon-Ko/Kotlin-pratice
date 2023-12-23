package com.example.val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // == val, var 비교 == //
        val value1 = "value1 입니다"
        var value2 = "value2 입니다"

        // value1 = "value1 값은 수정이 안됩니다"
        value2 = "value2 값은 수정이 됩니다."


        // == Log 종류 == //
        Log.e("MainActivity", "testLog") // 오류
        Log.w("MainActivity", "testLog") // 경고
        Log.i("MainActivity", "testLog") // 정보
        Log.d("MainActivity", "testLog") // 디버그
        Log.v("MainActivity", "testLog") // 상세

    }
}