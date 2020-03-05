package com.mds2020

import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RelativeLayoutActivity : AppCompatActivity() {

    private var mAges: Spinner? = null
    private var mName: TextView? = null
    private var mSpinner: Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
        mName = findViewById(R.id.name)
        mSpinner = findViewById(R.id.cities)
        mAges = findViewById(R.id.ages)
    }

    fun clickButton(view: View?) {
        val age = mAges!!.selectedItem.toString()
        val city = mSpinner!!.selectedItem.toString()
        val name = mName!!.text.toString()
        Toast.makeText(
            this,
            "Name = $name, city = $city, age = $age",
            Toast.LENGTH_SHORT
        ).show()
    }
}
