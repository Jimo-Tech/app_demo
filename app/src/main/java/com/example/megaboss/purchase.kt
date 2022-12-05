package com.example.megaboss

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.megaboss.databinding.FragmentPurchaseBinding


class purchase : Fragment() {
private var _binding : FragmentPurchaseBinding?  = null
private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPurchaseBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.btnSignPurchase.setOnClickListener {
            val goTo = Intent(requireContext(),Home::class.java)
            activity?.startActivity(goTo)
        }
      return view
    }

}