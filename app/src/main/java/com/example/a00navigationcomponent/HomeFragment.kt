package com.example.a00navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        val navHost = childFragmentManager.findFragmentById(R.id.frag_home) as NavHostFragment
        view.findViewById<BottomNavigationView>(R.id.bottomNav).setupWithNavController(navHost.navController)
        return view
    }

}