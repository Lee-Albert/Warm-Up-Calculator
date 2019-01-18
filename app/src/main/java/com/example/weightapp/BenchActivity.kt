package com.albert.weightapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import kotlinx.android.synthetic.main.bench.*
import WeightAppUtil.PlatesPerSide
import WeightAppUtil.WeightRounder
import kotlin.text.trim

class BenchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bench)

        val actionbar = supportActionBar

        actionbar!!.title = "Bench"

        actionbar.setDisplayHomeAsUpEnabled(true)

        Activity2Input.setOnEditorActionListener() { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                var WorkingWeight = Activity2Input.text.toString().toFloat()

                var warmup1: TextView = findViewById(R.id.WarmUp1)
                var warmup2: TextView = findViewById(R.id.WarmUp2)
                var warmup3: TextView = findViewById(R.id.WarmUp3)
                var warmup4: TextView = findViewById(R.id.WarmUp4)
                var warmup5: TextView = findViewById(R.id.WarmUp5)

                warmup1.text = "1x10 45 (None)"
                warmup2.text = "1x5 " + WeightRounder((WorkingWeight * 0.5).toFloat()).toInt().toString() + " ("+ PlatesPerSide(WeightRounder((WorkingWeight * 0.5).toFloat())).trim() + ")"
                warmup3.text = "1x3 " + WeightRounder((WorkingWeight * 0.7).toFloat()).toInt().toString() + " ("+ PlatesPerSide(WeightRounder((WorkingWeight * 0.7).toFloat())).trim() + ")"
                warmup4.text = "1x1 " + WeightRounder((WorkingWeight * 0.9).toFloat()).toInt().toString() + " ("+ PlatesPerSide(WeightRounder((WorkingWeight * 0.9).toFloat())).trim() + ")"
                warmup5.text = "3x5 " + WeightRounder(WorkingWeight).toInt().toString() + " ("+ PlatesPerSide(WeightRounder(WorkingWeight)).trim() + ")"

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
