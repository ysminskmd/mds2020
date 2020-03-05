package com.example.shad.fragmenttabs

import android.graphics.Color
import android.os.Bundle
import androidx.annotation.ColorInt
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var sectionsPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        sectionsPagerAdapter = ViewPagerAdapter(
                supportFragmentManager,
                generateColors()
        )

        // Set up the ViewPager with the sections adapter.
        container.adapter = sectionsPagerAdapter

        tab.setupWithViewPager(container)
    }

    private fun generateColors(): List<Int> {
        val rnd = Random()
        return (0..9).map { generateColor(rnd) }
    }

    @ColorInt
    private fun generateColor(rnd: Random) = Color.argb(
            255,
            rnd.nextInt(256),
            rnd.nextInt(256),
            rnd.nextInt(256)
    )
}
