package com.example.a00navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        view.findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val email =  view.findViewById<TextView>(R.id.username).toString()
            val password =  view.findViewById<TextView>(R.id.password).toString()
            if(email.isNotEmpty() && password.isNotEmpty()){
                findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment)
            }

        }
        view.findViewById<Button>(R.id.btnRegister).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_registrationFragment)
        )
        return view
    }

}