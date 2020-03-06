package com.mds2020

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FrameLayoutActivity : AppCompatActivity() {

    private val drawables = intArrayOf(
        R.drawable.i1,
        R.drawable.i2,
        R.drawable.i3,
        R.drawable.i4,
        R.drawable.i5
    )

    private var mIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)

        val imageView = findViewById<ImageView>(R.id.image)
        fillImage(imageView)
    }

    fun fillImage(view: View) {
        if (view is ImageView) {
            val resId = drawables[mIndex]
            view.setImageResource(resId)
            mIndex = if (mIndex < drawables.size - 1) mIndex + 1 else 0
        }
    }
}
