package com.example.megaboss

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.viewpager.widget.ViewPager
import com.afollestad.viewpagerdots.DotsIndicator
import com.example.megaboss.databinding.FragmentFirstIntroductionBinding


class First_Introduction : Fragment() {
private var _binding : FragmentFirstIntroductionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstIntroductionBinding.inflate(inflater,container,false)
        val view = binding.root

     binding.nextbutton.setOnClickListener {
         Navigation.findNavController(view).navigate(R.id.action_first_Introduction_to_second)
     }
        binding.skip.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_first_Introduction_to_login)
        }

return view
    }

}