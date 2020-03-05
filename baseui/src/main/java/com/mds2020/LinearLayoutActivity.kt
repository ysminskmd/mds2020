package com.mds2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LinearLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)
    }

    fun onFrameClicked(view: View) {
        val intent = Intent();
        intent.setClass(view.context, FrameLayoutActivity::class.java);
        startActivity(intent)
    }

    fun onRelativeClicked(view: View) {
        val intent = Intent();
        intent.setClass(view.context, RelativeLayoutActivity::class.java);
        startActivity(intent)
    }
}
