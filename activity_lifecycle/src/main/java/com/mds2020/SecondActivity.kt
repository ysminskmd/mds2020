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
        Log.d(MDS, "onCreate ${this.javaClass.simpleName} savedInstanceState = $savedInstanceState")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MDS, "onRestart ${this.javaClass.simpleName}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MDS, "onStart ${this.javaClass.simpleName}")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(MDS, "onRestoreInstanceState ${this.javaClass.simpleName} savedInstanceState = $savedInstanceState")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MDS, "onResume ${this.javaClass.simpleName}")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MDS, "onPause ${this.javaClass.simpleName}")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        //outState.putString("key", "value")
        super.onSaveInstanceState(outState)
        Log.d(MDS, "onSaveInstanceState ${this.javaClass.simpleName} savedInstanceState = $outState")


    }

    override fun onStop() {
        super.onStop()
        Log.d(MDS, "onStop ${this.javaClass.simpleName}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MDS, "onDestroy ${this.javaClass.simpleName}")
    }

    fun clickButton(view: View) {
        Toast.makeText(this, this.localClassName, Toast.LENGTH_SHORT).show()
    }
}
