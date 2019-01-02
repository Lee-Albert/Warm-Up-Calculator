package com.example.weightapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_3.*

class Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val actionbar = supportActionBar

        actionbar!!.title = "Activity3"

        actionbar.setDisplayHomeAsUpEnabled(true)

        Activity3Input.setOnEditorActionListener() { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                var WorkingWeight = Activity3Input.text.toString().toInt()

                var warmup1: TextView = findViewById(R.id.WarmUp1)
                var warmup2: TextView = findViewById(R.id.WarmUp2)
                var warmup3: TextView = findViewById(R.id.WarmUp3)
                var warmup4: TextView = findViewById(R.id.WarmUp4)
                var warmup5: TextView = findViewById(R.id.WarmUp5)

                warmup1.text = WorkingWeight.toString()
                warmup2.text = WorkingWeight.toString()
                warmup3.text = WorkingWeight.toString()
                warmup4.text = WorkingWeight.toString()
                warmup5.text = WorkingWeight.toString()

                true
            }
            false
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
