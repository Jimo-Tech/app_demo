package com.example.megaboss

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.megaboss.databinding.FragmentThirdBinding

class third : Fragment() {
    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.leftarrow.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_third_to_second)
        }
        binding.nextbutton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_third_to_login)
        }
        binding.skip.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_third_to_login)
        }





        return view
    }

}