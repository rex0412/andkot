package com.example.mycycle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.example.mycycle.databinding.ActivityTwoBinding

class TwoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TwoActivity", "onCreate")
        val binding = ActivityTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("TwoActivity", "onStart")
    }
    override fun onStop() {
        super.onStop()
        Log.d("TwoActivity", "onStop")
    }
    override fun onResume() {
        super.onResume()
        Log.d("TwoActivity", "onResume")
    }override fun onPause() {
        super.onPause()
        Log.d("TwoActivity", "onPause")
    }override fun onDestroy() {
        super.onDestroy()
        Log.d("TwoActivity", "onDestroy")
    }override fun onRestart() {
        super.onRestart()
        Log.d("TwoActivity", "onRestart")
    }
}
