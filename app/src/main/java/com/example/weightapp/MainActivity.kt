package com.example.weightapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button1.setOnClickListener{
            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }
        Button2.setOnClickListener{
            val intent = Intent(this,Activity3::class.java)
            startActivity(intent)
        }
    }
}
