package com.mds2020

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val EXTRA_DATA = "extra_data"
    private val EXTRA_COUNT = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorButton = findViewById<Button>(R.id.color_button)
        colorButton.setOnClickListener({
            colorButton.setBackgroundColor(Random.nextInt(Int.MIN_VALUE, Int.MAX_VALUE));
        })

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener({
            for (i in 1..100) {
                Thread.sleep(1000)
                Log.d("MDS", "i = $i")
            }
        })
    }

    /*val intent = Intent()
    //val intent = Intent(it.context, MyIntentService::class.java)
    intent.putExtra(EXTRA_DATA, EXTRA_COUNT);
    startService(intent);*/
}
