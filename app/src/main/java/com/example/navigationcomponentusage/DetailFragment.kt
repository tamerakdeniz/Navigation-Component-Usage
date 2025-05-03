package com.example.navigationcomponentusage

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentusage.databinding.FragmentDetailBinding
import com.example.navigationcomponentusage.databinding.FragmentMainPageBinding

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentDetailBinding.inflate(inflater, container, false)

        val bundle:DetailFragmentArgs by navArgs()
        val incomingMessage = bundle.message
        val incomingNumber = bundle.number

        binding.textViewResult.text = "$incomingMessage - $incomingNumber"

        val backButton = object :  OnBackPressedCallback(true) { //true : geri dönüş aktif değil
            override fun handleOnBackPressed() {
                Log.e("Detail Page", "Back Button worked.")
                isEnabled = false
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backButton)

        return binding.root
    }
}