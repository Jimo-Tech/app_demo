package com.example.megaboss

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.megaboss.databinding.FragmentServicesBinding

class Services : Fragment() {
private var _binding : FragmentServicesBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentServicesBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.error.setOnClickListener {
            val goTo = Intent(requireContext(),user::class.java)
            activity?.startActivity(goTo)
        }


        return view
    }

}