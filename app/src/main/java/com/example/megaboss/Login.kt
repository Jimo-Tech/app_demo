package com.example.megaboss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.megaboss.databinding.FragmentLoginBinding


class Login : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnSignIn.setOnClickListener {
            if (binding.userName.text.isEmpty() && binding.password.text.isEmpty()) {
                Toast.makeText(context, "Fields Required", Toast.LENGTH_SHORT).show()
            } else if (binding.userName.text.isNotEmpty() && binding.password.text.isNotEmpty())
                Navigation.findNavController(view).navigate(R.id.action_login_to_purchase)
        }
        binding.signup.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_login_to_signup)
        }
        return view
    }


}