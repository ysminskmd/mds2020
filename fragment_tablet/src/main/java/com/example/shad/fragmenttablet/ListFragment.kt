package com.example.shad.fragmenttablet

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {

    private var listItemClickListener: ListItemClickListener? = null

    private lateinit var mData: IntArray

    internal interface ListItemClickListener {
        fun onListItemClick(position: Int)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            listItemClickListener = activity as ListItemClickListener?
        } catch (ignored: ClassCastException) {
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mData = arguments?.getIntArray(DATA_KEY) ?: IntArray(0)
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView =  inflater.inflate(R.layout.fragment_list, container, false)

        val recyclerView: RecyclerView = rootView.findViewById(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(activity)
        val dividerItemDecoration = DividerItemDecoration(recyclerView.context, layoutManager.orientation)
        recyclerView.addItemDecoration(dividerItemDecoration)
        recyclerView.setHasFixedSize(true)
        recyclerView.setLayoutManager(layoutManager)

        val listAdapter = ListAdapter(listItemClickListener, mData)
        recyclerView.setAdapter(listAdapter)

        return rootView
    }

    companion object {
        private const val DATA_KEY = "data"

        fun newInstance(data: IntArray): ListFragment {
            val args = Bundle()
            args.putIntArray(DATA_KEY, data)

            val fragment = ListFragment()
            fragment.arguments = args
            return fragment
        }
    }
}
