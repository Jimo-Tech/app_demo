package com.example.megaboss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.megaboss.databinding.FragmentSplashScreenBinding
import java.util.logging.Handler


class splashScreen : Fragment() {
private var _binding : FragmentSplashScreenBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
_binding = FragmentSplashScreenBinding.inflate(inflater,container,false)
        val view = binding.root

        android.os.Handler().postDelayed({
                Navigation.findNavController(view).navigate(R.id.action_splashScreen_to_first_Introduction)
        },5000)

        return view
    }


}