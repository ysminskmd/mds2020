package com.mds2020

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    private val EXTRA_DATA = "extra_data"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ResultProfileBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        setContentView(R.layout.activity_third)

        val button = findViewById<View>(R.id.button)
        //binding.button.setOnClickListener {
        button?.setOnClickListener {
            val intent = Intent().putExtra(EXTRA_DATA, this.localClassName)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}
