package com.example.megaboss

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.megaboss.databinding.FragmentHomePageBinding

class homePage : Fragment() {
    private var _binding: FragmentHomePageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomePageBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.mtn.setOnClickListener {
            val goTo = Intent(requireContext(), MtnNetwork::class.java)
            activity?.startActivity(goTo)
        }
        binding.airtel.setOnClickListener {
            val goTo = Intent(requireContext(), AirtelNetwork::class.java)
            activity?.startActivity(goTo)
        }
        binding.glo.setOnClickListener {
            val goTo = Intent(requireContext(), MGloNetwork::class.java)
            activity?.startActivity(goTo)
        }
        binding.etisalat.setOnClickListener {
            val goTo = Intent(requireContext(), EtisalateNetwork::class.java)
            activity?.startActivity(goTo)
        }

return view
    }

}