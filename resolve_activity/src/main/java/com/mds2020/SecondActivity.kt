package com.mds2020

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private val EXTRA_DATA: String = "extra_data";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val data = intent.getStringExtra("data")
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show()

        //adb shell am start com.mds2020/.SecondActivity
    }

    fun clickButton(view: View) {
        val intent = Intent().putExtra(EXTRA_DATA, this.localClassName)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}
