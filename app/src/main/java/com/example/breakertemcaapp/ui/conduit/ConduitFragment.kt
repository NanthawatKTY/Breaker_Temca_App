package com.example.breakertemcaapp.ui.conduit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.breakertemcaapp.R

class ConduitFragment : Fragment(R.layout.fragment_conduit) {

    private lateinit var conduitViewModel: ConduitViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

//    override fun onCreateView(
//            inflater: LayoutInflater,
//            container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//        conduitViewModel =
//                ViewModelProvider(this).get(ConduitViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_conduit, container, false)
//        val textView: TextView = root.findViewById(R.id.text_dashboard)
//        conduitViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
//        return root
//    }
}