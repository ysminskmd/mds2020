package com.mds2020

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

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
