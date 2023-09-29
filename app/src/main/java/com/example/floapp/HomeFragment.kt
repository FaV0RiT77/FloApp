package com.example.floapp

import android.os.Bundle
import android.transition.Transition
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.transition.Slide
import com.example.floapp.databinding.FragmentHomeBinding

open class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

//        val inputNumber = requireArguments().getString("number")
//        val inputText = requireArguments().getString("text")

        binding.sendBtn.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_sentFragment)

        }

//        setHasOptionsMenu(true)


        return binding.root
    }

//    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//        return NavigationUI.onNavDestinationSelected(item!!,
//            requireView().findNavController())
//                || super.onOptionsItemSelected(item)
//    }




}