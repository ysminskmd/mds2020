package com.mds2020

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private val MDS: String = "MDS_LOG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(MDS, "onCreate $localClassName savedInstanceState = $savedInstanceState")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MDS, "onRestart $localClassName")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MDS, "onStart $localClassName")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(MDS, "onRestoreInstanceState $localClassName savedInstanceState = $savedInstanceState")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MDS, "onResume $localClassName")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MDS, "onPause $localClassName")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        //outState.putString("key", "value")
        super.onSaveInstanceState(outState)
        Log.d(MDS, "onSaveInstanceState $localClassName savedInstanceState = $outState")


    }

    override fun onStop() {
        super.onStop()
        Log.d(MDS, "onStop $localClassName")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MDS, "onDestroy $localClassName")
    }

    fun clickButton(view: View) {
        Toast.makeText(this, this.localClassName, Toast.LENGTH_SHORT).show()
    }
}
