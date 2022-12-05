package com.example.megaboss

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.megaboss.databinding.FragmentSecondBinding

class second : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.skip.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_second_to_login)
        }
        binding.leftarrow.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_second_to_third)
        }
        binding.nextbutton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_second_to_third)
        }
        return view
    }

}