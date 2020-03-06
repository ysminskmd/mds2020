package com.mds2020

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val REQUEST_CODE: Int = 1000
    private val EXTRA_DATA: String = "extra_data";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button);
        button.setOnClickListener({
            val intent = Intent();
            intent.setClass(it.context, SecondActivity::class.java).apply {
                putExtra("data", "value")
            }
            startActivityForResult(intent, REQUEST_CODE)
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                val value = data?.getStringExtra(EXTRA_DATA)
                Toast.makeText(this, value, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
