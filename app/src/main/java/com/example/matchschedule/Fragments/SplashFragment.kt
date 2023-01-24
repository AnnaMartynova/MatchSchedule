package com.example.matchschedule.Fragments

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.matchschedule.R
import com.example.matchschedule.databinding.FragmentSplashBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SplashFragment : Fragment() {

    lateinit var binding: FragmentSplashBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false)


//        Handler(Looper.myLooper()!!).postDelayed({
//
//                                                 findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
//        },5000)
        CoroutineScope(Dispatchers.Main).launch {
            binding.progressBar.max = 1000
            val value = 900
            ObjectAnimator.ofInt(binding.progressBar,"progress",value).setDuration(2000).start()
        }

        return binding.root
    }
}