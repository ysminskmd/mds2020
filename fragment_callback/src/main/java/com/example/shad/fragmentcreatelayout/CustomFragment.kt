package com.example.shad.fragmentcreatelayout

import android.content.Context
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class CustomFragment : Fragment() {

    private var customFragmentListener: CustomFragmentListener? = null

    internal interface CustomFragmentListener {
        fun onResult(data: Int)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            customFragmentListener = activity as CustomFragmentListener?
        } catch (ignored: ClassCastException) {
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment, container, false)

        val data = arguments?.getInt(DATA_KEY) ?: 0
        customFragmentListener?.onResult(data)

        return rootView
    }

    companion object {
        private const val DATA_KEY = "data"

        fun newInstance(data: Int): CustomFragment {
            val args = Bundle()
            args.putInt(DATA_KEY, data)

            val fragment = CustomFragment()
            fragment.arguments = args
            return fragment
        }
    }
}
