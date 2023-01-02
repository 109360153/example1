package com.example.example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generateNextNumber(v: View){
        val number1 = findViewById<TextView>(R.id.number1)
        // number1.text = "8"
        val num = Random.nextInt(10,20)
        number1.text = num.toString()
    }
}