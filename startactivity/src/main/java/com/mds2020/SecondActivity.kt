package com.mds2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

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
