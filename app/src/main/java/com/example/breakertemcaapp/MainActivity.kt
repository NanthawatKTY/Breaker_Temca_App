package com.example.breakertemcaapp

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.breakertemcaapp.ui.conduit.ConduitAdapter
import com.example.breakertemcaapp.ui.conduit.ConduitCable
import kotlinx.android.synthetic.main.fragment_conduit.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)

//        var conduitsItemLists = mutableListOf(
//                ConduitCable("Type Size Amount 1", false),
//                ConduitCable("Type Size Amount 2", false),
//                ConduitCable("Type Size Amount 3", false),
//                ConduitCable("Type Size Amount 4", false),
//                ConduitCable("Type Size Amount 5", false),
//                ConduitCable("Type Size Amount 6", false),
//        )
//
//        val adapterConduits = ConduitAdapter(conduitsItemLists)
//        rvConduitLists.adapter = adapterConduits
//        rvConduitLists.layoutManager = LinearLayoutManager(this)
   }
}