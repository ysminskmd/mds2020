package com.example.shad.fragment_lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MDS_TAG"

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i(TAG, "onCreate ${this.javaClass.simpleName} savedInstanceState = $savedInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart ${this.javaClass.simpleName}")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume ${this.javaClass.simpleName}")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause ${this.javaClass.simpleName}")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop ${this.javaClass.simpleName}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy ${this.javaClass.simpleName}")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart ${this.javaClass.simpleName}")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState ${this.javaClass.simpleName} outState = $outState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState ${this.javaClass.simpleName} savedInstanceState = $savedInstanceState")
    }
}
