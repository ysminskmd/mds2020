package com.example.shad.fragmenttablet

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

internal class ListHolder(view: View) : RecyclerView.ViewHolder(view) {
    val image: View = view.findViewById(R.id.image)
    val title: TextView = view.findViewById(R.id.title)
}
