package com.example.tro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var observer: Observer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observer = Observer()
        lifecycle.addObserver(observer)
    }
    fun toastMe (view: View) {
        val myToast = Toast.makeText(this, "Test Toast message!", Toast.LENGTH_LONG)
        myToast.show()
    }

    fun counterPP(view: View) {
        val v = findViewById<TextView>(R.id.textView2)
        val cntStr = v.text.toString()
        var cnt: Int = Integer.parseInt(cntStr)
        cnt++
        v.text = cnt.toString()
    }

    fun randNum (view: View) {
        var rndIntent = Intent(this,numbers::class.java)
        val v = findViewById<TextView>(R.id.textView2)
        val cntStr = v.text.toString()
        val cnt = Integer.parseInt(cntStr)

        rndIntent.putExtra(numbers.TOTAL_CNT, cnt)
        startActivity(rndIntent)
    }
}