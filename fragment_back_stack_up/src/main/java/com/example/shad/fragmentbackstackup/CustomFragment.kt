package com.example.shad.fragmentbackstackup

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CustomFragment : Fragment() {

    private var backgroundColor: Int = Color.BLACK
    private var number: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let { arguments ->
            backgroundColor = arguments.getInt(COLOR_KEY, backgroundColor)
            number = arguments.getInt(NUMBER_KEY, number)
        }

    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment, container, false)
        view.setBackgroundColor(backgroundColor)

        val numberText = view.findViewById<TextView>(R.id.number_text)
        numberText.text = number.toString()

        return view
    }

    companion object {

        private const val COLOR_KEY = "color"
        private const val NUMBER_KEY = "number"

        internal fun getInstance(color: Int, number: Int): CustomFragment {
            return CustomFragment().apply {
                val bundle = Bundle()
                bundle.putInt(COLOR_KEY, color)
                bundle.putInt(NUMBER_KEY, number)
                arguments = bundle
            }
        }
    }
}
