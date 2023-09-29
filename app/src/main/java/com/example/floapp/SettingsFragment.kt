package com.example.floapp

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.floapp.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
    private lateinit var binding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings, container, false)

        val location = null // TODO
        binding.numberEt.setText("12345678")
        binding.messageEt.setText("Hey! I think someone is following me. Here is my location: $location")

        binding.saveBtn.setOnClickListener {
            if(!TextUtils.isEmpty(binding.numberEt.text.toString()) ||
                !TextUtils.isEmpty(binding.messageEt.text.toString())) {
                val bundle = bundleOf("number" to binding.numberEt.text.toString(), "text" to binding.messageEt.text.toString())

                it.findNavController().navigate(R.id.action_settingsFragment_to_homeFragment, bundle)
            } else {
                Toast.makeText(activity, "You have no data in one of the fields", Toast.LENGTH_SHORT).show()
            }
        }



        return binding.root
    }

}