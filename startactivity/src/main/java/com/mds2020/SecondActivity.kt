package com.mds2020

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val data = intent.getStringExtra("data")
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show()

        //adb shell am start com.mds2020/.SecondActivity
    }

    fun clickButton(view: View) {
        Toast.makeText(this, this.localClassName, Toast.LENGTH_SHORT).show()
    }
}
