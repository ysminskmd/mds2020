package com.example.shad.fragment_lifecycle

import android.content.Context
import android.content.Intent
import android.os.Bundle

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

private const val TAG = "MDS_TAG"

class SecondFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG, "onAttach ${this.javaClass.simpleName}")

        //Вызывается, когда фрагмент связывается с activity (ему передается объект Activity).
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate ${this.javaClass.simpleName}")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        //Вызывается для создания иерархии view, связанной с фрагментом.

        Log.i(TAG, "onCreateView ${this.javaClass.simpleName}")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(TAG, "onActivityCreated ${this.javaClass.simpleName}")

        //Вызывается, когда метод onCreate(), принадлежащий activity, возвращает управление.
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart ${this.javaClass.simpleName}")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume ${this.javaClass.simpleName}")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause ${this.javaClass.simpleName}")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop ${this.javaClass.simpleName}")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG, "onDestroyView ${this.javaClass.simpleName}")

        //Вызывается при удалении иерархии view, связанной с фрагментом.
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy ${this.javaClass.simpleName}")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "onDetach ${this.javaClass.simpleName}")

        //Вызывается при разрыве связи фрагмента с activity.
    }
}
