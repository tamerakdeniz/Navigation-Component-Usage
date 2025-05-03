package com.example.navigationcomponentusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.navigationcomponentusage.databinding.FragmentBottomSheetBinding
import com.example.navigationcomponentusage.databinding.FragmentSettingsBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentBottomSheetBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomSheetBinding.inflate(inflater, container, false)

        binding.imageViewTest.setOnClickListener {
            Toast.makeText(requireContext(),"Clicked Picture",Toast.LENGTH_SHORT).show()
        }



        return binding.root
    }

}