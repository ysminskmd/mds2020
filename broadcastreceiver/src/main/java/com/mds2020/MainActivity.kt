package com.mds2020

import android.content.Intent
import android.content.IntentFilter
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var mMyReceiver: MyReceiver
    private val EXTRA_COUNT = 100
    private val EXTRA_DATA = "extra_data"
    private val ACTION = "com.mds2020.broadcastreceiver.action"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mMyReceiver = MyReceiver()

        val colorButton = findViewById<Button>(R.id.color_button)
        colorButton.setOnClickListener({
            colorButton.setBackgroundColor(Random.nextInt(Int.MIN_VALUE, Int.MAX_VALUE));
        })

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener({
            Intent().also { intent ->
                intent.setAction(ACTION)
                intent.putExtra(EXTRA_DATA, EXTRA_COUNT)
                sendBroadcast(intent)
            }
        })
    }

    override fun onResume() {
        super.onResume()
        val filter = IntentFilter(ACTION)
        registerReceiver(mMyReceiver, filter)
    }

    override fun onPause() {
        unregisterReceiver(mMyReceiver)
        super.onPause()
    }
}
