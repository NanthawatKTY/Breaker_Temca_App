package com.example.breakertemcaapp.ui.conduit

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.breakertemcaapp.R
import kotlinx.android.synthetic.main.fragment_conduit.*

class ConduitFragment : Fragment(R.layout.fragment_conduit) {

//    private lateinit var conduitViewModel: ConduitViewModel
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ConduitAdapter.ViewHolder>? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvConduitLists.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ConduitAdapter()
        }

    }

}