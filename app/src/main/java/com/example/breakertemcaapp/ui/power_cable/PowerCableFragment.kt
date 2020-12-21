package com.example.breakertemcaapp.ui.power_cable

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.breakertemcaapp.R

class PowerCableFragment : Fragment(R.layout.fragment_power_cable) {

    private lateinit var powerCableViewModel: PowerCableViewModel


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
//    override fun onCreateView(
//            inflater: LayoutInflater,
//            container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//        powerCableViewModel =
//                ViewModelProvider(this).get(PowerCableViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_power_cable, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
//        powerCableViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
//        return root
//    }
}