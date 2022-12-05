package com.example.megaboss

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.megaboss.databinding.FragmentSignupBinding

class signup : Fragment() {
    private var _binding: FragmentSignupBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentSignupBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnSignUp.setOnClickListener {
            if (binding.user.text.isEmpty() && binding.email.text.isEmpty() && binding.fullName.text.isEmpty()
                && binding.phone.text.isEmpty() && binding.psw.text.isEmpty()){

                Toast.makeText(context, "Fill Up Fields", Toast.LENGTH_SHORT).show()
            } else{
                Navigation.findNavController(view).navigate(R.id.action_signup_to_purchase)
            }
        }

        binding.signin.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_signup_to_login)
        }
        return view
    }

}