package com.example.tro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class numbers : AppCompatActivity() {
    companion object{
        const val TOTAL_CNT = "ttl_cnt"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)
        shRndNum()
    }

    fun shRndNum (){
        val v = findViewById<TextView>(R.id.textView)
        val v3 = findViewById<TextView>(R.id.textView3)

        val cnt = intent.getIntExtra(TOTAL_CNT,0)
        val rnd = Random(cnt)
        var randomInt = 0

        if (cnt>0) {
            randomInt = rnd.nextInt(cnt + 1)
        }
        v.text = getString(R.string.rand_heading, cnt)
        v3.text = randomInt.toString()
    }
}