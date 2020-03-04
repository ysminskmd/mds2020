package com.mds2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button);
        button.setOnClickListener({
            val intent = Intent();
            intent.setClass(it.context, SecondActivity::class.java).apply {
                putExtra("data", "value")
            }
            startActivity(intent)
        })
    }
}
