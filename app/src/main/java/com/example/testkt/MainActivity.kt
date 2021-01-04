package com.example.testkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var msg: String = "Hello world"
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        main1()
    }

    fun main1() {
        var point = Point(10, index)
        Test(true)
    }
}