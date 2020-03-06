package com.example.shad.fragmentcreatelayout

import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), CustomFragment.CustomFragmentListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, CustomFragment.newInstance(5))
                .commit()
        }
    }

    override fun onResult(data: Int) {
        Toast.makeText(this, "onResult data = $data", Toast.LENGTH_SHORT).show()
    }
}
