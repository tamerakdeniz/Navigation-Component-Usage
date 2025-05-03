package com.example.navigationcomponentusage

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentusage.databinding.FragmentMainPageBinding

class MainPageFragment : Fragment() {
    private lateinit var binding: FragmentMainPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)

        binding.buttonDetail.setOnClickListener {
            val transition = MainPageFragmentDirections.detailTransition(message = "How are you feeling?", number = 23)
            Navigation.findNavController(it).navigate(transition)
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Uygulamayı çalıştırıdğınızda bir defa çalışır.
        Log.e("Life Cycle", "onCreate")
    }

    override fun onResume() {
        super.onResume()
        // Sayfa her göründüğünde çalışır
        //Bu sayfaya geri dönüşdüğünde çalışır.
        Log.e("Life Cycle", "onResume")

    }

    override fun onPause() {
        super.onPause()
        // Sayfa her görünmez olduğunda çalışır.
        Log.e("Life Cycle", "onPause")
    }
}