package com.albert.weightapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button1.setOnClickListener{
            val intent = Intent(this, BenchActivity::class.java)
            startActivity(intent)
        }
        Button2.setOnClickListener{
            val intent = Intent(this, SquatActivity::class.java)
            startActivity(intent)
        }
        Button3.setOnClickListener{
            val intent = Intent(this, OHPActivity::class.java)
            startActivity(intent)
        }
        Button4.setOnClickListener{
            val intent = Intent(this, DeadliftActivity::class.java)
            startActivity(intent)
        }
        Button5.setOnClickListener{
            val intent = Intent(this, BarbellRowActivity::class.java)
            startActivity(intent)
        }
    }
}
